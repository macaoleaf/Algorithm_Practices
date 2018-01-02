/*Given a string, return the length of the largest "block" in the string. 
  A block is a run of adjacent chars that are the same.

maxBlock("hoopla") ¡ú 2
maxBlock("abbCCCddBBBxx") ¡ú 3
maxBlock("") ¡ú 0*/

public int maxBlock(String str) {
  int count = 1;
  int total = 1;
  if(str.length() == 0){
    total = 0;
  }else{
    for(int n = 1; n < str.length(); n++){
      if(str.charAt(n) == str.charAt(n - 1)){
        count++;
        if(count > total){
          total = count;
        }
      }else{
        count = 1;
      }
    }
  }
  return total;
}