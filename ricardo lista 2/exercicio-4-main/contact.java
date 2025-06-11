package ex4_classes;


public class Contact {
    private String nome;
    private String telefone;
    private String email;
    
    public Contact(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}
