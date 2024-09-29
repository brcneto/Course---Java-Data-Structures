package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Unit1_Exercise4 {
  public void main(String[] args) {
    
    List<Integer> arrList = new ArrayList<Integer>();

    Scanner scanner = new Scanner(System.in);

    boolean quest = true;

    do {
      System.out.println("Escolha uma opção");
      System.out.println("1: para adicionar");
      System.out.println("2: para remover");
  
      int option = Integer.parseInt(scanner.nextLine());
  
      if (option == 1) {
        System.out.println("Você selecionou a opção 1, adicionar elemento.");
        System.out.println("Digite o número que você deseja adicionar na Lista");
        arrList.add(Integer.parseInt(scanner.nextLine()));
  
      } else if (option == 2) {
        System.out.println("Você selecionou a opção 2, remover elemento.");
        System.out.println("Digite o índice do elemento que você deseja remover.");
        arrList.remove(Integer.parseInt(scanner.nextLine()));
      }
  
      System.out.println(arrList);
      System.out.println("Escolha uma opção");
      System.out.println("1: para sair");
      System.out.println("qualquer número inteiro para continuar");
      int option2 = Integer.parseInt(scanner.nextLine());
      if (option2 == 1) quest = false;
    } while (quest);
    scanner.close();
  }
}
