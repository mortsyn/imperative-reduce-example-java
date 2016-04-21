package main;

public class ImperativeReduceExample {

    public int sum(int[] nums) {
        int sum = 0;

        for(int i = 0; i < nums.length; i++)
            sum += nums[i];

        return sum;
    }
}
