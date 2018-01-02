/*Given three ints, a b c, 
  return true if one of b or c is "close" (differing from a by at most 1), 
  while the other is "far", differing from both other values by 2 or more. 
  Note: Math.abs(num) computes the absolute value of a number.

closeFar(1, 2, 10) ¡ú true
closeFar(1, 2, 3) ¡ú false
closeFar(4, 1, 3) ¡ú true*/

public boolean closeFar(int a, int b, int c) {
  boolean closeFar = false;
  int bToa = Math.abs(b - a);
  int cToa = Math.abs(c - a);
  int cTob = Math.abs(c - b);
  if((bToa <= 1 && cToa >= 2 && cTob >= 2) || 
     (bToa >= 2 && cTob >= 2 && cToa <= 1)){
       closeFar = true;
     }
  return closeFar;
}