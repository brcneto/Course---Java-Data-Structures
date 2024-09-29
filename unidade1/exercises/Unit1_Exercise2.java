package exercises;

import java.util.Scanner;

public class Unit1_Exercise2 {

  public void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Escreva um número: ");
    int number = Integer.parseInt(scanner.nextLine());

    if (number % 2 == 0) {
      System.out.print("O número é par");
    } else {
      System.out.print("O número é ímpar");
    }
    scanner.close();
  }
}
