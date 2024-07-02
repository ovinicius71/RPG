package Itens;

public abstract class Itens {
    String nome;
    String utilidade;
    public Itens(String nome,String utilidade){
        this.nome = nome;
        this.utilidade = utilidade;

    }
    public String getNomeItem(){
        return nome;
    }
    
}
