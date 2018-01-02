/*Return an array that contains the exact same numbers as the given array, 
  but rearranged so that all the even numbers come before all the odd numbers. 
  Other than that, the numbers can be in any order. 
  You may modify and return the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) ¡ú [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) ¡ú [2, 3, 3]
evenOdd([2, 2, 2]) ¡ú [2, 2, 2]*/

public int[] evenOdd(int[] nums) {
  int even = 0;
  int odd = 0;
  int[] result = new int[nums.length];
  for(int n = 0; n < nums.length; n++){
    if(nums[n] % 2 == 0){
      result[even] = nums[n];
      even++;
    }else{
      result[nums.length - 1 - odd] = nums[n];
      odd++;
    }
  }
  return result;
}