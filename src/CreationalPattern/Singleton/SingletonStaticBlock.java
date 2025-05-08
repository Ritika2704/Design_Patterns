package CreationalPattern.Singleton;

public class SingletonStaticBlock {
    private static SingletonStaticBlock staticInstance;

    //This is a static block, executed once when the class is loaded.
    //The singleton instance is created here.
    //This is similar to eager initialization, but in a static block, which allows:
    //More complex logic.
    //Exception handling (if needed).
    //The instance is created when the class is loaded, regardless of whether it's used later.
    static {
        staticInstance = new SingletonStaticBlock();
    }
    private SingletonStaticBlock(){

    }
    public static SingletonStaticBlock getStaticInstance(){
        return staticInstance;
    }
}

//Drawbacks (Same as Eager Initialization)
//Memory waste if the instance is never used.
//No lazy loading
//May lead to early failures if constructor logic fails.

//Difference from Eager Initialization
//Both initialize the instance at class loading time.
//Static block allows:
//Complex initialization
//Exception handling (e.g., try-catch)
