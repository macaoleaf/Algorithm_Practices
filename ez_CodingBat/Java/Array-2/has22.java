/*Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) ¡ú true
has22([1, 2, 1, 2]) ¡ú false
has22([2, 1, 2]) ¡ú false*/

public boolean has22(int[] nums) {
  boolean has = false;
  for(int n = 0; n < (nums.length - 1); n++){
    if(nums[n] == 2 && nums[n + 1] == 2){
      has = true;
    }
  }
  return has;
}