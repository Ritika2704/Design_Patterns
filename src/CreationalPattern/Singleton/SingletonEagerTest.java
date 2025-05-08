package CreationalPattern.Singleton;

public class SingletonEagerTest {
    public static void main(String[] args) {
        SingletonEager eagerInstance1 = SingletonEager.getEagerInstance();
        SingletonEager eagerInstance2 = SingletonEager.getEagerInstance();

        System.out.println(eagerInstance1);
        System.out.println(eagerInstance2);

        System.out.println(eagerInstance1 == eagerInstance2);

        //CreationalPattern.Singleton.SingletonEager@5f184fc6
        //CreationalPattern.Singleton.SingletonEager@5f184fc6

        //here we can see we have created same instances so that means whatever resources we are trying to use here in our
        // singleton instance, that instance is going to be the same no matter how many times we access it.
    }}
