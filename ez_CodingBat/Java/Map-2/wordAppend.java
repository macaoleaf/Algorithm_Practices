/*Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.


wordAppend(["a", "b", "a"]) ¡ú "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) ¡ú "aa"
wordAppend(["a", "", "a"]) ¡ú "a"*/

public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap();
  String result = "";
  for(String temp : strings){
    if(map.containsKey(temp)){
      map.put(temp, map.get(temp)+1);
    }else{
      map.put(temp, 1);
    }
    if(map.get(temp) % 2 == 0){
      result = result + temp;
    }
  }
  return result;
}