package funcionarios;

public class Vendedor implements Comissao {
    private static final double VALOR_COMISSAO = 250.00;

    @Override
    public double getValor() {
        return VALOR_COMISSAO;
    }
}