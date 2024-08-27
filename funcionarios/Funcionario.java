package funcionarios;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private double rendaBase = 1000.00;
    private Comissao comissao; // Atributo para armazenar a comissão

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public double calcularRendaTotal() {
        double rendaTotal = rendaBase;

        if (comissao != null) {
            rendaTotal += comissao.getValor();
        }

        return rendaTotal;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Comissão: R$ " + (comissao != null ? comissao.getValor() : 0.0) +
                ", Salário Total: R$ " + calcularRendaTotal();
    }
}
