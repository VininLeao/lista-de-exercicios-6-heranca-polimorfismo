package funcionarios;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escola;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escola, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.10; // Renda básica + 10%
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Ensino Básico: " + escola;
    }
}
