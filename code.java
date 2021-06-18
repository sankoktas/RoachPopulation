public class RoachPopulation
{
    double pop = 0;  

    public RoachPopulation(float intSize)
    {
        pop = intSize; 
    }

    public void spray(double percent)
    {
        double sizePercent = pop/percent;  
        pop = pop - sizePercent;  
    }

    public double getRoaches()
    {
        return pop;  
    }
    
    public void breed ()
    {
        pop *= pop; 
    }

}
