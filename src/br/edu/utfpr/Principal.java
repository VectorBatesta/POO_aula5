package br.edu.utfpr;

public class Principal {
    
    public static void main(String[] args) {
        new Principal();
    }
    
    public Principal() {
        Estudante joao = new Estudante("joao", 18);
        Estagiario maria = new Estagiario("maria");
        
        joao.getNome(maria.getNome());
    }
}