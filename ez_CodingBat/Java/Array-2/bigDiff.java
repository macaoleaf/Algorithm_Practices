/*Given an array length 1 or more of ints, 
  return the difference between the largest and smallest values in the array. 
  Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods 
  return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) ¡ú 7
bigDiff([7, 2, 10, 9]) ¡ú 8
bigDiff([2, 10, 7, 2]) ¡ú 8*/

public int bigDiff(int[] nums) {
  int max = -Integer.MAX_VALUE;
  int min = Integer.MAX_VALUE;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] > max){
      max = nums[n];
    }
    if(nums[n] < min){
      min = nums[n];
    }
  }
  int diff = max - min;
  return diff;
}