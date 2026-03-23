import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola seja bem vindo! Como voce se chama?");
        String nome = scanner.nextLine();

        System.out.println("Digite por favor seu CPF com pontos e hifen:");
        String cpf = scanner.nextLine();

        System.out.println("E sobre seu estado civil?");
        String civil = scanner.nextLine();

        System.out.println("Por favor, digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Agora por favor sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Quanto voce pesa?");
        double peso = scanner.nextDouble();



        scanner.close();

        System.out.println("Vamos checar seus dados, " + nome + ", seu CPF: " + cpf + ", esta certo? Voce esta realmente " + civil + "?");

    }
}
