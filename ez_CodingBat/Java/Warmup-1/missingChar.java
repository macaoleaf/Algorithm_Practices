/*Given a non-empty string and an int n, 
  return a new string where the char at index n has been removed. 
  The value of n will be a valid index of a char in the original string 
  (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) ¡ú "ktten"
missingChar("kitten", 0) ¡ú "itten"
missingChar("kitten", 4) ¡ú "kittn"*/

public String missingChar(String str, int n) {
  String change = "";
  if(str.length() - 1 == n){
    if(n != 0){
      change = str.substring(0, n);
    }else{
      change = "";
    }
  }else if(n == 0){
    change = str.substring(1, str.length());
  }else{
    change = str.substring(0, n) + str.substring(n + 1,str.length());
  }
  return change;
}

/*public String missingChar(String str, int n) {
  String front = str.substring(0, n);
  
  // Start this substring at n+1 to omit the char.
  // Can also be shortened to just str.substring(n+1)
  // which goes through the end of the string.
  String back = str.substring(n+1, str.length());
  
  return front + back;
}

comment: reason why I wrote such a long piece of codes......
still not familiar with substring (now I guess it contains the head and ignores the bottom)
need more practice...*/