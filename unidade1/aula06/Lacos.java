public class Lacos {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println("Rodou" + i);
    }

    int i = 0;
    while (i <= 10) {
      System.out.println(i);
      i++;
    }

    int j = 11;
    do {
      System.out.println(j);
      j++;
    } while (j <= 10);
  }
}
