/*Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") �� 1
countHi("ABChi hi") �� 2
countHi("hihi") �� 2*/

public int countHi(String str) {
  int count = 0;
  for(int n = 0; n < (str.length() - 1); n++){
    if(str.charAt(n) == 'h' && str.charAt(n + 1) == 'i'){
      count++;
    }
  }
  return count;
}