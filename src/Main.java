public class Main {
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria(100,"Danielly");
        System.out.println("Saldo: " + cb1.getSaldo());
        System.out.println("Titular: " + cb1.getTitular());
    }
}