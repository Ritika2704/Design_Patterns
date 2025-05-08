package CreationalPattern.Singleton;

public class BillPughSingleton {
    // Private constructor to prevent instantiation
    private BillPughSingleton(){
    }
    // Static inner class - loaded only when getInstance() is called
    //This ensures lazy loading without using synchronized blocks or volatile.
    private static class BillPughHelper{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    // Global access method
    public static BillPughSingleton getBillPughInstance() {
        return BillPughHelper.instance;
    }
}
