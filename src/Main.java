
public class Main {

    public static void main(String[] args) {
        // write here test code 
        Reformatory nyc = new Reformatory();
        Person mike = new Person("Mike", 33, 176, 85);
        System.out.println("Mike's weight is: " + nyc.weight(mike) + " kilos");
        
        nyc.feed(mike);
        nyc.feed(mike);
        
         System.out.println("Mike's weight is: " + nyc.weight(mike) + " kilos");
         System.out.println("Total weights measured were...: " + nyc.totalWeightsMeasured());
    } 
}
