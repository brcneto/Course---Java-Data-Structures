package exercises;

public class Unit2_Exercise1 {
  public void main (String[] args) {
    int[] numsList = {1,2,3,4,5};

    for (int i = 0; i < numsList.length; i++) {
      System.out.println(numsList[i]);
      numsList[i] = (numsList.length  - i);
      System.out.println(numsList[i]);
    }
  }
}
