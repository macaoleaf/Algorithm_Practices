/*Return a version of the given array where all the 10's have been removed. 
  The remaining elements should shift left towards the start of the array as needed, 
  and the empty spaces a the end of the array should be 0. 
  So {1, 10, 10, 2} yields {1, 2, 0, 0}. 
  You may modify and return the given array or make a new array.

withoutTen([1, 10, 10, 2]) ¡ú [1, 2, 0, 0]
withoutTen([10, 2, 10]) ¡ú [2, 0, 0]
withoutTen([1, 99, 10]) ¡ú [1, 99, 0]*/

public int[] withoutTen(int[] nums) {
  int[] result = new int[nums.length];
  int position = 0;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] % 10 != 0){
      result[position] = nums[n];
      position++;
    }
  }
  return result;
}