/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Statistics;
import java.lang.*;
/**
 *
 * @author dominque
 */
public class DiscreteProbability 
{
    
    public static double StandardDeviation(double variance)
    {
        return Math.sqrt(variance);
    }
    
    public static double bionmial(int n, int k) 
    {
        double result = 1;
        for (int i = 1; i < k; i++) 
        {
            result *= (n - i + 1) / i;
        }
        return result;

    }
    
}
