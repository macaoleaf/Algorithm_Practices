/*Given an array of ints, return true if it contains a 2, 7, 1 pattern: 
  a value, followed by the value plus 5, followed by the value minus 1. 
  Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) ¡ú true
has271([1, 2, 8, 1]) ¡ú false
has271([2, 7, 1]) ¡ú true*/

public boolean has271(int[] nums) {
  boolean has = false;
  for(int n = 0; n < (nums.length - 2); n++){
    if(nums[n + 1] - nums[n] == 5 &&
       nums[n] - nums[n + 2] <= 3 && nums[n] - nums[n + 2] >= -1){
      has = true;
    }
  }
  return has;
}