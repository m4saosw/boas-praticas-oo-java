package solid.srp.desafio01.solucao;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        if (Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return new DezOuVintePorcento().calcula(funcionario);
        }

        if (Cargo.DBA.equals(funcionario.getCargo()) || Cargo.TESTER.equals(funcionario.getCargo())) {
            return new QuinzeOuVinteCincoPorcento().calcula(funcionario);
        }

        throw new RuntimeException("funcionario invalido");
    }



}
