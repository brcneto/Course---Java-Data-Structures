package aula03;
import java.util.Scanner;

public class DadosNaoPrimitivos {
  
  public void main (String[] args){
  // tipo caracter não primitivo
    String nome = "Gilvan";


    // tipo enum
    enum DiaDaSemana {
      DOMINGO, SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO
    }
    
    DiaDaSemana dia = DiaDaSemana.DOMINGO;

    // tipo array
    int[] numeros = new int[3];
    int[] numeros2 = {1,2,3,4,5};

    // tipo matriz - array de arrays;
    int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
    // int[][] matriz2 = new int[3][5];

    Scanner scanner = new Scanner(System.in);

    System.out.println(nome);
    System.out.println(dia);
    System.out.println(numeros2[0]);
    System.out.println(matriz[2][1]);
    System.out.print("Digite sua idade: ");
    numeros[0] = Integer.parseInt(scanner.nextLine());
    System.out.println(numeros[0]);
    scanner.close();
  }
}
