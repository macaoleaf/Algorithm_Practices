/*Return the sum of the numbers in the array, returning 0 for an empty array. 
  Except the number 13 is very unlucky, 
  so it does not count and numbers that come immediately after a 13 also do not count.

sum13([1, 2, 2, 1]) ¡ú 6
sum13([1, 1]) ¡ú 2
sum13([1, 2, 2, 1, 13]) ¡ú 6*/

public int sum13(int[] nums) {
  int sum = 0;
  if(nums.length == 1 && nums[0] != 13){
    sum = nums[0];
  }else if(nums.length > 1){
    for(int n = 0; n < nums.length; n++){
      if(nums[n] == 13){
        if(n != nums.length - 1){
          n++;
        }
      }else{
        sum += nums[n];
      }
    }
  }
  return sum;
}