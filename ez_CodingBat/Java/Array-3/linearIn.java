/*Given two arrays of ints sorted in increasing order, outer and inner, 
  return true if all of the numbers in inner appear in outer. 
  The best solution makes only a single "linear" pass of both arrays, 
  taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) ¡ú true
linearIn([1, 2, 4, 6], [2, 3, 4]) ¡ú false
linearIn([1, 2, 4, 4, 6], [2, 4]) ¡ú true*/

public boolean linearIn(int[] outer, int[] inner) {
  boolean linear = false;
  int innerPos = 0;
  if(inner.length == 0){
    linear = true;
  }else{
    for(int n = 0; n < outer.length; n++){
      if(outer[n] == inner[innerPos]){
        innerPos++;
      }
      if(innerPos == inner.length){
        linear = true;
        n = outer.length;
      }
    }
  }
  return linear;
}