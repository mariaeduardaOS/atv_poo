public class Main {
    public static void main(String[] args) {
     Funcionarios funcionarios = new Funcionarios("Maria", 12, 10140, 100);
     Gerente gerente = new Gerente("Lucas", 22, 10141, 120);
     Lider lider = new Lider("João", 19, 10142, 110);

        System.out.println(funcionarios.calcsalario());
        System.out.println(gerente.calcsalario());
        System.out.println(lider.calcsalario());
    }
}
