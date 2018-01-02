/*Given a string, if one or both of the first 2 chars is 'x', 
  return the string without those 'x' chars, and otherwise return the string unchanged. 
  This is a little harder than it looks.

withoutX2("xHi") ¡ú "Hi"
withoutX2("Hxi") ¡ú "Hi"
withoutX2("Hi") ¡ú "Hi"*/

public String withoutX2(String str) {
  if(str.length() == 0){
    return "";
  }else if(str.length() == 1){
    if(str.charAt(0) == 'x'){
      return "";
    }else{
      return str;
    }
  }else{
    String result = "";
    for(int n = 0; n < str.length(); n++){
      if(!((n == 0 || n == 1) && str.charAt(n) == 'x')){
        result += str.charAt(n);
      }
    }
    return result;
  }
}