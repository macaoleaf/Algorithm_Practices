/*Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

sum28([2, 3, 2, 2, 4, 2]) ¡ú true
sum28([2, 3, 2, 2, 4, 2, 2]) ¡ú false
sum28([1, 2, 3, 4]) ¡ú false*/

public boolean sum28(int[] nums) {
  int count = 0;
  boolean sum = false;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] == 2){
      count++;
    }
  }
  if(count == 4){
    sum = true;
  }
  return sum;
}