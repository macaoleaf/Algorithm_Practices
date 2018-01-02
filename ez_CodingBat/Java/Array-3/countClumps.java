/*Say that a "clump" in an array is 
  a series of 2 or more adjacent elements of the same value. 
  Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) ¡ú 2
countClumps([1, 1, 2, 1, 1]) ¡ú 2
countClumps([1, 1, 1, 1, 1]) ¡ú 1*/

public int countClumps(int[] nums) {
  int count = 0;
  for(int n = 2; n < nums.length; n++){
    if(nums[n] == nums[n - 1] && nums[n - 1] != nums[n - 2]){
      count++;
    }
  }
  if(nums.length >= 2 && nums[0] == nums[1]){
    count++;
  }
  return count;
}