/*Given a string, count the number of words ending in 'y' or 'z' -- 
  so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" 
  (not case sensitive). 
  We'll say that a y or z is at the end of a word 
  if there is not an alphabetic letter immediately following it. 
  (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

countYZ("fez day") ¡ú 2
countYZ("day fez") ¡ú 2
countYZ("day fyyyz") ¡ú 2*/

public int countYZ(String str) {
  int count = 0;
  if(str.length() != 0){
    for(int n = 0; n < str.length(); n++){
      if(str.substring(n, n + 1).toLowerCase().equals("y") || 
         str.substring(n, n + 1).toLowerCase().equals("z")){
        if(n == str.length() - 1){
          count++;
        }else if(!Character.isLetter(str.charAt(n + 1))){
          count++;
        }
      }
    }
  }
  return count;
}