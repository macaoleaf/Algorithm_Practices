/*Given a string, 
  return true if the first instance of "x" in the string 
  is immediately followed by another "x".

doubleX("axxbb") ¡ú true
doubleX("axaxax") ¡ú false
doubleX("xxxxx") ¡ú true*/

boolean doubleX(String str) {
  boolean doubleX = false;
  for(int n = 0; n < (str.length() - 1); n++){
    if(str.charAt(n) == 'x' && str.charAt(n) == str.charAt(n + 1)){
      doubleX = true;
      break;
    }else if(str.charAt(n) == 'x' && str.charAt(n + 1) != 'x'){
      break;
    }
  }
  return doubleX;
}

/*Solution:
boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) return false; // no "x" at all

  // Is char at i+1 also an "x"?
  if (i+1 >= str.length()) return false; // check i+1 in bounds?
  return str.substring(i+1, i+2).equals("x");
  
  // Another approach -- .startsWith() simplifies the logic
  // String x = str.substring(i);
  // return x.startsWith("xx");
}

Comment:
Both of the methods have sth I haven't learnt about.
Still need to learn & practice burrrrr*/