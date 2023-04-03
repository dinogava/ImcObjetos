public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("joao",1.75,86.8);
        Paciente paciente2 = new Paciente("douglas",1.87,120.0);
        Paciente paciente3 = new Paciente("tiago",1.79,45.0);

        paciente1.indiceMassaCorporal();
        paciente1.diagnostico();
        paciente2.indiceMassaCorporal();
        paciente2.diagnostico();
        paciente3.indiceMassaCorporal();
        paciente3.diagnostico();

        System.out.println(paciente1.nome);
        System.out.println(paciente1.diagnostico());
        System.out.println(paciente2.nome);
        System.out.println(paciente2.diagnostico());
        System.out.println(paciente3.nome);
        System.out.println(paciente3.diagnostico());

    }
}