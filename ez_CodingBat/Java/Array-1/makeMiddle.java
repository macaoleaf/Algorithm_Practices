/*Given an array of ints of even length, 
  return a new array length 2 containing the middle two elements from the original array. 
  The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) ¡ú [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) ¡ú [2, 3]
makeMiddle([1, 2]) ¡ú [1, 2]*/

public int[] makeMiddle(int[] nums) {
  int[] result = new int[2];
  int middle = nums.length / 2;
  result[0] = nums[middle - 1];
  result[1] = nums[middle];
  return result;
}