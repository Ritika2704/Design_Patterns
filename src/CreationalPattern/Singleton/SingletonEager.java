package CreationalPattern.Singleton;

//
public class SingletonEager {

    //In eager initialization, the instance of the class is created at the time of class loading, not on the first call.
    //static: so that it belongs to the class and not to any object. This means it gets loaded once when the class is loaded into memory.
    //SingletonEager eagerInstance = new SingletonEager();: Here the instance is created immediately (eagerly) when the class is loaded.
    private static  SingletonEager eagerInstance = new SingletonEager();

    //At this point, the object is created and stored in memory, even if it's not used later. This is why it's called eager initialization.

    private SingletonEager(){

    }
//    This is the private constructor of the class.
//    Making it private ensures that no other class can instantiate this class using new SingletonEager().
//    This is crucial for Singleton: You restrict object creation from outside the class.


//    static: it can be called without creating an object (e.g., SingletonEager.getEagerInstance()).
//    It returns the already-created singleton instance (eagerInstance).
    public  static SingletonEager getEagerInstance(){
        return eagerInstance;
    }
}

//drawbacks
// 1) Resource Wastage
//Instance is created whether you need it or not.
//If the singleton object is heavy (e.g., holds a DB connection, big cache, or configuration loader), it may consume memory or resources unnecessarily.

//2. Lack of Lazy Loading
//You lose control over when the instance is created.
//In some applications (like web apps or microservices), you might want the object to be initialized only
// when it’s first needed to reduce startup time or memory usage.

//3. Initialization Order Issues
//If the singleton relies on external configuration or other classes that are not yet initialized during class loading, you might run into nulls or misconfigurations.
//Example: If it reads config from a file, and that file path isn’t set yet, you’ll get errors at startup.

//4. Not Ideal for Exception Handling
//If object creation throws an exception (e.g., file not found, DB unavailable), you’ll get that at class loading time, which can crash the application early.
//You have less flexibility to handle such exceptions gracefully.

//When Is Eager Singleton Acceptable?
//The object is lightweight.
//It’s guaranteed to be used.
//Early instantiation is not a problem.
//Application startup performance isn’t critical.