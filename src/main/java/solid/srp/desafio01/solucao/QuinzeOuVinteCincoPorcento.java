package solid.srp.desafio01.solucao;

public class QuinzeOuVinteCincoPorcento {
    public double calcula(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        } else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
