public class Funcionarios{
    public String nome;
    private double valorhora;
    public int Cod_empresa;
    public int horatrabmes;

    public Funcionarios(String nome, double valorhora, int cod_empresa, int horatrabmes) {
        this.nome = nome;
        this.valorhora = valorhora;
        this.Cod_empresa = cod_empresa;
        this.horatrabmes = horatrabmes;
    }
    public double calcsalario(){
        return valorhora * horatrab;
    }
}
