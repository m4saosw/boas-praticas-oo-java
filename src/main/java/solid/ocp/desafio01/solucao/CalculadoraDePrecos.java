package solid.ocp.desafio01.solucao;

/**
 * OCP
 */
public class CalculadoraDePrecos {
    private TabelaDePreco tabela;
    private Frete frete;

    public CalculadoraDePrecos(TabelaDePreco tabela, Frete frete) {
        this.tabela = tabela;
        this.frete = frete;
    }

    public double calcula(Compra produto) {
        double desconto = tabela.descontoPara(produto.getValor());
        double valorFrete = frete.para(produto.getCidade());

        return produto.getValor() * (1 - desconto) + valorFrete;
    }
}
