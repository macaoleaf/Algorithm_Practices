/*Given a string, does "xyz" appear in the middle of the string? To define middle, 
  we'll say that the number of chars to the left and right of the "xyz" 
  must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") ¡ú true
xyzMiddle("AxyzBB") ¡ú true
xyzMiddle("AxyzBBB") ¡ú false*/

public boolean xyzMiddle(String str) {
  boolean middle = false;
  if(str.length() == 3 && str.equals("xyz")){
    middle = true;
  }
  if(str.length() > 3){
    for(int n = 0; n < (str.length() - 2); n++){
      if(str.substring(n, n + 3).equals("xyz") &&
         Math.abs(str.length() - n * 2 - 3) <= 1){
        middle = true;     
      }
    }
  }
  return middle;
}