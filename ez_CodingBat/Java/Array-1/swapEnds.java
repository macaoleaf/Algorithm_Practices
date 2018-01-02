/*Given an array of ints, swap the first and last elements in the array. 
  Return the modified array. The array length will be at least 1.

swapEnds([1, 2, 3, 4]) ¡ú [4, 2, 3, 1]
swapEnds([1, 2, 3]) ¡ú [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) ¡ú [5, 6, 7, 9, 8]*/

public int[] swapEnds(int[] nums) {
  int[] result = new int[nums.length];
  if(nums.length == 1){
    result[0] = nums[0];
  }else{
    for(int n = 0; n < nums.length; n++){
      if(n == 0){
        result[n] = nums[nums.length - 1];
      }else if(n == (nums.length - 1)){
        result[n] = nums[0];
      }else{
        result[n] = nums[n];
      }
    }
  }
  return result;
}