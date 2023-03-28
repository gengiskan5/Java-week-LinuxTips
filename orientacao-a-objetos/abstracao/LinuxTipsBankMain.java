
public class LinuxTipsBankMain {

    public static void main(String[] args) {

        System.out.println("Seja bem vinda ao linux tips bank");
        ContaCorrente contapoupancaKamila = new ContaCorrente();
        contapoupancaKamila.consultarSaldo();
        contapoupancaKamila.fazerPix();


        ContaPoupanca cpKamila = new ContaPoupanca();
        contapoupancaKamila.consultarSaldo();
        contapoupancaKamila.fazerPix();

    }
}
