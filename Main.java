public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        System.out.println(f);
        f = new Feeder(250);
        System.out.println(f.simulateManyDays(10,5)+ " day(s)");        f = new Feeder(0);
        f = new Feeder(0);
        System.out.println(f.simulateManyDays(5,10)+ " day(s)");
    }
}