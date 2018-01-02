/*Given a string, return a string where every appearance of the lowercase word "is" 
  has been replaced with "is not". 
  The word "is" should not be immediately preceeded or followed by a letter -- 
  so for example the "is" in "this" does not count. 
  (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") ¡ú "is not test"
notReplace("is-is") ¡ú "is not-is not"
notReplace("This is right") ¡ú "This is not right"*/
  
public String notReplace(String str) {
  String result = "";
  if(str.length() == 2){
    if(str.equals("is")){
      result = "is not";
    }
  }else{
    for(int n = 0; n < str.length(); n++){
      if(n <= (str.length() - 2) && str.substring(n, n + 2).equals("is")){
        if(n == 0 && !Character.isLetter(str.charAt(n + 2))){
          result += "is not";
          n++;
        }else if(n == (str.length() - 2) && 
                 !Character.isLetter(str.charAt(n - 1))){
          result += "is not";
          n++;
        }else if(n < (str.length() - 2) && n > 0 &&
                 !Character.isLetter(str.charAt(n - 1)) && 
                 !Character.isLetter(str.charAt(n + 2))){
          result += "is not";
          n++;
        }else{
          result += str.charAt(n);
        }
      }else{
        result += str.charAt(n);
      }
    }
  }