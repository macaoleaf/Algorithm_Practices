/*Given 2 strings, a and b, 
  return the number of the positions where they contain the same length 2 substring. 
  So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", 
  and "az" substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") ¡ú 3
stringMatch("abc", "abc") ¡ú 2
stringMatch("abc", "axc") ¡ú 0*/

public int stringMatch(String a, String b) {
  int count = 0;
  int shorterLength = 0;
  if(a.length() < b.length()){
    shorterLength = a.length();
  }else{
    shorterLength = b.length();
  }
  for(int n = 0; n < (shorterLength - 1); n++){
    if(a.substring(n, n + 2).equals(b.substring(n, n + 2))){
      count++;
    }
  }
  return count;
}

/*Comment:
remember to use .equals() when it comes to strings.
also the length is 2, so the boundary should be (.length() - 1)*/