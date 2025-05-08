package CreationalPattern.Singleton;

public class BillPughSingletonTest {
    public static void main(String[] args) {
        BillPughSingleton obj1 = BillPughSingleton.getBillPughInstance();
        BillPughSingleton obj2 = BillPughSingleton.getBillPughInstance();
        System.out.println(obj1 == obj2);
    }
}
