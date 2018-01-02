/*Given a string, return a version without the first and last char, 
  so "Hello" yields "ell". The string length will be at least 2.

withoutEnd("Hello") ¡ú "ell"
withoutEnd("java") ¡ú "av"
withoutEnd("coding") ¡ú "odin"*/

public String withoutEnd(String str) {
  if(str.length() == 2){
    return "";
  }else{
    String result = "";
    for(int n = 1; n < str.length() - 1; n++){
      result += str.charAt(n);
    }
    return result;
  }
}