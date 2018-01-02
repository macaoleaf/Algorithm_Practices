/*Given an array of ints length 3, figure out which is larger, 
  the first or last element in the array, and set all the other elements to be that value. 
  Return the changed array.

maxEnd3([1, 2, 3]) ¡ú [3, 3, 3]
maxEnd3([11, 5, 9]) ¡ú [11, 11, 11]
maxEnd3([2, 11, 3]) ¡ú [3, 3, 3]*/

public int[] maxEnd3(int[] nums) {
  int[] result = new int[3];
  int larger = 0;
  if(nums[0] > nums[nums.length - 1]){
    larger = nums[0];
  }else{
    larger = nums[nums.length - 1];
  }
  result[0] = larger;
  result[1] = larger;
  result[2] = larger;
  return result;
}