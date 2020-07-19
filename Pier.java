import java.util.ArrayList;
import java.util.List;
public class Pier {
    private int amoutOfBillards;
    private int amoutOfMilitaryBilards;
    /**
     * A list that containes classes that implement {@see Morable}
     */
    private List<Morable> places = new ArrayList<>(); //create the list
    private List<Morable> MilitaryBase = new ArrayList<>();

    public Pier(int amoutOfBillards, int amoutOfMilitaryBilards) {
        this.amoutOfBillards = amoutOfBillards;
        this.amoutOfMilitaryBilards = amoutOfMilitaryBilards;
    }

    public void HostACraft(Morable morable) {
        if (morable instanceof Submarine) {

            if (morable instanceof SeaPlane) { //if the object is a seaplane take away 1 billard and add it to the

                int speed = ((SeaPlane)morable).getSpeed();
                if(speed >10){
                    System.out.println("you are too fast");
                }else{
                    amoutOfBillards -= 1;
                    places.add(morable);
                    System.out.println("landing was sucessful");
                }

            } else if (morable instanceof Boat) { //if its a boat, take away billards and add it to the places
                int weight = ((Boat) morable).getWeightInTons(); //get the weight of the boat object

                amoutOfBillards -= weight / 10;                   //get the ^ and divided it by 10 and take that away from amoutof billards
                places.add(morable);                              //add the boat to places

            } else if (morable instanceof Submarine) {
                int depthh = ((Submarine) morable).getDepth();
                if (depthh == 0) {
                    amoutOfMilitaryBilards -= 45;
                    MilitaryBase.add(morable);
                    System.out.println("Sub has docked");

                } else {
                    amoutOfMilitaryBilards -= 0;
                    System.out.println("submarine is still submersed");
                }
            }
        }
        ;
    }

    public int getAmoutOfBillards() {
        return amoutOfBillards;
    }

    public int getAmoutOfMilitaryBilards() {
        return amoutOfMilitaryBilards;
    }
}
