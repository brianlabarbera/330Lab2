//Task 1
public class Vehicle {
    private String brand;
    private int year;

    public Vehicle() {
        brand = " ";
        year = 0;
    }

   public void start() {

       System.out.println("Vehicle started.");
    }

    //Task 4

    public Vehicle(String brand, int year) {

        this.brand = brand;
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    public Car() {
        super();
    }
    public Car(String brand, int year) {
        super(brand, year);
    }

}

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    public Motorcycle() {
        super();
    }
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

}

//Task 5
class Bicycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle started");
    }

    public Bicycle() {
        super();
    }
    public Bicycle(String brand, int year) {
        super(brand, year);
    }
}