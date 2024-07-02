import Armas.Alabarda;
import Armas.Arma;
import Armas.Espada;
import Armas.EspadaLonga;
import Armas.Lanca;
import Armas.Maca;
import Armas.Martelo;
import Armas.Psikappa;
import Armas.Transmutacao;
import Feature.Dice;
import Itens.Itens;
import Itens.Poison;
import Itens.PotionHeal;
import Itens.PotionMage;
import Personagens.Clerigo;
import Personagens.Guerreiro;
import Personagens.Mago;
import Personagens.Paladino;
import Personagens.Personagem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RPG {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("\n******Bem vindo ao RPG The game******\n");
        Personagem personagem1 = criarPersonagem(scanner);
        Personagem inimigo = criar_inimigo(scanner);
        int ponto_up = 3;
        personagem1.printStatus();
        inimigo.printStatus();

    //     while (true) {
    //         System.out.println("Digite o número do personagem atacante e defensor (ou 0 0 para terminar):");
    //         int atacante = scanner.nextInt();
    //         int defensor = scanner.nextInt();

    //         if (atacante == 0 && defensor == 0) {
    //             break;
    //         }

    //         if (atacante == 1 && defensor == 2) {
    //             personagem1.atacar(personagem2);
    //         } else if (atacante == 2 && defensor == 1) {
    //             personagem2.atacar(personagem1);
    //         } else {
    //             System.out.println("Entrada inválida.");
    //         }
        Up(personagem1, scanner, ponto_up);
        personagem1.printStatus();
    //         personagem2.printStatus();
    //     }

        Combate(personagem1,inimigo,scanner);
     }

    private static Personagem criarPersonagem(Scanner scanner) {
        
        
        System.out.println("escolha sua classe:\n1-Mago\n2-Paladino\n3-Clerigo\n4-Guerreiro\n5-para ver os status");
        System.out.printf("--> ");
        int tipo = scanner.nextInt();
        
        while(true){
        if (tipo == 1){
            System.out.println("qual arma deseja :\n1-Transmutacao\n2-Psikappa");
            System.out.printf("--> ");
            break;
        }
    
        else if (tipo == 2){
            System.out.println("qual arma deseja :\n1-Espada\n2-Lanca");
            System.out.printf("--> ");
            break;
        }
        else if (tipo == 3){
            System.out.println("qual arma deseja :\n1-Martelo\n2-Maca");
            System.out.printf("--> ");
            break;
        }
        else if (tipo == 4){
            System.out.println("qual arma deseja : \n1-Espada Longa\n2-Alabarda");
            System.out.printf("--> ");
            break;
        }
        else if (tipo == 5){
            Mago.Print_status();
            Guerreiro.Print_status();
            Paladino.Print_status();
            Clerigo.Print_status();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nescolha sua classe:\n1-Mago\n2-Paladino\n3-Clerigo\n4-Guerreiro\n5-para ver os status");
        System.out.printf("--> ");
        tipo = scanner.nextInt();
    }
        int arma = scanner.nextInt();
        List<Itens> itens = new ArrayList<>();
        System.out.println("escolha seu item inicial:\n1-Pocao de cura\n2-Pocao de magia\n3-Veneno");
        System.out.printf("-->");
        int it = scanner.nextInt();
        itens.add(CriarItens(it));

        switch (tipo) {
            case 1:
                return new Mago(criarArmaMago(arma),itens);
            case 2:
                return new Paladino(criarArmaPaladino(arma),itens);
            case 3:
                return new Clerigo(criarArmaClerigo(arma),itens);
            case 4:
                return new Guerreiro(criarArmaGuerreiro(arma),itens);
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
    private static Arma criarArmaGuerreiro(int codigo){
        switch (codigo) {
            case 1:
                return new EspadaLonga();
            case 2:
                return new Alabarda();
            default:
                throw new IllegalArgumentException("Código de arma inválido para Guerreiro.");
        }
    }
    private static Itens CriarItens(int codigo){
        switch (codigo) {
            case 1:
                return new PotionHeal();
            case 2:
                return new PotionMage();
            case 3:
                return new Poison();
            default:
                throw new IllegalArgumentException("Código de item inválido.");
        }

    }
    private static void Up (Personagem personagem1, Scanner scanner,int ponto_up){
        
        for (;ponto_up > 0; ponto_up--) {
            System.out.println("Voce tem "+ponto_up+" para usar");
            System.out.println("\nEscolha o atributo que gostaria de melhorar: \n[1-saude,2-forca,3-destreza,4-magia,5-fe,6-defesa]");
            System.out.printf("--> ");
            int val = scanner.nextInt();
            personagem1.Upgrade(val);
        }
        
    }
    
    private static Personagem criar_inimigo(Scanner scanner){
        Dice dice = new Dice();
        int perso = dice.getInimigo();
        int arm = dice.getArma();
        int ite = dice.getItem();
        List<Itens> itens = new ArrayList<>();
        itens.add(CriarItens(ite));
        switch (perso) {
            case 1:
                return new Mago(criarArmaMago(arm),itens);
            case 2:
                return new Paladino(criarArmaPaladino(arm),itens);
            case 3:
                return new Clerigo(criarArmaClerigo(arm),itens);
            case 4:
                return new Guerreiro(criarArmaGuerreiro(arm),itens);
            default:
                throw new IllegalArgumentException("Tipo de personagem inválido.");
        }
     }
     public static void Combate (Personagem personagem, Personagem inimigo,Scanner scanner){
        while (true){
            System.out.println("********** Hora do combate **********");
            System.out.println("Escolha sua proxima acao:\n1-Atacar\n2-Usar item\n3-Ver status");
            System.out.printf("-->");
            int escolha = scanner.nextInt();
            if(escolha == 1){
                personagem.atacar(inimigo);
            }
            else if(escolha == 2){
                personagem.printItens();
            }
            else if (escolha == 3){
                personagem.printStatus();
                inimigo.printStatus();
            }
            }
            

        }
     }

   

