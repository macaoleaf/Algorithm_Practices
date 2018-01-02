/*Given a string, 
  return the count of the number of times that a substring length 2 appears in the string 
  and also as the last 2 chars of the string, so "hixxxhi" yields 1 
  (we won't count the end substring).

last2("hixxhi") ¡ú 1
last2("xaxxaxaxx") ¡ú 1
last2("axxxaaxx") ¡ú 2*/

public int last2(String str) {
  int count = 0;
  if(str.length() <= 2){
    return 0;
  }else{
    String ruler = str.substring(str.length() - 2);
    for(int n = 0; n < (str.length() - 2); n++){
      if(str.substring(n, n + 2).equals(ruler)){
        count++;
      }
    }
  }
  return count;
}

/*Notice:
 * remember the exception when the length is too small.*/