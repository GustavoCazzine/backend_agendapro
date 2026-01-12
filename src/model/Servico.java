package model;

public class Servico {
    //Atributos
    private int id;
    private String descricao;
    private double valor;
    private int duracaoEmMinutos;
    //Construtor
    public Servico(String descricao, double valor, int duracaoEmMinutos) {
        this.descricao = descricao;
        this.valor = valor;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    //Metodos especiais
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "Servicoe{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }
}
