package solid.srp.desafio01.solucao;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new DezOuVintePorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());

    private final RegraDeCalculo regra;

    Cargo(RegraDeCalculo regraDeCalculo) {
        this.regra = regraDeCalculo;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
