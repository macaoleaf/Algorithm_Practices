/*Return a version of the given array where each zero value in the array 
  is replaced by the largest odd value to the right of the zero in the array. 
  If there is no odd value to the right of the zero, leave the zero as a zero.

zeroMax([0, 5, 0, 3]) ¡ú [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) ¡ú [3, 4, 3, 3]
zeroMax([0, 1, 0]) ¡ú [1, 1, 0]*/

public int[] zeroMax(int[] nums) {
  int maxOdd = -Integer.MAX_VALUE;
  int[] result = new int[nums.length];
  for(int n = (nums.length - 1); n >= 0; n--){
    if(nums[n] % 2 == 1 && nums[n] > maxOdd){
      maxOdd = nums[n];
    }
    if(nums[n] == 0 && maxOdd != -Integer.MAX_VALUE){
      result[n] = maxOdd;
    }else{
      result[n] = nums[n];
    }
  }
  return result;
}