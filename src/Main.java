// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Task 2
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle vehicle = new Vehicle();

        Vehicle bicycle = new Bicycle(); //Task 5

        car.start();
        System.out.println(" ");
        motorcycle.start();
        System.out.println(" ");
        vehicle.start();
        System.out.println(" ");

        //Task 3
        Vehicle[] arr = {car, bicycle, motorcycle, vehicle, bicycle, motorcycle, car, vehicle};

        for (Vehicle a : arr) {

            a.start();
            System.out.println(" ");

        }

        //Task 4

        Vehicle car1 = new Car("Lexus", 2000);

        printVehicleInfo(car1);

    }

    //Task 4
    public static void printVehicleInfo(Vehicle vehicle) {

        System.out.println("Brand is " + vehicle.getBrand());
        System.out.println("Year is " + vehicle.getYear());
    }

}

