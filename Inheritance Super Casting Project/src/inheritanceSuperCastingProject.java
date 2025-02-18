// Abstract class driving
abstract class driving {
    // Instance variables
    String vehicleType;
    int maxSpeed;


    public driving(String vehicleType, int maxSpeed) {
        this.vehicleType = vehicleType;
        this.maxSpeed = maxSpeed;
    }


    public void startEngine() {
        System.out.println("The engine is starting...");
    }
  public abstract void drive();

  public void displayInfo() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
