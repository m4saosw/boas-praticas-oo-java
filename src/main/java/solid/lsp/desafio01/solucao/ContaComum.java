package solid.lsp.desafio01.solucao;

public class ContaComum {
    private ManipuladorDeSaldo manipulador;

    public ContaComum() {
        this.manipulador = new ManipuladorDeSaldo();
    }

    public void deposita(double valor) {
        this.manipulador.deposita(valor);
    }

    public void saca(double valor) {
        this.manipulador.saca(valor);
    }

    public void rende() {
        this.manipulador.rende(1.1);
    }

    public double getSaldo() {
        return this.manipulador.getSaldo();
    }
}
