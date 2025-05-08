package CreationalPattern.Singleton;

public class SynchronousSingletonLazyTest {
    public static void main(String[] args) {
        SynchronousSingletonLazy obj1 = SynchronousSingletonLazy.getInstance();
        SynchronousSingletonLazy obj2 = SynchronousSingletonLazy.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
