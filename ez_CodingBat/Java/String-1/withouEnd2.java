/*Given a string, return a version without both the first and last char of the string. 
  The string may be any length, including 0.

withouEnd2("Hello") ¡ú "ell"
withouEnd2("abc") ¡ú "b"
withouEnd2("ab") ¡ú ""*/

public String withouEnd2(String str) {
  if(str.length() <= 2){
    return "";
  }else{
    return str.substring(1, str.length() - 1);
  }
}