import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá seja bem vindo! Como voce se chama?");
        String nome = scanner.nextLine();

        System.out.println("Digite por favor seu CPF com pontos e hífen:");
        String cpf = scanner.nextLine();

        System.out.println("E sobre seu estado civil?");
        String civil = scanner.nextLine();

        System.out.println("Por favor, digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Agora por favor sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Quanto você pesa? (somente números)");
        double peso = scanner.nextDouble();



        scanner.close();

        System.out.println("Vamos checar seus dados, " + nome + ", você tem " +idade+" anos? Seu CPF: " + cpf + ", está certo? Voce está realmente " + civil + "? Pesa " + peso + "kgs e tem " +altura+ " de altura?");

    }
}
