package exercises;

public class Unit2_Exercise2 {
  int[] numsList = {1,2,3,4,5,5,2,1,2,3};
  
  public void removeDuplicateItems () {
    int[] newNumsList = {};

    for (int i : numsList) {
      if (i == 0) {
        newNumsList[0] = numsList[0];
      }
      
      boolean hasItem = false;

      for (int j : newNumsList) {
        hasItem = numsList[i] == newNumsList[j];
        if (hasItem) break;
      }

      if (!hasItem) newNumsList[newNumsList.length] = numsList[i];
    }

    numsList = newNumsList;
  }
  
  public void main (String[] args) {
    System.out.println(numsList.length);
    removeDuplicateItems();

  }
}
