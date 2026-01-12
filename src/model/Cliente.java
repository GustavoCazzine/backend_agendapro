package model;

public class Cliente {
    //Atributos
    private int id;
    private String nome;
    private String telefone;
    //Construtor
    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    //Metodos especiais
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
