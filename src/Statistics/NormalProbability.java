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
public class NormalProbability 
{
    public static double NormalStandardDeviation(double value, double mean, double StandardDeviation)
    {
        return (value - mean) / StandardDeviation;
    }
    
    public static double Z_scoreTox_Value(double mean, double zScore, double StandardDeviation)
    {
        return mean - zScore * (StandardDeviation);
    }
   
    public static double CentralLimitTheorem(double popStandardDeviation, double n )
    {
        return  (popStandardDeviation) / (Math.sqrt(n));
    }
   
    public static double SamplingDistributions(double value, double mean,double popStandardDeviation, double n )
    {
        return (value - mean) / (CentralLimitTheorem(popStandardDeviation, n));
    }
   
    public static double NormalDistribution(double n, double q, double p)
    {
        return Math.sqrt(n*p*q);
    }
    
    public static double BinomialProbability(double x, double mean, double n, double p, double q)
    {
        return (x - mean) / (NormalDistribution(n,q,p));
    }
    
}
