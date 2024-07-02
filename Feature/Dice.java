package Feature;

import java.util.Random;

public class Dice {
    
    public int getDamageDice(){
        Random gerador = new Random();
        return gerador.nextInt(11);
    }
    public int getProbability(){
        Random gerador = new Random();
        return gerador.nextInt(11);
    }
    public int getInimigo(){
        Random gerador = new Random();
        return  gerador.nextInt(1,5);
    }
    public int getArma(){
        Random gerador = new Random();
        return  gerador.nextInt(1,3);
    }
    public int getItem(){
        Random gerador = new Random();
        return gerador.nextInt(1,4);
    }
}
