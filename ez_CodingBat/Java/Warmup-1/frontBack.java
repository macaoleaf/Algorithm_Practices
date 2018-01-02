/*Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") ¡ú "eodc"
frontBack("a") ¡ú "a"
frontBack("ab") ¡ú "ba"*/

public String frontBack(String str) {
  if(str.length() > 1){
  String change = "" + str.charAt(str.length() - 1);
  for(int n = 1; n < (str.length() - 1); n++){
    change += str.charAt(n);
  }
  change += str.charAt(0);
  return change;
  }else{
    return str;
  }
}

/*Solution:
public String frontBack(String str) {
  if (str.length() <= 1) return str;
  
  String mid = str.substring(1, str.length()-1);
  
  // last + mid + first
  return str.charAt(str.length()-1) + mid + str.charAt(0);
}

seems that I need more knowledge about substring. */