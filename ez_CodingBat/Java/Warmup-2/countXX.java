/*Count the number of "xx" in the given string. 
  We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") �� 1
countXX("xxx") �� 2
countXX("xxxx") �� 3*/

int countXX(String str) {
  int count = 0;
  for(int n = 0; n < (str.length() - 1); n++){
    if(str.charAt(n) == 'x' && str.charAt(n + 1) == 'x'){
      count++;
    }
  }
  return count;
}