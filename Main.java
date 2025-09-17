public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        System.out.println(f);
        System.out.println("Current Food: " + f.getCurrentFood());
        f.simulateOneDay(12);
        System.out.println("Current Food: " + f.getCurrentFood());
        f = new Feeder(1000);
        f.simulateOneDay(22);
        System.out.println("Current Food: " + f.getCurrentFood());
        f = new Feeder(2400);
        System.out.println(f.simulateManyDays(10,4)+ " days");
    }
}