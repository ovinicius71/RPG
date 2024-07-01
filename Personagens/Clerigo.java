package Personagens;
import Armas.Arma;

// falta implementar a arma para o personagem ainda 

public class Clerigo extends Personagem {
    
    public Clerigo (Arma arma){

        super("Clerigo", 4, 3, 3, arma,3,8,4);
    }


    void Print_status(){
        System.out.println("O status inicial do Clerigo [forca:3, saude:4, destreza:3, magia:4, fe:8, defesa:4]");
    }


}