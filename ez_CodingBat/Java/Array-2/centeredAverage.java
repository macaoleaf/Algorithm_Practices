/*Return the "centered" average of an array of ints, 
  which we'll say is the mean average of the values, 
  except ignoring the largest and smallest values in the array. 
  If there are multiple copies of the smallest value, ignore just one copy, 
  and likewise for the largest value. Use int division to produce the final average. 
  You may assume that the array is length 3 or more.

centeredAverage([1, 2, 3, 4, 100]) ¡ú 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) ¡ú 5
centeredAverage([-10, -4, -2, -4, -2, 0]) ¡ú -3*/

public int centeredAverage(int[] nums) {
  int sum = 0;
  int max = -Integer.MAX_VALUE;
  int min = Integer.MAX_VALUE;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] >= max){
      max = nums[n];
    }
    if(nums[n] <= min){
      min = nums[n];
    }
    sum += nums[n];
  }
  sum = sum - max - min;
  int average = sum / (nums.length - 2);
  return average;
}