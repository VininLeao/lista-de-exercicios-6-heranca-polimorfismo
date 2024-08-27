package funcionarios;

public class FuncionarioSemEstudo extends Funcionario {

    public FuncionarioSemEstudo(String nome, String codigoFuncional) {
        super(nome, codigoFuncional, new Comissao() {
            @Override
            public double getValor() {
                return 0.00;
            }
        });
    }
}
