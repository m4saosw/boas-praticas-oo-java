package encapsulamento.desafio01.solucao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {

    private String cliente;
    private double valor;
    private List<Pagamento> pagamentos;
    private boolean pago;

    private double valorTotalDosPagamentos;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos);
    }

    public boolean isPago() {
        return pago;
    }

    public void adicionaPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        somaValorDoPagamento(pagamento);

        if (this.valorTotalDosPagamentos >= this.valor)
            this.pago = true;
    }

    private void somaValorDoPagamento(Pagamento pagamento) {
        this.valorTotalDosPagamentos += pagamento.getValor();
    }
}