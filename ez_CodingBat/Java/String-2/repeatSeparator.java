/*Given two strings, word and a separator sep, 
  return a big string made of count occurrences of the word, 
  separated by the separator string.

repeatSeparator("Word", "X", 3) ¡ú "WordXWordXWord"
repeatSeparator("This", "And", 2) ¡ú "ThisAndThis"
repeatSeparator("This", "And", 1) ¡ú "This"*/

public String repeatSeparator(String word, String sep, int count) {
  String result = "";
  int time = 0;
  for(int n = 0; n < count; n++){
    result += word;
    if(time < (count - 1)){
      result += sep;
      time++;
    }
  }
  return result;
}