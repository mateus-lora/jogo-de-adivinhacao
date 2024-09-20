import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Random geradorAleatorio = new Random();
        int numeroAleatorio = geradorAleatorio.nextInt(100) + 1; // Como o intervalo é de 1 a 100, fiz dessa forma, assim ele vai gerar de 0 a 99 e somo + 1, pois seu pôr apenas o 101 ele vai gerar o 0 junto.
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("""
                Bem-vindo ao JOGO DA ADIVINHAÇÃO!
                Você deve adivinhar o número inteiro secreto, presente no intervalo de 1 a 100.
                Porém possui apenas 10 tentativas.
                Está pronto? PRESS ENTER""");
        lerTeclado.nextLine();
        System.out.print("\033[H\033[2J");
        int tentativas = 10;
        int numeroUsuario;
        do {
            System.out.printf("Restam " + tentativas + " tentativas \nInsira um número: ");
            numeroUsuario = lerTeclado.nextInt();
            tentativas--;
            System.out.print("\033[H\033[2J");
            if (numeroUsuario > numeroAleatorio) {
                System.out.println(numeroUsuario + " é MAIOR do número secreto.");
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println(numeroUsuario + " é MENOR do número secreto.");
            } else {
                break;
            }
        } while (tentativas >= 1);
        System.out.print("\033[H\033[2J");
        if (numeroAleatorio == numeroUsuario) {
            System.out.println(numeroUsuario + " é IGUAL ao número secreto.\nParabéns! Você ACERTOU após " + (10 - tentativas) + " tentativas.");
        } else {
            System.out.println("Não foi dessa vez! \nVocê esgotou suas tentativas e NÃO ACERTOU o número secreto.");
        }
        lerTeclado.close();
    }
}       