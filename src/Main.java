import model.Agendamento;
import model.Cliente;
import model.Profissional;
import model.Servico;
import repository.BancoDeDadosFake;
import service.AgendamentoService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        AgendamentoService service = new AgendamentoService();
        configurarDadosIniciais();

        while (true) {
            System.out.println("--- AgendaPro ---");
            System.out.println("1. Listar Profissionais e Serviços");
            System.out.println("2. Agendar Horário");
            System.out.println("3. Ver Agenda (Relatório)");
            System.out.println("0. Sair");

            int opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida){
                case 1:
                    System.out.println("\n--- Profissionais ---");
                    // Percorre a lista de profissionais e imprime cada um
                    for (Profissional p : BancoDeDadosFake.getProfissionais()) {
                        System.out.println(p.toString());
                    }

                    System.out.println("\n--- Serviços ---");
                    // Percorre a lista de serviços
                    for (Servico s : BancoDeDadosFake.getServicos()) {
                        System.out.println(s.toString()); // Mostra ID, Nome e Valor
                    }
                    break;
                case 2:
                    System.out.println("\n--- Novo Agendamento ---");
                    try {
                        // 1. Escolher Cliente
                        System.out.println("Digite o ID do Cliente:");
                        int idCliente = scanner.nextInt();
                        // Busca na lista (ID - 1 pega a posição certa na lista)
                        Cliente cliente = BancoDeDadosFake.getClientes().get(idCliente - 1);

                        // 2. Escolher Profissional
                        System.out.println("Digite o ID do Profissional:");
                        int idProf = scanner.nextInt();
                        Profissional prof = BancoDeDadosFake.getProfissionais().get(idProf - 1);

                        // 3. Escolher Serviço
                        System.out.println("Digite o ID do Serviço:");
                        int idServico = scanner.nextInt();
                        Servico servico = BancoDeDadosFake.getServicos().get(idServico - 1);

                        // 4. Montar a Data
                        System.out.println("Digite o Dia (ex: 25):");
                        int dia = scanner.nextInt();
                        System.out.println("Digite a Hora (ex: 14):");
                        int hora = scanner.nextInt();
                        System.out.println("Digite o Minuto (ex: 30):");
                        int minuto = scanner.nextInt();

                        // Cria a data fixa em 2026 e mês 01 (Janeiro) para facilitar
                        LocalDateTime dataAgenda = LocalDateTime.of(2026, 1, dia, hora, minuto);

                        // 5. Criar e Tentar Salvar
                        Agendamento novoAgendamento = new Agendamento(cliente, prof, servico, dataAgenda);

                        // O Service vai validar se tem conflito
                        service.registrarAgendamento(novoAgendamento);

                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("❌ Erro: ID inválido (Cliente, Profissional ou Serviço não encontrado).");
                    } catch (RuntimeException e) {
                        System.out.println("❌ Erro de Agendamento: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("\n--- Relatório de Agendamentos ---");
                    for (Agendamento a : BancoDeDadosFake.getAgendamentos()) {
                        System.out.println(a.toString());
                    }
                    break;
                case 0:
                    System.out.println("Finalizando programa.");
                    return;
            }
        }

    }

    private static void configurarDadosIniciais(){
        // 1. Criar os objetos
        Cliente c1 = new Cliente ("Gustavo", "19981559831");
        Cliente c2 = new Cliente ("Maria", "19995448786");

        Profissional p1 = new Profissional("Barbeiro 1", "19999999999");
        Profissional p2 = new Profissional("Barbeiro 2", "11988888888");

        Servico s1 = new Servico("Corte", 50, 30);
        Servico s2 = new Servico("Barba", 30, 20);

        // 2. SALVAR NO BANCO (Isso estava faltando!)
        BancoDeDadosFake.adicionarCliente(c1);
        BancoDeDadosFake.adicionarCliente(c2);

        BancoDeDadosFake.adicionarProfissional(p1);
        BancoDeDadosFake.adicionarProfissional(p2);

        BancoDeDadosFake.adicionarServico(s1);
        BancoDeDadosFake.adicionarServico(s2);
    }
}