/*Given n>=0, create an array length n*n with the following pattern, 
  shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} 
(spaces added to show the 3 groups).

squareUp(3) ¡ú [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) ¡ú [0, 1, 2, 1]
squareUp(4) ¡ú [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]*/

public int[] squareUp(int n) {
  int[] result = new int[n * n];
  int pos = 0;
  int fig = 0;
  for(int x = 1; x <= n; x++){
    for(int y = 1; y <= n; y++){
      if((x + y) <= n){
        fig = 0;
      }else{
        fig = n + 1 - y;
      }
      result[pos] = fig;
      pos++;
    }
  }
  return result;
}