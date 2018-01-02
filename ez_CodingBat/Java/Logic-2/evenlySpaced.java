/*Given three ints, a b c, one of them is small, one is medium and one is large. 
  Return true if the three values are evenly spaced, 
  so the difference between small and medium is the same as 
  the difference between medium and large.

evenlySpaced(2, 4, 6) ¡ú true
evenlySpaced(4, 6, 2) ¡ú true
evenlySpaced(4, 6, 3) ¡ú false*/
  
public boolean evenlySpaced(int a, int b, int c) {
  if(a >= b && b >= c){
    return (a - b == b - c);
  }else if(a >= c && c >= b){
    return (a - c == c - b);
  }else if(b >= a && a >= c){
    return (b - a == a - c);
  }else if(b >= c && c >= a){
    return (b - c == c - a);
  }else if(c >= a && a >= b){
    return (c - a == a - b);
  }else{
    return (c - b == b - a);
  }
}