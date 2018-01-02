/*Given an array of ints, 
  return a new array length 2 containing the first and last elements from the original array.
  The original array will be length 1 or more.

makeEnds([1, 2, 3]) ¡ú [1, 3]
makeEnds([1, 2, 3, 4]) ¡ú [1, 4]
makeEnds([7, 4, 6, 2]) ¡ú [7, 2]*/

public int[] makeEnds(int[] nums) {
  int[] result = new int[2];
  result[0] = nums[0];
  result[1] = nums[nums.length - 1];
  return result;
}