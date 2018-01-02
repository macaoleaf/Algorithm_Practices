/*Given an array of ints, 
  return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

array123([1, 1, 2, 3, 1]) ¡ú true
array123([1, 1, 2, 4, 1]) ¡ú false
array123([1, 1, 2, 1, 2, 3]) ¡ú true*/

public boolean array123(int[] nums) {
  boolean seq = false;
  for(int n = 0; n < (nums.length - 2); n++){
    if(nums[n] == 1 && nums[n + 1] == 2 && nums[n + 2] == 3){
      seq = true;
    }
  }
  return seq;
}