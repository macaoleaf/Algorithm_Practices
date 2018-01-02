/*Given a non-empty string and an int N, 
  return the string made starting with char 0, and then every Nth char of the string. 
  So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) ¡ú "Mrce"
everyNth("abcdefg", 2) ¡ú "aceg"
everyNth("abcdefg", 3) ¡ú "adg"*/
  
public String everyNth(String str, int n) {
  String change = "";
  for(int a = 0; a <= (str.length() - 1); a += n){
    change += str.charAt(a);
  }
  return change;
}