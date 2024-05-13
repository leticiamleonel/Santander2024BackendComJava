public class MyClass {
  public static void main(String[] args) {
    //System.out.print("Olá!");
    
    final String BR = "Brasil"; //essa é uma variável que nunca terá o valor alterado (tudo Maiúsculo)

    //tipos de variáveis
    String primeiroNome = "Leticia";
    String segundoNome = "Moreira";
    int anoFabricacao = 2024;
    boolean verdadeira = true;
    anoFabricacao = 2023;

    //chamada do método
    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    System.out.println(nomeCompleto);

  }
  //métodos
  public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}
