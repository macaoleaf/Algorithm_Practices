/*Given 2 int values, return true if one is negative and one is positive. 
 Except if the parameter "negative" is true, then return true only if both are negative.
 
 posNeg(1, -1, false) ¡ú true
 posNeg(-1, 1, false) ¡ú true
 posNeg(-4, -5, true) ¡ú true*/

public boolean posNeg(int a, int b, boolean negative) {
  if(((a < 0 && b > 0) || (a > 0 && b < 0)) && !negative){
    return true;
  }else if(a < 0 && b < 0 && negative){
    return true;
  }else{
    return false;
  }
}

/*Answer:
 public boolean posNeg(int a, int b, boolean negative) {
 if (negative) {
 return (a < 0 && b < 0);
 }
 else {
 return ((a < 0 && b > 0) || (a > 0 && b < 0));
 }
 }
 
 different thinking, but same workload.*/