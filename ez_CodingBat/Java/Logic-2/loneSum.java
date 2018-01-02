/*Given 3 int values, a b c, return their sum. 
  However, if one of the values is the same as another of the values, 
  it does not count towards the sum.

loneSum(1, 2, 3) ¡ú 6
loneSum(3, 2, 3) ¡ú 2
loneSum(3, 3, 3) ¡ú 0*/

public int loneSum(int a, int b, int c) {
  if(a != b && b != c && a != c){
    return (a + b + c);
  }else if(a == b && b == c){
    return 0;
  }else if(a == b){
    return c;
  }else if(b == c){
    return a;
  }else{
    return b;
  }
}

/*Solution:

public int loneSum(int a, int b, int c) {
  int sum = 0;
  if (a != b && a != c) {
    sum += a;
  }
  if (b != a && b != c) {
    sum += b;
  }
  if (c != a && c != b) {
    sum += c;
  }
  return sum;
  
  // Solution notes: this code is a pretty direct translation
  // of the problem statement.
  // For each of a/b/c, check that it is different from
  // the other two before adding it to the sum variable
}
Almost the same.*/