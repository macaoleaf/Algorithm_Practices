/*We want make a package of goal kilos of chocolate. 
  We have small bars (1 kilo each) and big bars (5 kilos each). 
  Return the number of small bars to use, assuming we always use big bars before small bars. 
  Return -1 if it can't be done.

makeChocolate(4, 1, 9) ¡ú 4
makeChocolate(4, 1, 10) ¡ú -1
makeChocolate(4, 1, 7) ¡ú 2*/

public int makeChocolate(int small, int big, int goal) {
  if((big * 5 + small) >= goal){
    int bigNeeded = (int) goal / 5;
    if(bigNeeded >= big){
      return (goal - big * 5);
    }else{
      if(bigNeeded * 5 + small >= goal){
        return (goal - bigNeeded * 5);
      }else{
        return -1;
      }
    }
  }else{
    return -1;
  }
}