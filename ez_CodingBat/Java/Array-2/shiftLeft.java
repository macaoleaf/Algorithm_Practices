/*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
  You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) ¡ú [2, 5, 3, 6]
shiftLeft([1, 2]) ¡ú [2, 1]
shiftLeft([1]) ¡ú [1]*/

public int[] shiftLeft(int[] nums) {
  if(nums.length == 0){
    return nums;
  }else{
    int[] result = new int[nums.length];
    for(int n = 1; n < nums.length; n++){
      result[n - 1] = nums[n];
    }
    result[nums.length - 1] = nums[0];
  return result;
  }
}