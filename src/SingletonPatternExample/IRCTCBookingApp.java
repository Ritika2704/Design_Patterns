package SingletonPatternExample;

public class IRCTCBookingApp {
    public static void main(String[] args) {
        // Step 1: Users request the Singleton instance
        IRCTCConnectionManager connection1 = IRCTCConnectionManager.getInstance();
        IRCTCConnectionManager connection2 = IRCTCConnectionManager.getInstance();

        // Step 2: Check if both instances are the same
        System.out.println("Are both connections the same? " + (connection1 == connection2));  // Should print 'true'

        // Step 3: Booking tickets using the singleton instance
        connection1.bookTicket("12345", "Ritika");
        connection2.bookTicket("67890", "Amit");
    }
}
