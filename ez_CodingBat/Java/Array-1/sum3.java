/*Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) ¡ú 6
sum3([5, 11, 2]) ¡ú 18
sum3([7, 0, 0]) ¡ú 7*/

public int sum3(int[] nums) {
  int sum = 0;
  for(int n = 0; n < 3; n++){
    sum += nums[n];
  }
  return sum;
}