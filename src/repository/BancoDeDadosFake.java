package repository;

import model.Agendamento;
import model.Cliente;
import model.Profissional;
import model.Servico;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosFake {
    //Atributos
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Profissional> profissionais = new ArrayList<>();
    private static List<Servico> servicos = new ArrayList<>();
    private static List<Agendamento> agendamentos = new ArrayList<>();
    //Metodos
    public void adicionarCliente(Cliente c){
        c.setId(clientes.size() + 1);
        clientes.add(c);
    }
    public void adicionarProfissional(Profissional p){
        p.setId(profissionais.size() + 1);
        profissionais.add(p);
    }
    public void adicionarServico(Servico s){
        s.setId(servicos.size() + 1);
        servicos.add(s);
    }
    public static void adicionarAgendamento(Agendamento a){
        agendamentos.add(a);
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(List<Cliente> clientes) {
        BancoDeDadosFake.clientes = clientes;
    }

    public static List<Profissional> getProfissionais() {
        return profissionais;
    }

    public static void setProfissionais(List<Profissional> profissionais) {
        BancoDeDadosFake.profissionais = profissionais;
    }

    public static List<Servico> getServicos() {
        return servicos;
    }

    public static void setServicos(List<Servico> servicos) {
        BancoDeDadosFake.servicos = servicos;
    }

    public static List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public static void setAgendamentos(List<Agendamento> agendamentos) {
        BancoDeDadosFake.agendamentos = agendamentos;
    }
}
