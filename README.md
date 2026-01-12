# 📅 AgendaPro - Sistema de Agendamento e Gestão

O **AgendaPro** é uma solução backend para gestão de agendamentos de serviços (ex: barbearias, salões, clínicas), focado na resolução de conflitos de horário, gestão financeira (sinal/entrada) e fidelização de clientes.

> 🚧 **Status:** Em desenvolvimento (Fase 1: Core Logic & In-Memory Persistence)

## 🎯 Objetivos do Projeto

- **Gestão Inteligente:** Impede agendamentos duplicados (conflito de horário/profissional).
- **Financeiro:** Cálculo automático de valores e validação de pagamento (Sinal de 50%).
- **Segurança:** Validação de atendimento via PIN (similar ao iFood).
- **Fidelidade:** Pontuação automática por frequência de visitas.

## 🛠️ Stack Tecnológica

- **Java 25** (Lógica de Negócio e Date/Time API)
- **POO** (Modelagem de Domínio Rica)
- **Repository Pattern** (Simulação de persistência para testes de lógica)
- **Git/GitHub** (Versionamento)

## 🏗️ Estrutura do Projeto

O sistema segue uma arquitetura em camadas simplificada para o MVP:

- `model`: Classes de domínio (Cliente, Profissional, Serviço, Agendamento).
- `repository`: Persistência de dados (Banco em Memória na Fase 1).
- `service`: Regras de negócio (Validação de conflitos, cálculos).
- `app`: Interface de console para interação.

---
Desenvolvido por **Gustavo Cazzine** como parte de estudo intensivo de Engenharia de Software e Java Backend.
