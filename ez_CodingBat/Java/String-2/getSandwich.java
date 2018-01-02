/*A sandwich is two pieces of bread with something in between. 
  Return the string that is between the first and last appearance of "bread" 
  in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") ¡ú "jam"
getSandwich("xxbreadjambreadyy") ¡ú "jam"
getSandwich("xxbreadyy") ¡ú ""*/

public String getSandwich(String str) {
  String result = "";
  int firstEnd = 0;
  int finalStart = 0;
  int count = 0;
  if(str.length() >= 5){
    for(int n = 0; n < str.length() - 4; n++){
      if(str.substring(n, n + 5).equals("bread")){
        count++;
        if(count == 1){
          firstEnd = n + 4;
        }else{
          finalStart = n;
        }
      }
    }
  }
  if(count > 1){
    result += str.substring(firstEnd + 1, finalStart);
  }
  return result;
}