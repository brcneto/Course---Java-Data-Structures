package exercises;

public class Unit1_Exercise5 {
  public void main (String[] args) {
    int[][] matriz = {{1,2,3},{4,5,6},{9,8,1}};

    int maiorValorDaMatriz = matriz[0][0];
    for (int[] lista : matriz) {
      for (int item : lista) {
        if (item > maiorValorDaMatriz) {
          maiorValorDaMatriz = item;
        }
      }
    }

    System.out.println(maiorValorDaMatriz);
  }
}
