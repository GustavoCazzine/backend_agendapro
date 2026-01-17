package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agendamento {
    //Atributos
    private int id;
    private Cliente cliente;
    private Profissional profissional;
    private Servico servico;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime datahoraFim;
    private double valorPago;
    //Formatar data
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    //Contrutor
    public Agendamento(Cliente cliente, Profissional profissional, Servico servico, LocalDateTime dataHoraInicio, double valorPago) {
        this.cliente = cliente;
        this.profissional = profissional;
        this.servico = servico;
        this.dataHoraInicio = dataHoraInicio;
        this.datahoraFim = dataHoraInicio.plusMinutes(servico.getDuracaoEmMinutos());
        this.valorPago = valorPago;
    }
    //Metodos especiais
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDatahoraFim() {
        return datahoraFim;
    }

    public void setDatahoraFim(LocalDateTime datahoraFim) {
        this.datahoraFim = datahoraFim;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "id=" + id +
                ", cliente=" + cliente.getNome() + // Dica: Pegue só o nome para não poluir
                ", profissional=" + profissional.getNome() + // Dica: Pegue só o nome
                ", servico=" + servico.getDescricao() +
                ", inicio=" + dataHoraInicio.format(formatador) + // <--- AGORA SIM
                ", fim=" + datahoraFim.format(formatador) +       // <--- AGORA SIM
                ", pago= R$" + valorPago +
                '}';
    }
}
