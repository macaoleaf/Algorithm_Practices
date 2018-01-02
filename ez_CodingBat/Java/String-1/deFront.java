/*Given a string, return a version without the first 2 chars. 
  Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
  The string may be any length. Harder than it looks.

deFront("Hello") ¡ú "llo"
deFront("java") ¡ú "va"
deFront("away") ¡ú "aay"*/

public String deFront(String str) {    
  String result = "";
  if(str.length() == 0){
    return "";
  }else if(str.length() == 1){
    if(str.charAt(0) == 'a'){
      result += 'a';
    }
  }else if(str.length() == 2){
    if(str.charAt(0) == 'a'){
      result += 'a';
    }
    if(str.charAt(1) == 'b'){
      result += 'b';
    }
  }else{
    if(str.charAt(0) == 'a'){
      result += 'a';
    }
    if(str.charAt(1) == 'b'){
      result += 'b';
    }
    result += str.substring(2);
  }
  return result;
}