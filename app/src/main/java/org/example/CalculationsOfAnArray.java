package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CalculationsOfAnArray {
    // Return maximum value of an array using a for loop
    public int maximumUsingForLoop(int[] nums) {
        int maximum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maximum){
                maximum = nums[i];
            }
        }
        return maximum;
    }
    // Return minimum value of an array using a for loop
    public int minimumUsingForLoop(int[] nums) {
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < minimum){
                minimum = nums[i];
            }
        }
        return minimum;
    }
    // Return sum of an array using a for loop
    public int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    // Return average of an array using a for loop
    public double averageUsingForLoop(int[] nums) {
        double average = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        average = (double) sum / nums.length;
        return average;
    }
    // Return maximum value of an array using a Stream
    // orElse shows that it will return 0 if it does not find the Max value
    public int maximumUsingStream(int[] nums) {
        IntStream stream = Arrays.stream(nums);
        return stream.max().orElse(0);
    }
    // Return minimum value of an array using a Stream
    // will return MAX_VALUE if it does not find the minimum
    public int minimumUsingStream(int[] nums) {
        IntStream stream = Arrays.stream(nums);
        return stream.min().orElse(Integer.MAX_VALUE);
    }
    // Return sum of an array using a Stream
    public int sumUsingStream(int[] nums) {
        IntStream stream = Arrays.stream(nums);
        return stream.sum();
    }
    // Return average of an array using a Stream
    public double averageUsingStream(int[] nums) {
        IntStream stream = Arrays.stream(nums);
        return stream.average().orElse(0);

    }

    public int[] returnEvensOnly(int[] nums) {
        IntStream stream = Arrays.stream(nums);
        return stream.filter(i -> i % 2 == 0).toArray();
    }

    public int[] returnOddsOnly(int[] nums) {
        IntStream stream = Arrays.stream(nums);
        return stream.filter(i -> i % 2 != 0).toArray();
    }
    public int[] addFive(int[] nums) {
        IntStream stream = Arrays.stream(nums);
        return stream.map(i -> i + 5).toArray();
    }
    public int[] squareNumbers(int[] nums) {
        IntStream stream = Arrays.stream(nums);
        return stream.map(i -> i * i).toArray();
    }
}
