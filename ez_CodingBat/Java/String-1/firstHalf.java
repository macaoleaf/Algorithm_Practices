/*Given a string of even length, return the first half. 
  So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") ¡ú "Woo"
firstHalf("HelloThere") ¡ú "Hello"
firstHalf("abcdef") ¡ú "abc"*/
  
public String firstHalf(String str) {
  return str.substring(0, str.length() / 2);
}