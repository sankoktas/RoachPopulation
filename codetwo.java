public class RoachSimulation
{
    public static void main(String[] args){
        RoachPopulation pop = new RoachPopulation(10);
        System.out.println("Pop. at the beginning: " + pop.getRoaches());  
        pop.breed(); pop.spray(10);
        System.out.println("Pop. after first wave: " + pop.getRoaches());
        pop.breed(); pop.spray(10);
        System.out.println("Pop. after second wave: " + pop.getRoaches());
        pop.breed(); pop.spray(10);
        System.out.println("Pop. after second wave: " + pop.getRoaches());
    }
}
