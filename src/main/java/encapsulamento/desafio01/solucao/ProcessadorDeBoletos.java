package encapsulamento.desafio01.solucao;

import java.util.List;

public class ProcessadorDeBoletos {
    public void processa(List<Boleto> boletos, Fatura fatura) {

        for (Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);

            fatura.getPagamentos().add(pagamento);
            fatura.adicionaPagamento(pagamento);
        }
    }
}
