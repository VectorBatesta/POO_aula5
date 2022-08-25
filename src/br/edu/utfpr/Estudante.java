package br.edu.utfpr;

public class Estudante {
    public String nome;
    private int idade;
    String endereco; //dentro do pacote
    
    //package + filhos
    protected float salario;
    
    public Estudante(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public String getNome(String nome){
        return this.nome;
    }
}
