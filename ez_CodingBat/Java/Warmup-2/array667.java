/*Given an array of ints, 
  return the number of times that two 6's are next to each other in the array. 
  Also count instances where the second "6" is actually a 7.

array667([6, 6, 2]) ¡ú 1
array667([6, 6, 2, 6]) ¡ú 1
array667([6, 7, 2, 6]) ¡ú 1*/

public int array667(int[] nums) {
  int count = 0;
  for(int n = 0; n < (nums.length - 1); n++){
    if(nums[n] == 6 && (nums[n + 1] == 6 || nums[n + 1] == 7)){
      count++;
    }
  }
  return count;
}