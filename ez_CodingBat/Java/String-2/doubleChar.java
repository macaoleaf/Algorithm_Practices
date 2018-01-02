/*Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") �� "TThhee"
doubleChar("AAbb") �� "AAAAbbbb"
doubleChar("Hi-There") �� "HHii--TThheerree"*/

public String doubleChar(String str) {
  String result = "";
  for(int n = 0; n < str.length(); n++){
    result += str.charAt(n);
    result += str.charAt(n);
  }
  return result;
}

//notice the difference between () += and = () +
//when using += ,simply adding two chars would go to numbers related to the chars
//while = () + don't