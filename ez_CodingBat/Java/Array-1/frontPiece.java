/*Given an int array of any length, return a new array of its first 2 elements. 
  If the array is smaller than length 2, use whatever elements are present.

frontPiece([1, 2, 3]) ¡ú [1, 2]
frontPiece([1, 2]) ¡ú [1, 2]
frontPiece([1]) ¡ú [1]*/

public int[] frontPiece(int[] nums) {
  if(nums.length <= 2){
    return nums;
  }else{
    int[] result = new int[2];
    result[0] = nums[0];
    result[1] = nums[1];
    return result;
  }
}