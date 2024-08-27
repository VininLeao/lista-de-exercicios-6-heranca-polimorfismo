package funcionarios;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Jihyo", "001", new Gerente());
        FuncionarioEnsinoBasico func2 = new FuncionarioEnsinoBasico("Nayeon", "002", "Escola Municipal São Paulo", new Supervisor());
        FuncionarioEnsinoMedio func3 = new FuncionarioEnsinoMedio("Sana", "003", "Escola Municipal São Paulo", "Colégio Estadual Brasil", new Vendedor());
        FuncionarioGraduado func4 = new FuncionarioGraduado("Momo", "004", "Escola Municipal São Paulo", "Colégio Estadual Brasil", "Universidade Federal de Minas Gerais", new Gerente());

        System.out.println(func1);
        System.out.println(func2);
        System.out.println(func3);
        System.out.println(func4);
    }
}
