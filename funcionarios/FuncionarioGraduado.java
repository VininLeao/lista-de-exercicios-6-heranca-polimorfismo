package funcionarios;

public class FuncionarioGraduado extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduado(String nome, String codigoFuncional, String escolaBasico, String escolaEnsinoMedio, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasico, escolaEnsinoMedio, comissao);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 2.00; // Renda do nível anterior + 100%
    }

    @Override
    public String toString() {
        return super.toString() + ", Universidade: " + universidade;
    }
}
