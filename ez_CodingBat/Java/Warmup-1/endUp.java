/*Given a string, return a new string where the last 3 chars are now in upper case. 
  If the string has less than 3 chars, uppercase whatever is there. 
  Note that str.toUpperCase() returns the uppercase version of a string.

endUp("Hello") ¡ú "HeLLO"
endUp("hi there") ¡ú "hi thERE"
endUp("hi") ¡ú "HI"*/

public String endUp(String str) {
  String change = "";
  if(str.length() <= 3){
    change = str.toUpperCase();
  }else{
    change = str.substring(0, str.length() - 3) + (str.substring(str.length() - 3)).toUpperCase();
  }
  return change;
}