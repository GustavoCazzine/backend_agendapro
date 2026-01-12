package repository;

import model.Cliente;
import model.Profissional;
import model.Servico;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosFake {
    //Atributos
    private static List<Cliente> clientes = new ArrayList<Object>();
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
    public void adicionarAgendamento(Agendamento a){
        agendamentos.add(a);
    }

}
