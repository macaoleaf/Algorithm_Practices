/*Given an array of ints, 
  return true if the array contains either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) ¡ú true
modThree([2, 1, 2, 5]) ¡ú false
modThree([2, 4, 2, 5]) ¡ú true*/

public boolean modThree(int[] nums) {
  boolean mod = false;
  for(int n = 0; n < (nums.length - 2); n++){
    if((nums[n] % 2 == nums[n + 1] % 2) && 
       (nums[n + 1] % 2 == nums[n + 2] % 2)){
      mod = true;
    }
  }
  return mod;
}