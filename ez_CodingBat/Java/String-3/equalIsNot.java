/*Given a string, return true if the number of appearances of "is" anywhere in the string 
  is equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") ¡ú false
equalIsNot("This is notnot") ¡ú true
equalIsNot("noisxxnotyynotxisi") ¡ú true*/

public boolean equalIsNot(String str) {
  int is = 0;
  int not = 0;
  boolean equal = false;
  for(int n = 0; n < str.length(); n++){
    if(n <= str.length() - 2){
      if(str.substring(n, n + 2).equals("is")){
        is++;
      }
    }
    if(n <= str.length() - 3){
      if(str.substring(n, n + 3).equals("not")){
        not++;
      }
    }
  }
  if(is == not){
    equal = true;
  }
  return equal;
}