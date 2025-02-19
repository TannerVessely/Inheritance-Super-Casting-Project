abstract class Driving {
    String vehicleType;
    int maxSpeed;

   
    public Driving(String v, int m) {
        vehicleType = v;
        maxSpeed = m;
    }
 public abstract void drive();

    public void startCar() {
        System.out.println("The engine is starting...");
    }

 
    public void displayInfo() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
