public class Submarine extends Boat implements Submercable {
    private int depth;

    //dosnt need a private int because it extends from boat
    public Submarine(int depth, int weightInTons) {
        super(weightInTons);
        this.depth = depth;
    }

    @Override
    public int getDepth() {
        return this.depth;
    }

    @Override
    public boolean isSubmercible() {
        return false;
    }
}
