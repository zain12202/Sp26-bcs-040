public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("BUS-101", 3);
        System.out.println("Bus Number: BUS-101");
        System.out.println("Initial Seating Arrangement:");
        bus.SeatsDisplay();
        bus.isAvailable();
        
 
        bus.reservedSeat(2);
        bus.reservedSeat(6);
        bus.reservedSeat(11);
        bus.reservedSeat(6);
 
        System.out.println("Updated Seating Arrangement:");
        bus.SeatsDisplay();
        bus.isAvailable();

        Bus defaultBus = new Bus();
        System.out.println("Default Bus:");
        defaultBus.SeatsDisplay();
        defaultBus.isAvailable();

 

    }
}
