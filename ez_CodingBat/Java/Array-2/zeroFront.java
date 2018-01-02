/*Return an array that contains the exact same numbers as the given array, 
  but rearranged so that all the zeros are grouped at the start of the array. 
  The order of the non-zero numbers does not matter. 
  So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. 
    You may modify and return the given array or make a new array.

zeroFront([1, 0, 0, 1]) ¡ú [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) ¡ú [0, 0, 1, 1, 1]
zeroFront([1, 0]) ¡ú [0, 1]*/

public int[] zeroFront(int[] nums) {
  int[] result = new int[nums.length];
  int count0 = 0;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] == 0){
      count0++;
    }
  }
  for(int n = 0; n < count0; n++){
    result[n] = 0;
  }
  for(int n = 0; n < nums.length; n++){
    if(nums[n] != 0){
      result[count0] = nums[n];
      count0++;
    }
  }
  return result;
}