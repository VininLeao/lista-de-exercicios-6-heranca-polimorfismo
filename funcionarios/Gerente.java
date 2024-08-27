package funcionarios;

public class Gerente implements Comissao {
    private static final double VALOR_COMISSAO = 1500.00;

    @Override
    public double getValor() {
        return VALOR_COMISSAO;
    }
}
