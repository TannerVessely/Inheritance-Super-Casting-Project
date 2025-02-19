class StreetRacing extends Driving {

  
    public StreetRacing(String v, int m) {
        super(v, m);
    }

    public void drive() {
        System.out.println("Street racing at full speed!");
    }

    public void superFast() {
        System.out.println("Activating superspeed");
    }
}
