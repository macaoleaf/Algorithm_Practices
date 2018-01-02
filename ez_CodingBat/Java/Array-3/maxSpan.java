/*Consider the leftmost and righmost appearances of some value in an array. 
  We'll say that the "span" is the number of elements between the two inclusive. 
  A single value has a span of 1. Returns the largest span found in the given array. 
  (Efficiency is not a priority.)

maxSpan([1, 2, 1, 1, 3]) ¡ú 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) ¡ú 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) ¡ú 6*/

public int maxSpan(int[] nums) {
  int length = 1;
  if(nums.length == 0){
    length = 0;
  }else if(nums.length == 1){
    length = 1;
  }else{
    for(int n = 0; n < nums.length; n++){
      for(int x = (nums.length - 1); x >= 0; x--){
        if(x > n && nums[x] == nums[n]){
          int currLength = x - n + 1;
          if(currLength > length){
            length = currLength;
          }
        }
      }
    }
  }
  return length;
}