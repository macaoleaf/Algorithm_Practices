/*Return true if the given non-negative number 
  is 1 or 2 more than a multiple of 20.

more20(20) ¡ú false
more20(21) ¡ú true
more20(22) ¡ú true*/

public boolean more20(int n) {
  return (n % 20 == 1 || n % 20 == 2);
}