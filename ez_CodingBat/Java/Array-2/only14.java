/*Given an array of ints, return true if every element is a 1 or a 4.

only14([1, 4, 1, 4]) ¡ú true
only14([1, 4, 2, 4]) ¡ú false
only14([1, 1]) ¡ú true*/

public boolean only14(int[] nums) {
  boolean oneFour = true;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] != 1 && nums[n] != 4){
      oneFour = false;
    }
  }
  return oneFour;
}