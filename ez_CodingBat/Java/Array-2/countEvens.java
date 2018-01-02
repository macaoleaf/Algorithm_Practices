/*Return the number of even ints in the given array. 
  Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

countEvens([2, 1, 2, 3, 4]) ¡ú 3
countEvens([2, 2, 0]) ¡ú 3
countEvens([1, 3, 5]) ¡ú 0*/

public int countEvens(int[] nums) {
  int count = 0;
  for(int n = 0; n < nums.length; n++){
    if(nums[n] % 2 == 0){
      count++;
    }
  }
  return count;
}