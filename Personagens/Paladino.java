package Personagens;
import Armas.Arma;
import Itens.Itens;
import java.util.List;

// falta implementar a arma para o personagem ainda 

public class Paladino extends Personagem {
    
    public Paladino (Arma arma, List<Itens> itens ){
        super("Paladino",6 ,7 ,4 ,arma, 2, 2, 4, itens);
    }
    
    public static void Print_status(){
        System.out.println("O status inicial do Paladino [forca:7, saude:6, destreza:4, magia:2, fe:2, defesa:4]");
    }

}
