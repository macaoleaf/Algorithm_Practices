/*Return an array that contains exactly the same numbers as the given array, 
  but rearranged so that every 3 is immediately followed by a 4. 
  Do not move the 3's, but every other number may move. 
  The array contains the same number of 3's and 4's, 
  every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

fix34([1, 3, 1, 4]) ¡ú [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) ¡ú [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) ¡ú [3, 4, 2, 2]*/

public int[] fix34(int[] nums) {
  int[] result = new int[nums.length];
  for(int n = 0; n < nums.length; n++){
    if(nums[n] == 3){
      result[n] = 3;
      result[n + 1] = 4;
    }
  }
  for(int x = 0; x < result.length; x++){
    if(result[x] == 0){
      for(int y = x; y < nums.length; y++){
        if(nums[y] != 3 && nums[y] != 4){
          result[x] = nums[y];
        }
      }
    }
  }
  for(int x = (result.length - 1); x >= 0; x--){
    if(result[x] == 0){
      for(int y = (nums.length - 1); y >= 0; y--){
        if(nums[y] != 3 && nums[y] != 4){
          result[x] = nums[y];
        }
      }
    }
  }
  return result;
}

//wondering if there are other simpler ways to do it...