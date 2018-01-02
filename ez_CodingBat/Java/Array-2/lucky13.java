/*Given an array of ints, return true if the array contains no 1's and no 3's.

lucky13([0, 2, 4]) �� true
lucky13([1, 2, 3]) �� false
lucky13([1, 2, 4]) �� false*/

public boolean lucky13(int[] nums) {
  boolean lucky = true;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] == 1 || nums[n] == 3){
      lucky = false;
    }
  }
  return lucky;
}