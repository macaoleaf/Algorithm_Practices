/*Return the number of times that the string "code" appears anywhere in the given string, 
  except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") ¡ú 1
countCode("codexxcode") ¡ú 2
countCode("cozexxcope") ¡ú 2*/

public int countCode(String str) {
  int count = 0;
  for(int n = 0; n < (str.length() - 3); n++){
    if(str.substring(n, n + 2).equals("co") && str.charAt(n + 3) == 'e'){
      count++;
    }
  }
  return count;
}