/*Given an array of ints of odd length, look at the first, last, 
  and middle values in the array and return the largest. 
  The array length will be a least 1.

maxTriple([1, 2, 3]) ¡ú 3
maxTriple([1, 5, 3]) ¡ú 5
maxTriple([5, 2, 3]) ¡ú 5*/

public int maxTriple(int[] nums) {
  if(nums.length == 1){
    return nums[0];
  }else{
    int step = (int) nums.length / 2;
    int max = -Integer.MAX_VALUE;
    for(int n = 0; n < nums.length; n += step){
      if(nums[n] > max){
        max = nums[n];
      }
    }
    return max;
  }
}