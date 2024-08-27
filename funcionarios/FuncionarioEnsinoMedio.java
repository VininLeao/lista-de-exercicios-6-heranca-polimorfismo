package funcionarios;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaBasico, String escolaEnsinoMedio, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasico, comissao);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.50; // Renda do nível anterior + 50%
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Ensino Médio: " + escolaEnsinoMedio;
    }
}
