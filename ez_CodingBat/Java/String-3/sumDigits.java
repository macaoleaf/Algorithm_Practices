/*Given a string, return the sum of the digits 0-9 that appear in the string, 
  ignoring all other characters. Return 0 if there are no digits in the string. 
  (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. 
   Integer.parseInt(string) converts a string to an int.)

sumDigits("aa1bc2d3") ¡ú 6
sumDigits("aa11b33") ¡ú 8
sumDigits("Chocolate") ¡ú 0*/

public int sumDigits(String str) {
  int sum = 0;
  for(int n = 0; n < str.length(); n++){
    if(Character.isDigit(str.charAt(n))){
      if(n == (str.length() - 1)){
        sum += Integer.parseInt(str.substring(str.length() - 1));
      }else{
        sum += Integer.parseInt(str.substring(n, n + 1));
      }
    }
  }
  return sum;
}