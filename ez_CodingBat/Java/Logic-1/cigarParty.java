/*When squirrels get together for a party, they like to have cigars. 
  A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
  Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
  Return true if the party with the given values is successful, or false otherwise.

cigarParty(30, false) ¡ú false
cigarParty(50, false) ¡ú true
cigarParty(70, true) ¡ú true*/
  
public boolean cigarParty(int cigars, boolean isWeekend) {
  return (isWeekend && cigars >= 40 || cigars >= 40 && cigars <= 60);
}

/*Our Solution:

public boolean cigarParty(int cigars, boolean isWeekend) {
  if (isWeekend) {
    return (cigars >= 40);
    // A longer way to write the above line:
    // if (cigars >= 40) {
    //   return true;
    // } else {
    //   return false;
    // }
  } else {
    return (cigars >= 40 && cigars <= 60);
  }
}*/