
/**
 * Need to find all multiples of 3 and 5 between 0-1000
 *
 * @author Christopher Lewis
 * @version 1
 */
public class Problem1
{
    public void MultiplesOf3_5()
    {
        System.out.println("Multiples of 3");
        for(int x=0; x<=1000;x++)
        {
            if(x % 3 == 0) //if there is no remainder
                System.out.println(x);
        }
        System.out.println("Multiples of 5");
        for(int x=0; x<=1000;x++)
        {
            if(x % 5 == 0) //if there is no remainder
                System.out.println(x);
        }
    }
}
