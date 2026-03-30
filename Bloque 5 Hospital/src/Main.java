public class Main {
    public static void main(String[] args) {
        // 1. Creamos la cola
        ColaHospital guardia = new ColaHospital();
        guardia.inicializarCola();

        // 2. Llega el pibe con el raspón (Baja prioridad)
        Paciente p1 = new Paciente("Juan", "Raspón en la rodilla");
        guardia.acolar(p1, 1);

        // 3. Llega el jubilado (Alta prioridad)
        Paciente p2 = new Paciente("Don Roberto", "Dolor en el pecho");
        guardia.acolar(p2, 100);

        // 4. Vemos quién está primero para atender
        System.out.println("El médico atiende a: " + guardia.primero().nombre);

        // Debería imprimir "Don Roberto" aunque llegó después.
    }
}
