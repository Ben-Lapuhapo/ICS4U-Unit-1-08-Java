/****************************************************************************
 *
 * Created by: Ben Lapuhapo
 * Created on: March 1 2019
 * Created for: ICS4U
 * This program generates 10 numbers from 1-99 and shows the user the value
 *
 ****************************************************************************/

import java.util.Arrays;
import java.util.Random;

public class MaxMin
{
    public static void main(String[] arg)
    {
        Random rand = new Random();

        int[] IntArray;
        int MaxValue;
        int MinValue;
        // Creates an array with 10 indexes
        IntArray = new int[10];

        // Adds a random number from 1-99 into the array for every index
        for (int index = 0; index < IntArray.length; index++)
        {
            IntArray[index] = rand.nextInt(99) + 1;
        }

        // Prints the array
        System.out.println(Arrays.toString(IntArray));
        MaxValue = MaxValue(IntArray);
        MinValue = MinValue(IntArray);

        // Prints the max and min values
        System.out.printf("The Maximum value is: %d%n", MaxValue);
        System.out.printf("The Minimum value is: %d%n", MinValue);
    }

    public static int MaxValue(int[] IntArray)
    {
        int MaxValue;
        MaxValue = IntArray[0];

        // Finds maximum value
        for (int index = 1; index < IntArray.length; index ++)
        {
            if (index < IntArray.length - 1)
            {
                if (IntArray[index] > MaxValue)
                {
                    MaxValue = IntArray[index];
                }
            }
        }
        return MaxValue;
    }

    public static int MinValue(int[] IntArray)
    {
        int MinValue;
        MinValue = IntArray[0];

        // Finds minimum value
        for (int index = 1; index < IntArray.length; index ++)
        {
            if (index < IntArray.length - 1)
            {
                if (IntArray[index] < MinValue)
                {
                    MinValue = IntArray[index];
                }
            }
        }
        return MinValue;
    }
}