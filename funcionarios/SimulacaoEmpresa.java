package funcionarios;

import java.util.Random;

public class SimulacaoEmpresa {
    public static void main(String[] args) {
        // Array para armazenar os funcionários
        Funcionario[] funcionarios = new Funcionario[10];
        Random rand = new Random();

        // Adicionar funcionários ao array
        for (int i = 0; i < funcionarios.length; i++) {
            // Gerar dados aleatórios para cada funcionário
            String nome = "Funcionario" + (i + 1);
            String codigoFuncional = String.format("%03d", i + 1);

            // Distribuição dos funcionários
            if (i < 1) {
                // 10% Gerentes
                funcionarios[i] = new Funcionario(nome, codigoFuncional, new Gerente());
            } else if (i < 3) {
                // 20% Supervisores
                funcionarios[i] = new FuncionarioEnsinoBasico(nome, codigoFuncional, gerarEscola(), new Supervisor());
            } else {
                // 70% Vendedores
                if (i < 7) {
                    // 70% Ensino Médio
                    funcionarios[i] = new FuncionarioEnsinoMedio(nome, codigoFuncional, gerarEscola(), gerarEscolaEnsinoMedio(), new Vendedor());
                } else {
                    // 70% Nível Superior
                    funcionarios[i] = new FuncionarioGraduado(nome, codigoFuncional, gerarEscola(), gerarEscolaEnsinoMedio(), gerarUniversidade(), new Vendedor());
                }
            }
        }

        // Imprimir todos os funcionários
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    private static String gerarEscola() {
        String[] escolas = {"Escola Municipal São Paulo", "Escola Estadual Rio de Janeiro", "Escola Particular ABC"};
        Random rand = new Random();
        return escolas[rand.nextInt(escolas.length)];
    }

    private static String gerarEscolaEnsinoMedio() {
        String[] escolas = {"Colégio Estadual Brasil", "Colégio São João", "Colégio Cristo Redentor"};
        Random rand = new Random();
        return escolas[rand.nextInt(escolas.length)];
    }

    private static String gerarUniversidade() {
        String[] universidades = {"Universidade Federal de Minas Gerais", "Universidade de São Paulo", "Universidade Federal do Rio de Janeiro"};
        Random rand = new Random();
        return universidades[rand.nextInt(universidades.length)];
    }
}
