// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(12,15);
        Vehicle vehicle =  new Vehicle(70,4500,Status.AVAILABLE);
        Vehicle vehicle1 = new Vehicle(502,5600,Status.RESERVED);
        Vehicle vehicle2 = new Vehicle(892,1050,Status.AVAILABLE);
        UberManagement.addVehicle(vehicle);
        UberManagement.addVehicle(vehicle1);
        UberManagement.addVehicle(vehicle2);

        System.out.println(UberManagement.nearest(passenger));



    }
}