package SingletonPatternExample;

public class IRCTCConnectionManager {


    // Step 1: Create a private static instance variable
    private static volatile IRCTCConnectionManager instance;

    // Step 2: Private constructor to prevent external instantiation
    private IRCTCConnectionManager() {
        System.out.println("Initializing IRCTC Connection Manager...");
    }

    // Step 3: Public method to provide a single instance (Double-Checked Locking)
    public static IRCTCConnectionManager getInstance() {
        if (instance == null) {  // First check - If instance is null
            synchronized (IRCTCConnectionManager.class) {  // Thread safety
                if (instance == null) {  // Second check - Ensure only one instance is created
                    instance = new IRCTCConnectionManager();
                }
            }
        }
        return instance;
    }

    // Step 4: Business method to book tickets
    public void bookTicket(String trainNo, String passengerName) {
        System.out.println("Booking ticket for Train No: " + trainNo + " | Passenger: " + passengerName);
    }
}
//
//🟢 Understanding the Problem: Why Do We Need a Singleton?
//Imagine IRCTC's ticket booking system where:
//
//Thousands of users try to book tickets simultaneously.
//
//A database connection is required for every booking.
//
//If each request creates a new database connection, the system will slow down and crash.
//
//💡 Solution: Use Singleton
//Create only one instance of the connection manager.
//
//All booking requests share the same instance, reducing system load.
//
//Ensure thread safety so that multiple users don't cause data inconsistency.
