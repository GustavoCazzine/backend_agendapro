package model;

public class Cliente {
    //Atributos
    private int id;
    private String nome;
    private String telefone;
    private int pontosFidelidade;
    //Construtor
    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    //Metodos
    public void adicionarPonto(){
        this.pontosFidelidade += 1;
    }

    public void zerarPontos(){
        this.pontosFidelidade = 0;
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

    public int getPontosFidelidade() {
        return pontosFidelidade;
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
