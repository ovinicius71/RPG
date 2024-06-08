import Armas.Arma;
import Armas.Espada;
import Armas.Lanca;
import Armas.Maca;
import Armas.Martelo;
import Armas.Psikappa;
import Armas.Transmutacao;
import Personagens.Clerigo;
import Personagens.Mago;
import Personagens.Paladino;
import Personagens.Personagem;
import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("\n******Bem vindo ao RPG The game******\n");
        Personagem personagem1 = criarPersonagem(scanner);
        System.out.println("Digite os detalhes do segundo personagem:");
        Personagem personagem2 = criarPersonagem(scanner);

        personagem1.printStatus();
        personagem2.printStatus();

        while (true) {
            System.out.println("Digite o número do personagem atacante e defensor (ou 0 0 para terminar):");
            int atacante = scanner.nextInt();
            int defensor = scanner.nextInt();

            if (atacante == 0 && defensor == 0) {
                break;
            }

            if (atacante == 1 && defensor == 2) {
                personagem1.atacar(personagem2);
            } else if (atacante == 2 && defensor == 1) {
                personagem2.atacar(personagem1);
            } else {
                System.out.println("Entrada inválida.");
            }

            personagem1.printStatus();
            personagem2.printStatus();
        }

        scanner.close();
    }

    private static Personagem criarPersonagem(Scanner scanner) {
        System.out.println("escolha sua classe:\n1-Mago\n2-Paladino\n3-Clerigo");
        System.out.printf("--> ");
        int tipo = scanner.nextInt();
        System.out.println("quantos pontos de saude desejas (0-10)");
        System.out.printf("--> ");
        double saude = scanner.nextDouble();
        System.out.println("quantos pontos de forca desejas (0-10)");
        System.out.printf("--> ");
        double forca = scanner.nextDouble();
        System.out.println("quantos pontos de destreza desejas (0-10)");
        System.out.printf("--> ");
        double destreza = scanner.nextDouble();
        if (tipo == 1){
            System.out.println("qual arma desejas:\n1-Transmutacao\n2-Psikappa");
            System.out.printf("--> ");
        }
        else if (tipo == 2){
            System.out.println("qual arma desejas:\n1-Espada\n2-Lanca");
            System.out.printf("--> ");
        }
        else if (tipo == 3){
            System.out.println("qual arma desejas:\n1-Martelo\n2-Maca");
            System.out.printf("--> ");
        }
        int arma = scanner.nextInt();

        switch (tipo) {
            case 1:
                return new Mago(saude, forca, destreza, criarArmaMago(arma));
            case 2:
                return new Paladino(saude, forca, destreza, criarArmaPaladino(arma));
            case 3:
                return new Clerigo(saude, forca, destreza, criarArmaClerigo(arma));
            default:
                throw new IllegalArgumentException("Tipo de personagem inválido.");
        }
        }
        
    private static Arma criarArmaMago(int codigo) {
        switch (codigo) {
            case 1:
                return new Transmutacao();
            case 2:
                return new Psikappa();
            default:
                throw new IllegalArgumentException("Código de arma inválido para Mago.");
        }
    }

    private static Arma criarArmaPaladino(int codigo) {
        switch (codigo) {
            case 1:
                return new Espada();
            case 2:
                return new Lanca();
            default:
                throw new IllegalArgumentException("Código de arma inválido para Paladino.");
        }
    }

    private static Arma criarArmaClerigo(int codigo) {
        switch (codigo) {
            case 1:
                return new Martelo();
            case 2:
                return new Maca();
            default:
                throw new IllegalArgumentException("Código de arma inválido para Clérigo.");
        }
    }
}

    

