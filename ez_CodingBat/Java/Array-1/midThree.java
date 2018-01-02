/*Given an array of ints of odd length, 
  return a new array length 3 containing the elements from the middle of the array. 
  The array length will be at least 3.

midThree([1, 2, 3, 4, 5]) ¡ú [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) ¡ú [7, 5, 3]
midThree([1, 2, 3]) ¡ú [1, 2, 3]*/

public int[] midThree(int[] nums) {
  int middle = (int) nums.length / 2;
  int[] result = new int[3];
  result[0] = nums[middle - 1];
  result[1] = nums[middle];
  result[2] = nums[middle + 1];
  return result;
}