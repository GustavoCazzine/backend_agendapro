package service;

import model.Agendamento;
import repository.BancoDeDadosFake;

import java.util.List;

public class AgendamentoService {
    //Metodos
    public void registrarAgendamento(Agendamento novoAgendamento){
        // --- VALIDAÇÃO 1: FINANCEIRA (Independente dos outros) ---
        // Regra: Deve pagar no mínimo 50%
        double valorMinimo = novoAgendamento.getServico().getValor() / 2;

        if (novoAgendamento.getValorPago() < valorMinimo) {
            throw new RuntimeException("Sinal insuficiente! Mínimo de R$ " + valorMinimo);
        }

        // --- VALIDAÇÃO 2: CONFLITO DE HORÁRIO (Comparativo) ---
        List<Agendamento> agendamentosExistentes = BancoDeDadosFake.getAgendamentos();

        for (Agendamento agendamento : agendamentosExistentes) {
            // Verifica se é o mesmo profissional
            if (agendamento.getProfissional().equals(novoAgendamento.getProfissional())) {
                // Verifica colisão
                if (novoAgendamento.getDataHoraInicio().isBefore(agendamento.getDatahoraFim())
                        && novoAgendamento.getDatahoraFim().isAfter(agendamento.getDataHoraInicio())) {
                    throw new RuntimeException("Horário indisponível para este profissional!");
                }
            }
        }

        // Se passou por tudo, salva
        BancoDeDadosFake.adicionarAgendamento(novoAgendamento);
        System.out.println("Agendamento realizado com sucesso!");
    }

}