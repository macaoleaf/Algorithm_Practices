/*Return a version of the given string, 
  where for every star (*) in the string the star and the chars 
  immediately to its left and right are gone. 
  So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") ¡ú "ad"
starOut("ab**cd") ¡ú "ad"
starOut("sm*eilly") ¡ú "silly"*/

public String starOut(String str) {
  String result = "";
  if(str.length() == 1){
    if(!str.equals("*")){
      result += str.charAt(0);
    }
  }else{
    for(int n = 0; n < str.length(); n++){
      if(n == 0 && str.charAt(n) != '*' && str.charAt(n + 1) != '*'){
        result += str.charAt(n);
      }else if(n == (str.length() - 1)){
        if(str.charAt(n) != '*' && str.charAt(n - 1) != '*'){
        result += str.charAt(n);
        }else{
          break;
        }
      }else if(str.charAt(n) != '*' && str.charAt(n + 1) != '*' &&
               str.charAt(n - 1) != '*'){
        result += str.charAt(n);
      }
    }
  }
  return result;
}