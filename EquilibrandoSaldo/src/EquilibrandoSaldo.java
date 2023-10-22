import java.util.Scanner;

public class EquilibrandoSaldo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        double saldoAtual = sc.nextDouble();
        double valorDeposito = sc.nextDouble();
        double valorRetirada = sc.nextDouble();

    
        double saldo = saldoAtual + valorDeposito;
      
        saldo = saldo - valorRetirada;

        System.out.println("Saldo atualizado na conta: " + (String.format("%.1f", saldo)));

        sc.close();
    }
}