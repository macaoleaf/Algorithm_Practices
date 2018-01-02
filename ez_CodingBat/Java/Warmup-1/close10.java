/*Given 2 int values, return whichever value is nearest to the value 10, 
  or return 0 in the event of a tie. 
  Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) ¡ú 8
close10(13, 8) ¡ú 8
close10(13, 7) ¡ú 0*/

public int close10(int a, int b) {
  int absA = Math.abs(10 - a);
  int absB = Math.abs(10 - b);
  if(absA > absB){
    return b;
  }else if(absB > absA){
    return a;
  }else{
    return 0;
  }
}