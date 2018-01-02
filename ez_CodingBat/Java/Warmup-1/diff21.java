/*Given an int n, return the absolute difference between n and 21, 
 except return double the absolute difference if n is over 21.
 
 diff21(19) ¡ú 2
 diff21(10) ¡ú 11
 diff21(21) ¡ú 0*/

public int diff21(int n) {
  int diff = 21 - n;
  if(n > 21){
    diff = diff * (-2);
  }
  return diff;
}