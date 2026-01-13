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
    //Formatar data
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    //Contrutor
    public Agendamento(Cliente cliente, Profissional profissional, Servico servico, LocalDateTime dataHoraInicio) {
        this.cliente = cliente;
        this.profissional = profissional;
        this.servico = servico;
        this.dataHoraInicio = dataHoraInicio;
        this.datahoraFim = dataHoraInicio.plusMinutes(servico.getDuracaoEmMinutos());
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

    @Override
    public String toString() {
        return "Agendamentos{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", profissional=" + profissional +
                ", servico=" + servico +
                ", dataHoraInicio=" + dataHoraInicio.format(formatador) +
                ", datahoraFim=" + datahoraFim.format(formatador) +
                '}';
    }
}
