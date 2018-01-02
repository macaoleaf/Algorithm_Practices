/*Given an array of ints, return the number of 9's in the array.

arrayCount9([1, 2, 9]) ¡ú 1
arrayCount9([1, 9, 9]) ¡ú 2
arrayCount9([1, 9, 9, 3, 9]) ¡ú 3*/

public int arrayCount9(int[] nums) {
  int count = 0;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] == 9){
      count++;
    }
  }
  return count;
}