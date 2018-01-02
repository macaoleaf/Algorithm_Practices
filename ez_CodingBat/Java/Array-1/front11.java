/*Given 2 int arrays, a and b, of any length, 
  return a new array with the first element of each array. 
  If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) ¡ú [1, 7]
front11([1], [2]) ¡ú [1, 2]
front11([1, 7], []) ¡ú [1]*/

public int[] front11(int[] a, int[] b) {
  int num = 0;
  if(a.length != 0 && b.length != 0){
    num = 2;
  }else if(a.length != 0 && b.length == 0){
    num = 1;
  }else if(a.length == 0 && b.length != 0){
    num = 1;
  }else{
    num = 0;
  }
  int[] result = new int[num];
  if(num == 2){
    result[0] = a[0];
    result[1] = b[0];
  }else if(num == 1){
    if(b.length == 0){
      result[0] = a[0];
    }else{
      result[0] = b[0];
    }
  }
  return result;
}