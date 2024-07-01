package Personagens;
import Armas.Arma;

public class Guerreiro extends Personagem {

    public Guerreiro(Arma arma){
        super("Guerreiro", 5, 5, 5,arma, 2, 3, 5);

    }

    void Print_status(){
        System.out.println("O status inicial do Clerigo [forca:5, saude:5, destreza:5, magia:2, fe:3, defesa:5]");
    }

}
