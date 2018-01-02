/*Given 2 int values, return true if they are both in the range 30..40 inclusive, 
 or they are both in the range 40..50 inclusive.
 
 in3050(30, 31) ¡ú true
 in3050(30, 41) ¡ú false
 in3050(40, 50) ¡ú true*/

public boolean in3050(int a, int b) {
  return ((a >= 30 && a <= 40 && b >= 30 && b <= 40) 
            || (a >= 40 && a <= 50 && b >= 40 && b <= 50));
}