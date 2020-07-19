public class Main {
    //polymorphism (left is what it is, right its mold)
    //inhertance (a sedan is a car by inhertance)


    static Boat boat1 = new Boat(280);//3 boats
    static Boat boat2 = new Boat(450); //3 boats
    static Boat boat3 = new Boat(10);//3 boats
    static Submarine sub1 = new Submarine(0,100);

    //create a sea plane
    static SeaPlane seaPlane1 = new SeaPlane("black",10);

    //create the pair
    static Pier thePair = new Pier(80,80);


    public static void main(String[] args) { //must create main to act on the object because above only initilizes the class
        thePair.HostACraft(boat1);
        thePair.HostACraft(boat2);
        thePair.HostACraft(boat3);
        thePair.HostACraft(seaPlane1);
        thePair.HostACraft(sub1);
        System.out.println("The amount of billards left are: " + thePair.getAmoutOfBillards());
        System.out.println("The amount of military billards left are: " + thePair.getAmoutOfMilitaryBilards());
    }
}
