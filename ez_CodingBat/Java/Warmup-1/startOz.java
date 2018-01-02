/*Given a string, return a string made of the first 2 chars (if present), 
 however include first char only if it is 'o' and include the second only if it is 'z', 
 so "ozymandias" yields "oz".
 
 startOz("ozymandias") ¡ú "oz"
 startOz("bzoo") ¡ú "z"
 startOz("oxx") ¡ú "o"*/

public String startOz(String str) {
  String oz = "";
  if(str.length() >= 2){
    if(str.charAt(0) == 'o'){
      oz += 'o';
    }
    if(str.charAt(1) == 'z'){
      oz += 'z';
    }
  }else if(str.length() == 1){
    if(str.charAt(0) == 'o' || str.charAt(0) == 'z'){
      oz += str.charAt(0);
    }
  }
  return oz;
}

/*Solution:
 public String startOz(String str) {
 String result = "";
 
 if (str.length() >= 1 && str.charAt(0)=='o') {
 result = result + str.charAt(0);
 }
 
 if (str.length() >= 2 && str.charAt(1)=='z') {
 result = result + str.charAt(1);
 }
 
 return result;
 }*/