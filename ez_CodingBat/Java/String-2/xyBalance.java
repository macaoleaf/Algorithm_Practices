/*We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
  there exists a 'y' char somewhere later in the string. 
  So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. 
  Return true if the given string is xy-balanced.

xyBalance("aaxbby") ¡ú true
xyBalance("aaxbb") ¡ú false
xyBalance("yaaxbb") ¡ú false*/

public boolean xyBalance(String str) {
  int x = -1;
  int y = -1;
  boolean balance = false;
  for(int n = 0; n < str.length(); n++){
    if(str.charAt(n) == 'x'){
      x = n;
    }else if(str.charAt(n) == 'y'){
      y = n;
    }
  }
  if(y > x || (y == x && y == -1)){ //to see if there is neither x nor y
    balance = true;
  }
  return balance;
}