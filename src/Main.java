import model.Agendamento;
import model.Cliente;
import model.Profissional;
import model.Servico;
import service.AgendamentoService;

import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args){
        AgendamentoService servico = new AgendamentoService();
        Cliente c1 = new Cliente ("Gustavo", "19981559831");
        Profissional p1 = new Profissional("Barbeiro 1", "19999999999");
        Servico s1 = new Servico("Corte", 50, 30);

        LocalDateTime data = LocalDateTime.of(2026, 1, 25, 14, 0);

        Agendamento a1 = new Agendamento(c1, p1, s1, data);
        Agendamento a2 = new Agendamento(c1, p1, s1, data);

        try{
            servico.registrarAgendamento(a1);
        } catch (RuntimeException e ){
            System.err.println("Erro capturado: " + e.getMessage());
        }

        try{
            servico.registrarAgendamento(a2);
        } catch (RuntimeException e ){
            System.err.println("Erro capturado: " + e.getMessage());
        }

    }
}