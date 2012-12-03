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
public class HypoTestOneSample 
{
    public static double LeftEndPoint(double s, double value,double leftend )
    {
        return (s - 1) * (value) * (value) / (leftend);
     
    }
    
    public static double RightEndPoint(double s, double value,double rightend )
    {
        return (s - 1) * (value) * (value) / (rightend);
       
    }
   
    public static double ConfiLeftEndPoint(double s, double value, double leftend)
    {
           return Math.sqrt((s - 1) * (value) * (value) / (leftend));
    }
    
    public static double ConfiRightEndPoint(double s, double value, double rightend)
    {
           return Math.sqrt((s - 1) * (value) * (value) / (rightend));
    }
   
    public static double P_Test(double value, double mean, double sample, double n)
    {
        return (value - mean) / (sample / Math.sqrt(n));
    }
    
    public static double T_Test(double value, double mean, double sample, double n)
    {
        return (value - mean) / (sample / Math.sqrt(n));
    }
   
    public static double ProportionTest(double value1, double value2, double p, double q, double n)
    {
        return (value1 - value2) / Math.sqrt((p*q) / n);
    }
  
    public static double zTest(double x, double n, double p, double q)
    {
        return (x / n - p) / Math.sqrt(p*q / n);
    }
   
    public static double PopulationVarianceTest(double n, double s, double value)
    {
        return (n - 1)  * (s) / value;
        
    }
    
}
