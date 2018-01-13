/* Given a string, compute recursively the number of times lowercase "hi" appears in the string, 
 * however do not count "hi" that have an 'x' immedately before them.


countHi2("ahixhi") ¡ú 1
countHi2("ahibhi") ¡ú 2
countHi2("xhixhi") ¡ú 0*/

public int countHi2(String str) {
  if(str.length() <= 2){
    if(str.equals("hi")) return 1;
    else return 0;
  }
  if(str.substring(0, 3).equals("xhi")) return countHi2(str.substring(3));
  if(str.substring(0, 2).equals("hi")){
    return 1 + countHi2(str.substring(2));
  }
  return countHi2(str.substring(1));
}