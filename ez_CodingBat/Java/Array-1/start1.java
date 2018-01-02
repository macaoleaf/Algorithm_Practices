/*Start with 2 int arrays, a and b, of any length. 
  Return how many of the arrays have 1 as their first element.

start1([1, 2, 3], [1, 3]) ¡ú 2
start1([7, 2, 3], [1]) ¡ú 1
start1([1, 2], []) ¡ú 1*/

public int start1(int[] a, int[] b) {
  int sum = 0;
  if(a.length > 0 && a[0] == 1){
    sum++;
  }
  if(b.length > 0 && b[0] == 1){
    sum++;
  }
  return sum;
}