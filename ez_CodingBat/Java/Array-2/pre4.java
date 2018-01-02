/*Given a non-empty array of ints, 
  return a new array containing the elements from the original array 
  that come before the first 4 in the original array. 
  The original array will contain at least one 4. 
  Note that it is valid in java to create an array of length 0.

pre4([1, 2, 4, 1]) ¡ú [1, 2]
pre4([3, 1, 4]) ¡ú [3, 1]
pre4([1, 4, 4]) ¡ú [1]*/

public int[] pre4(int[] nums) {
  int count = 0;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] == 4){
      count = n;
      n = nums.length;
    }
  }
  int[] result = new int[count];
  for(int n = 0; n < count; n++){
    result[n] = nums[n];
  }
  return result;
}