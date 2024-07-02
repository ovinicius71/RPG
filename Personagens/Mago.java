package Personagens;
import Armas.Arma;
import Itens.Itens;
import java.util.List;

// falta implementar a arma para o personagem ainda 

public class Mago extends Personagem{
    
    public Mago (Arma arma, List<Itens> itens){
        
        super("Mago", 4, 3, 3,arma, 8, 4, 3, itens);
    }
    
    public static void Print_status(){
        System.out.println("O status inicial do Mago [forca:3, saude:4, destreza:3, magia:8, fe:4, defesa:3]");
    }

}
