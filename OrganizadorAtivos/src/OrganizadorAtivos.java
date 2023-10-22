import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrganizadorAtivos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();

    //Entrada dos tipos de ativos
    System.out.println("Quantidade de ativos: ");
    int quantidadeAtivos = sc.nextInt();

    // Entrada dos códigos dos ativos
    for (int i = 0; i <= quantidadeAtivos; i++) {
      System.out.println("Digite qual sera o ativo:");
      String codigoAtivo = sc.nextLine();
      ativos.add(codigoAtivo);
    }

    //TODO: Ordenar os ativos em ordem alfabética.
    Collections.sort(ativos);
   
    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    for (String ativo : ativos) {
    System.out.println(ativo);
    }

  sc.close();
}
}
