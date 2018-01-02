/*Given a string and a non-empty word string, 
  return a string made of each char just before and just after 
  every appearance of the word in the string. 
  Ignore cases where there is no char before or after the word, 
  and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") ¡ú "c13i"
wordEnds("XY123XY", "XY") ¡ú "13"
wordEnds("XY1XY", "XY") ¡ú "11"*/

public String wordEnds(String str, String word) {
  String result = "";
  if(str.length() != word.length()){
    for(int n = 0; n < (str.length() - word.length() + 1); n++){
      if(str.substring(n, n + word.length()).equals(word)){
        if(n == 0){
          result += str.charAt(word.length());
        }else if(n == (str.length() - word.length())){
          result += str.charAt(str.length() - word.length() - 1);
        }else{
          result += str.charAt(n - 1);
          result += str.charAt(n + word.length());
        }
      }
    }
  }
  return result;
}