package aula08;

public class Pessoa2 {
  private String nome;
  private int idade;
  private float peso;
  private float altura;
  private boolean habilitada;

  public Pessoa2(String nome, int idade, float peso, float altura, boolean habilitada) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
    this.habilitada = habilitada;
  }
  
  public void exibirInfos() {
    System.out.println("nome: " + nome);
    System.out.println("idade: " + idade);
    System.out.println("peso: " + peso);
    System.out.println("altura: " + altura);
  }
  
  public void testarAltura(float alturaTeste) {
    if (alturaTeste <= this.altura) {
      System.out.println("Autorizado a entrada");
    } else {
      System.out.println("Entrada não autorizada");
    }
  }

  public void testarIdade(int idadeTeste) {
    if (idadeTeste <= this.idade) {
      System.out.println("Autorizado a entrada"); 
    } else {
      System.out.println("Entrada não autorizada");
    }  
  }

  public float testeDeIMC() {
    float IMC = this.peso/(this.altura * this.altura);

    if (IMC < 18.5) {
      System.out.println("Magreza");
    } else if (IMC >= 18.5 && IMC < 24.9) {
      System.out.println("Normal");
    } else if (IMC >= 25 && IMC < 29.9) {
      System.out.println("Sobrepeso");
    } else if (IMC >= 30 && IMC < 34.9) {
      System.out.println("Obesidade grau I");
    } else if (IMC >= 35 && IMC < 39.9) {
      System.out.println("Obesidade grau II");
    } else if (IMC > 40) {
      System.out.println("Obesidade grau III");
    }

    return IMC;
  }

  public void testeDeHabilitacao(){
    if (this.habilitada) {
      System.out.println("Pessoa Habilitada");
    } else {
      System.out.println("Pessoa Não Habilitada");
    }
  }
  
  public static void main(String[] args) {
    Pessoa2 pessoa1 = new Pessoa2("Gilvan", 21, 68.00f, 1.70f, true);
    
    pessoa1.exibirInfos();
    pessoa1.testarIdade(13);
  }
}
