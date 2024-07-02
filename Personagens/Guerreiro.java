package Personagens;
import Armas.Arma;
import Itens.Itens;
import java.util.List;

public class Guerreiro extends Personagem {

    public Guerreiro(Arma arma, List<Itens> itens){
        super("Guerreiro", 5, 5, 5,arma, 2, 3, 5, itens);

    }

    public static void Print_status(){
        System.out.println("O status inicial do Guerreiro [forca:5, saude:5, destreza:5, magia:2, fe:3, defesa:5]");
    }

}
