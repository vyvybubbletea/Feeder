public class  Feeder {

    /**
     * The amount of food, in grams, currently in the bird feeder; initialized
     * in the constructor and always greater than or equal to zero
     */
    private int currentFood;
    public Feeder (int food)
    {
        currentFood = food;
    }
    public int getCurrentFood()
    {
        return currentFood;
    }
    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird
     * feeder, as described in part (a) Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds)
    {
        if(Math.random() < 0.05) currentFood = 0;
        else
        {
            Feeder f = new Feeder(500);
            System.out.println(f);
            System.out.println(f.getCurrentFood());
            f.simulateOneDay(12);
            System.out.println(f.getCurrentFood());
            f = new Feeder(1000);
            f.simulateOneDay(22);
            System.out.println(f.getCurrentFood());
        }
    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) 
    {
        if(Math.random() < 0.05) currentFood = 0;
        {
            int eaten = (int) (Math.random() * 41) + 10;
            eaten *= numBirds;
            currentFood -= eaten;
            if (currentFood < 0) currentFood = 0;
        }
        return 0;
    }
}
