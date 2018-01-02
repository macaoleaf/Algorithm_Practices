/*(This is a slightly harder version of the fix34 problem.) 
  Return an array that contains exactly the same numbers as the given array, 
  but rearranged so that every 4 is immediately followed by a 5. 
  Do not move the 4's, but every other number may move. 
  The array contains the same number of 4's and 5's, 
  and every 4 has a number after it that is not a 4. 
  In this version, 5's may appear anywhere in the original array.

fix45([5, 4, 9, 4, 9, 5]) ¡ú [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) ¡ú [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) ¡ú [1, 4, 5, 1, 1, 4, 5]*/

public int[] fix45(int[] nums) {
  int[] result = new int[nums.length];
  for(int n = 0; n < nums.length; n++){
    if(nums[n] == 4){
      result[n] = 4;
      result[n + 1] = 5;
    }
  }
  for(int x = 0; x < result.length; x++){
    if(result[x] == 0){
      for(int y = x; y < nums.length; y++){
        if(nums[y] != 4 && nums[y] != 5){
          result[x] = nums[y];
        }
      }
    }
  }
  for(int x = (result.length - 1); x >= 0; x--){
    if(result[x] == 0){
      for(int y = (nums.length - 1); y >= 0; y--){
        if(nums[y] != 4 && nums[y] != 5){
          result[x] = nums[y];
        }
      }
    }
  }
  return result;
}

//cheers! all COMP 202 related practice solved!
//successfully use the same codes to solve both questions!