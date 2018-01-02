/*Given a non-empty array of ints, 
  return a new array containing the elements from the original array 
  that come after the last 4 in the original array. 
  The original array will contain at least one 4. 
  Note that it is valid in java to create an array of length 0.

post4([2, 4, 1, 2]) ¡ú [1, 2]
post4([4, 1, 4, 2]) ¡ú [2]
post4([4, 4, 1, 2, 3]) ¡ú [1, 2, 3]*/

public int[] post4(int[] nums) {
  int position = -1;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] == 4){
      position = n;
    }
  }
  int length = nums.length - position - 1;
  int[] result = new int[length];
  for(int n = position + 1; n < nums.length; n++){
    result[n - position - 1] = nums[n];
  }
  return result;
}