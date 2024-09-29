package aula07;

public class Condicionais {
  public static void main(String[] args) {
    int y = 1;

    if (y <= 10 && y == 1) {
      System.out.println("verdade!");
    } else {
      System.out.println("falso");
    }

    switch (y) {
      case 0:
        System.out.println("valor é 0");
        break;
    
      case 1:
        System.out.println("valor é 1");
        break;

      default:
        System.out.println("valor não encontrado!");
        break;
    }

  }
}
