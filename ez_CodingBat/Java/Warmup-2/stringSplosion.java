/*Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") �� "CCoCodCode"
stringSplosion("abc") �� "aababc"
stringSplosion("ab") �� "aab"*/

public String stringSplosion(String str) {
  String result = "";
  for(int n = 0; n < (str.length() + 1); n++){
    result += str.substring(0, n);
  }
  return result;
}