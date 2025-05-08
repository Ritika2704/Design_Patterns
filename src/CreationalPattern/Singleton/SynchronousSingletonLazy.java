package CreationalPattern.Singleton;

public class SynchronousSingletonLazy {
    private static SynchronousSingletonLazy instance;

    private SynchronousSingletonLazy(){

    }

    public static SynchronousSingletonLazy getInstance() {
        // This ensures only one thread at a time can enter this block — critical for thread-safety.
        synchronized(SynchronousSingletonLazy.class){
        if(instance == null){
            instance = new SynchronousSingletonLazy();
        }}
        return instance;
    }
}
