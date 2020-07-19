public class Boat implements Morable{
    private int weightInTons;

    public int getWeightInTons() {
        return weightInTons;
    }

    public Boat(int weightInTons) {
        this.weightInTons = weightInTons;
    }

    @Override
    public void moor() {
        
    }

}
