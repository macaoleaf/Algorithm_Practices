/*Given a string and a non-empty word string, 
  return a version of the original String 
  where all chars have been replaced by pluses ("+"), 
  except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") ¡ú "++xy++"
plusOut("12xy34", "1") ¡ú "1+++++"
plusOut("12xy34xyabcxy", "xy") ¡ú "++xy++xy+++xy"*/

public String plusOut(String str, String word) {
  String result = "";
  if(str.length() < word.length()){
    for(int n = 0; n < str.length(); n++){
      result += '+';
    }
  }else{
    for(int n = 0; n < (str.length() - word.length() + 1); n++){
      if(!str.substring(n, n + word.length()).equals(word)){
        result += '+';
      }else{
        result += word;
        n += word.length() - 1;
      }
    }
  }
  while(result.length() < str.length()){
      result += '+';
  }
  return result;
}