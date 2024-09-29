import java.util.Scanner;

public class Pessoa {
  private String nome;
  private int idade;
  private float peso; 

  public Pessoa (String nome, int idade, float peso) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
  }

  public void exibirInfos() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);
    System.out.println("Peso: " + this.peso);
  }

  public void aniversario() {
    this.idade += 1;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Pessoa pessoa = new Pessoa("Gilvan", 21, 70.0f );
    // pessoa.aniversario();
    // pessoa.exibirInfos();

    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite sua idade: ");
    int idade = Integer.parseInt(scanner.nextLine());

    System.out.print("Digite seu peso: ");
    float peso = Float.parseFloat(scanner.nextLine());
    scanner.close();
    

    Pessoa pessoa = new Pessoa(nome, idade, peso);
    pessoa.exibirInfos();
  }
}