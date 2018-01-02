/*Return true if the given string contains an appearance of "xyz" 
  where the xyz is not directly preceeded by a period (.). 
  So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") ¡ú true
xyzThere("abc.xyz") ¡ú false
xyzThere("xyz.abc") ¡ú true*/

public boolean xyzThere(String str) {
  boolean there = false;
  for(int n = 0; n < (str.length() - 2); n++){
    if(str.substring(n, n + 3).equals("xyz")){
      if(n == 0){
        there = true;
      }else if(str.charAt(n - 1) != '.'){
        there = true;
      }
    }
  }
  return there;
}