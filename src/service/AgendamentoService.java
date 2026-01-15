package service;

import model.Agendamento;
import repository.BancoDeDadosFake;

import java.util.List;

public class AgendamentoService {
    //Metodos
    public void registrarAgendamento(Agendamento novoAgendamento){
        List<Agendamento> agendamentoExistente = BancoDeDadosFake.getAgendamentos();
       for (Agendamento agendamento : agendamentoExistente) {
           if (agendamento.getProfissional().equals(novoAgendamento.getProfissional())) {
               if (novoAgendamento.getDataHoraInicio().isBefore(agendamento.getDatahoraFim())
                       && novoAgendamento.getDatahoraFim().isAfter(agendamento.getDataHoraInicio())) {
                   throw new RuntimeException("Horário indisponível para este profissional!");
               }
           }
       }

       BancoDeDadosFake.adicionarAgendamento(novoAgendamento);
       System.out.println("Agendamento realizado com sucesso!");
    }
}