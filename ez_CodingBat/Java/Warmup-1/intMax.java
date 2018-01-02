/*Given three int values, a b c, return the largest.
 * 
 intMax(1, 2, 3) ¡ú 3
 intMax(1, 3, 2) ¡ú 3
 intMax(3, 2, 1) ¡ú 3*/

public int intMax(int a, int b, int c) {
  int max = a;
  if(b > a){
    max = b;
    if (c > b){
      max = c;
    }
  }else if(c > a){
    max = c;
  }
  return max;
}

/*Solution:
 public int intMax(int a, int b, int c) {
 int max;
 
 // First check between a and b
 if (a > b) {
 max = a;
 } else {
 max = b;
 }
 
 // Now check between max and c
 if (c > max) {
 max = c;
 }
 
 return max;
 
 // Could use the built in Math.max(x, y) function which selects the larger
 // of two values.
 }*/