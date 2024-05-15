public class Lider extends Funcionarios {
    public Lider(String nome, double valorhora, int Cod_empresa, int horatrabmes) {
        super(nome, valorhora, Cod_empresa, horatrabmes);
    }

    public double calcsal() {
        return super.calcsal() * 1.05;
    }
}
