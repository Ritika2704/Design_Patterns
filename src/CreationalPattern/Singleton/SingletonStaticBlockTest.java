package CreationalPattern.Singleton;

public class SingletonStaticBlockTest {
    public static void main(String[] args) {
        SingletonStaticBlock obj1 = SingletonStaticBlock.getStaticInstance();
        SingletonStaticBlock obj2 = SingletonStaticBlock.getStaticInstance();

        System.out.println(obj1 == obj2);
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
