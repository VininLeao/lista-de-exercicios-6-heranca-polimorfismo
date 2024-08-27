package funcionarios;

public class Supervisor implements Comissao {
    private static final double VALOR_COMISSAO = 600.00;

    @Override
    public double getValor() {
        return VALOR_COMISSAO;
    }
}