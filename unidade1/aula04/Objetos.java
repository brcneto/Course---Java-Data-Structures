package aula04;
public class Objetos {
  // ATRIBUTOS
  private String nome;
  private int idade;
  private float peso;

  // constructor
  public Objetos (String nome, int idade, float peso) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
  }

  public void exibeInfos() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);
    System.out.println("Peso: " + this.peso);
  }
  public static void main (String[] args) {
    Objetos pessoa = new Objetos("Gilvan", 21, 70.00f);
    pessoa.exibeInfos();
  }
}
