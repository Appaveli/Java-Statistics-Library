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
public class ConfidenceIntervals 
{
    /**
     * 
     * @param z
     * @param s
     * @param n
     * @return
     */
    public static double MarginError(double z, double s, double n)
    {
        return z * s / Math.sqrt(n);
    }
    /**
     * 
     * @param z
     * @param s
     * @return
     */
    public static double MinSampleSize(double z, double s)
    {
        return (z * s / 1) * (z * s / 1);
    }
    /**
     * 
     * @param x
     * @param n
     * @return
     */
    public static double PointEstimateOfP( double x, double n)
    {
        return x / n;
    }
    
    public static double ConfidenceInterval(double z, double a, double n)
    {
        return z * a / Math.sqrt(n);
    }
    
    public static double ConfidenceIntervalP(double z, double p, double q, double n)
    {
        return z * Math.sqrt((p*q)/n);
        
    }
    
    public static double SampleSizeP(double p, double q, double z, double e)
    {
        return (p) * (q) *(z/e) * (z/e);
    }
    
    public static double XSquaredLeft(double ConfidenceInterval)
    {
        return 1 - ConfidenceInterval / 2;
    }
   
    public static double XSquaredRight(double ConfidenceInterval)
    {
        return 1 + ConfidenceInterval / 2;
    }
    
}
