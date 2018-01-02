/*Given a string, 
  take the first 2 chars and return the string with the 2 chars added at both the front and back,
  so "kitten" yields"kikittenki". 
  If the string length is less than 2, use whatever chars are there.

front22("kitten") ¡ú "kikittenki"
front22("Ha") ¡ú "HaHaHa"
front22("abc") ¡ú "ababcab"*/
  
  public String front22(String str) {
  String change = "";
  if(str.length() < 3){
    change = str + str + str;
  }else{
    change = str.substring(0, 2) + str + str.substring(0, 2);
  }
  return change;
}
  
/*Solution:
public String front22(String str) {
  // First figure the number of chars to take
  int take = 2;
  if (take > str.length()) {
    take = str.length();
  }
  
  String front = str.substring(0, take);
  return front + str + front;
}
almost same thinking. */