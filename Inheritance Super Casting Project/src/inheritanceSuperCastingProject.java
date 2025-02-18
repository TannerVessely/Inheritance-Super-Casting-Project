class driving {
  
    String vehicleType;
    int maxSpeed;


    public driving(String v, int m) {
        vehicleType = v;
        maxSpeed = m;
    }


    public void startCar() {
        System.out.println("The engine is starting...");
    }
  public  void drive();

  public void displayInfo() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
