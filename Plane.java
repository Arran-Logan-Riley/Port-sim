public class Plane implements Flyable{
    private int speed;
    private int string;

    public Plane(int speed) { //set the speed
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() { //get the speed
        return speed;
    }


    @Override
    public void fly() {

    }
}
