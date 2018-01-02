/*Given a string, return the sum of the numbers appearing in the string, 
  ignoring all other characters. A number is a series of 1 or more digit chars in a row. 
  (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. 
     Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") ¡ú 123
sumNumbers("aa11b33") ¡ú 44
sumNumbers("7 11") ¡ú 18*/

public int sumNumbers(String str) {
  int sum = 0;
  String numString = "";
  if(str.length() != 0){
    for(int n = 0; n < str.length(); n++){
      if(Character.isDigit(str.charAt(n))){
        numString += str.charAt(n);
      }else{
        if(numString.length() != 0){
          sum += Integer.parseInt(numString);
          numString = "";
        }
      }
    }
    if(Character.isDigit(str.charAt(str.length() - 1))){
      sum += Integer.parseInt(numString);
    }
  }
  return sum;
}