package CreationalPattern.Singleton;

public class SingletonLazy {
    private static SingletonLazy lazyInstance;

    private SingletonLazy(){

    }
    public static SingletonLazy getLazyInstance(){
        if(lazyInstance == null){
            lazyInstance = new SingletonLazy();
        }
        return lazyInstance;
    }
}
//Lazy initialization logic:
//Checks if lazyInstance is null.
//If yes, creates a new instance.
//Otherwise, returns the already created instance.
// This ensures the object is only created when it’s needed, not at class load time.