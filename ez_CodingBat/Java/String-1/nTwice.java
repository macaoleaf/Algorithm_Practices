/*Given a string and an int n, 
  return a string made of the first and last n chars from the string. 
  The string length will be at least n.

nTwice("Hello", 2) ¡ú "Helo"
nTwice("Chocolate", 3) ¡ú "Choate"
nTwice("Chocolate", 1) ¡ú "Ce"*/

public String nTwice(String str, int n) {
  String result = "";
  result = result + str.substring(0, n) + str.substring(str.length() - n);
  return result;
}