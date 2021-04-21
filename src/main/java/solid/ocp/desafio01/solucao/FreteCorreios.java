package solid.ocp.desafio01.solucao;

public class FreteCorreios implements Frete {
    @Override
    public double para(String cidade) {
        if ("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
