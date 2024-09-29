package aula02;
public class DadosPrimitivos {
  public static void main(String[] args) {
    // numeros inteiros
    byte valorByte = 127;      // -128 - 127
    short valorShort = -32768; // -32768 - 32767
    int valorInt = -2147483648; // -2147483648 - 2147483647
    long valorLong = 9223372036854775807L; //-9223372036854775808L - 9223372036854775807L

    // numeros flutuantes
    float valorFloat = 3.14f;
    double valorDouble = 3.141519;

    // caracteres
    char character = 'a'; 

    // booleano
    boolean falso = false;

    // const
    final float nPi = 3.14f;

    System.out.println(valorByte);
    System.out.println(valorShort);
    System.out.println(valorInt);
    System.out.println(valorLong);
    System.out.println(valorFloat);
    System.out.println(valorDouble);
    System.out.println(character);
    System.out.println(falso);
    System.out.println(nPi);
  }
}
