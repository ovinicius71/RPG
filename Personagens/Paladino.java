package Personagens;
import Armas.Arma;

// falta implementar a arma para o personagem ainda 

public class Paladino extends Personagem {
    
    public Paladino (Arma arma ){
        super("Paladino",6 ,7 ,4 ,arma, 2, 2, 4 );
    }
    
    void Print_status(){
        System.out.println("O status inicial do Paladino [forca:7, saude:6, destreza:4, magia:2, fe:2, defesa:4]");
    }

}
