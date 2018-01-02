/*Given arrays nums1 and nums2 of the same length, for every element in nums1, 
  consider the corresponding element in nums2 (at the same index). 
  Return the count of the number of times that the two elements differ by 2 or less, 
  but are not equal.

matchUp([1, 2, 3], [2, 3, 10]) ¡ú 2
matchUp([1, 2, 3], [2, 3, 5]) ¡ú 3
matchUp([1, 2, 3], [2, 3, 3]) ¡ú 2*/

public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
  for(int n = 0; n < nums1.length; n++){
    if(Math.abs(nums1[n] - nums2[n]) <= 2 && nums1[n] != nums2[n]){
      count++;
    }
  }
  return count;
}