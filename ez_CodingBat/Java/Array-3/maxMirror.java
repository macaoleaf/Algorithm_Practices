/*We'll say that a "mirror" section in an array is a group of contiguous elements 
  such that somewhere in the array, the same group appears in reverse order. 
  For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 
    (the {1, 2, 3} part). 
    Return the size of the largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) ¡ú 3
maxMirror([1, 2, 1, 4]) ¡ú 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) ¡ú 2*/

public int maxMirror(int[] nums) {
  int length = 0;
  int maxLength = 0;
  for(int x = 0; x < nums.length; x++){
    for(int y = (nums.length - 1); y >= 0; y--){
      if(nums[x] == nums[y]){
        length = 1;
        int testLength = Math.min((nums.length - 1 - x), y);
        for(int n = 1; n <= testLength; n++){
          if(nums[x + n] == nums[y - n]){
            length++;
          }else{
            n = testLength;
          }
        }
      }
      if(length > maxLength){
        maxLength = length;
      }
    }
  }
  return maxLength;
}