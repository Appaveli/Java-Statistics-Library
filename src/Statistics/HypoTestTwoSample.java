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
public class HypoTestTwoSample 
{
    public static double Chi_SquaureTestVariance(double n, double s, double a)
    {
        return (n - 1) * s / a;
    }
   
    public static double Chi_SquaureTestStandard_Dev(double n, double s, double a)
    {
        return (n - 1) * (s *s) / (a * a);
    }
   
    public static double zTest_StandardError(double s1, double s2, double n1, double n2)
    {
        return Math.sqrt(s1 * s1/ n1 + s2 * s2 / n2);
    }
    
    public static double zTest_Mean_Difference(double d, double m, double sd, double n)
    {
        return (d - m) / sd * Math.sqrt(n);
    }
    
    public static double zTest_Difference_Proportions(double p1, double p2, double p, double q, double n1, double n2)
    {
        return ((p1 - p2) - 0) / Math.sqrt((p * q) *(1 / n1 + 1 / n2));
    }
     
     public static double Population_Proportion(double x1, double x2, double n1, double n2)
    {
        return (x1 + x2) / (n1 + n2);
    }
    
}
