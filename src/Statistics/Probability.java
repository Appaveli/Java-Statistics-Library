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
public class Probability 
{
    
    public static double Median(double MedianArray[], int size) 
    {
        double Sorted[] = new double[MedianArray.length];
        for (int i = 0; i < size; i++) 
        {
            Sorted[i] = MedianArray[i];
        }
        for (int i = size - 1; i > 0; i--) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (Sorted[j] > Sorted[j + 1]) 
                {
                    double temp = Sorted[j];
                    Sorted[j] = Sorted[j + 1];
                    Sorted[j + 1] = temp;
                }

            }
        }
        double median = 0.0;
        if ((size % 2) == 0) 
        {
            median = (Sorted[size / 2] + Sorted[(size / 2) - 1]) / 2.0;
        } else {
            median = Sorted[size / 2];
        }
        return median;
    }
    
    public static double Mode(double ModeArray[], int size) 
    {
        int repetition[] = new int[size];
        for (int i = 0; i < size; i++) {
            repetition[i] = ModeArray.length;
            int j = 0;
            while ((j < i) && ModeArray[i] != ModeArray[j]) {
                if (ModeArray[i] != ModeArray[j]) {
                    j++;
                }
            }
            ++(repetition[j]);
        }
        int MaxRepeat = 0;
        for (int i = 1; i < size; i++) 
        {
            if (repetition[i] > repetition[MaxRepeat]) 
            {
                MaxRepeat = i;
            }
        }
        return ModeArray[MaxRepeat];

    }

    public static double Mean(double Mean[], int size) 
    {
        double sum = Mean[0];
        for (int i = 0; i < size; i++) 
        {
            sum += Mean[i];
        }
        return sum / size;
    }

    
    public static double ClassicalProbability(double e, double outcomes)
    {
        return e / outcomes;
    }
    
    public static double EmpiricalProbability(double e, double frequency)
    {
        return e / frequency;
    }
    
}
