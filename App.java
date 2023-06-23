public class App {
    
    public static void main(String[] args) {
        
        contaBancaria rafa = new contaBancaria();
        rafa.setTitular("Rafa");
        rafa.setSaldo(200);
        rafa.setNumeroConta(111222333);

        contaBancaria rafael = new contaBancaria();
        rafael.setTitular("Rafael");
        rafael.setSaldo(500);
        rafael.setNumeroConta(444555666);

        System.out.println("Saldos iniciais");
        System.out.println("Saldo do Rafa R$" + rafa.getSaldo());
        System.out.println("Saldo do Rafael R$" + rafael.getSaldo());

        rafa.depositar(450);
        rafa.sacar(400);
        rafa.transferir("Rafael", 200); rafael.depositar(200);

        rafael.depositar(250);
        rafael.sacar(100);
        rafael.transferir("Rafa", 300); rafa.depositar(300);

        System.out.println("\nSaldos finais");
        System.out.println("Saldo do Rafa R$" + rafa.getSaldo());
        System.out.println("Saldo do Rafael R$" + rafael.getSaldo());
    }
}
