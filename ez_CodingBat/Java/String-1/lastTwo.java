/*Given a string of any length, return a new string where the last 2 chars, 
  if present, are swapped, so "coding" yields "codign".

lastTwo("coding") ¡ú "codign"
lastTwo("cat") ¡ú "cta"
lastTwo("ab") ¡ú "ba"*/

public String lastTwo(String str) {
  String result = "";
  if(str.length() < 2){
    return str;
  }else if(str.length() == 2){
    result = result + str.charAt(1) + str.charAt(0);
  }else{
    return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1)
           + str.charAt(str.length() - 2);
  }
  return result;
}