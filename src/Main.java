import java.util.Scanner;
import Bot.Bot;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Olá sou o (insira um bom nome de bot aqui), o unico motivo da minha triste e limitada existencia é auxilia-lo a utilizar o SIGAA, qual a sua duvida?");
        Bot.responde(input.nextLine());
    }
}