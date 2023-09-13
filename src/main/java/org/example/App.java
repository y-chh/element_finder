package org.example;

import findTwoNonRepeat.FindTwoNonRepeating;

import java.util.Arrays;


/**
 * TDD Proj
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] input = {1,2,3,1,2,4};

        System.out.println(Arrays.toString(FindTwoNonRepeating.findTwoNonRepeating(input)));

    }
}
