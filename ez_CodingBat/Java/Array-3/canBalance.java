/*Given a non-empty array, return true if there is a place to split the array 
  so that the sum of the numbers on one side is equal to 
  the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) ¡ú true
canBalance([2, 1, 1, 2, 1]) ¡ú false
canBalance([10, 10]) ¡ú true*/

public boolean canBalance(int[] nums) {
  boolean balance = false;
  double sum = 0;
  double halfsum = 0;
  if(nums.length >= 2){
    for(int n = 0; n < nums.length; n++){
      sum += nums[n];
    }
    for(int n = 0; n < nums.length; n++){
      halfsum += nums[n];
      if(halfsum == sum / 2){
        balance = true;
      }
    }
  }
  return balance;
}