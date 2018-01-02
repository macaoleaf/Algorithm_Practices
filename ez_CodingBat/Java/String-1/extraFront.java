/*Given a string, 
  return a new string made of 3 copies of the first 2 chars of the original string. 
  The string may be any length. If there are fewer than 2 chars, use whatever is there.

extraFront("Hello") ¡ú "HeHeHe"
extraFront("ab") ¡ú "ababab"
extraFront("H") ¡ú "HHH"*/

public String extraFront(String str) {
  String unit = "";
  if(str.length() <= 2){
    unit = str;
  }else{
    unit = str.substring(0, 2);
  }
  return unit + unit + unit;
}