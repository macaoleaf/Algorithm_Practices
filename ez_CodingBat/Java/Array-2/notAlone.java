/*We'll say that an element in an array is "alone" if there are values before and after it, 
  and those values are different from it. 
  Return a version of the given array where every instance of the given value 
  which is alone is replaced by whichever value to its left or right is larger.

notAlone([1, 2, 3], 2) ¡ú [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) ¡ú [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) ¡ú [3, 4]*/

public int[] notAlone(int[] nums, int val) {
  int[] result = new int[nums.length];
  if(nums.length <= 2){
    result = nums;
  }else{
    for(int n = 0; n < nums.length; n++){
      if(nums[n] != val){
        result[n] = nums[n];
      }else{
        if(n != 0 && n != (nums.length - 1) &&
           nums[n] != nums[n - 1] && nums[n] != nums[n + 1]){
          result[n] = Math.max(nums[n - 1], nums[n + 1]);
        }else{
          result[n] = nums[n];
        }
      }
    }
  }
  return result;
}