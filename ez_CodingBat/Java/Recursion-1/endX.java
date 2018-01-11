/* Given a string, 
 * compute recursively a new string where all the lowercase 'x' chars have been moved to 
 * the end of the string.


endX("xxre") ¡ú "rexx"
endX("xxhixx") ¡ú "hixxxx"
endX("xhixhix") ¡ú "hihixxx"*/

public String endX(String str) {
  if(str.length() == 0) return "";
  if(str.charAt(0) == 'x'){
    return endX(str.substring(1)) + "x";
  }
  return str.charAt(0) + endX(str.substring(1));
}