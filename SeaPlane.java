public class SeaPlane extends Plane implements Morable {
    private String color;

    public SeaPlane(String color, int speed) {
        super(speed);//if you refernce a constructor super must be first
        this.color = color;
    }

    @Override
    public void moor() { //allows the sea plane to moor

    }

    @Override
    public void fly() { //allows the sea plane to fly

    }
}
