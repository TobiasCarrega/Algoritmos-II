public interface ColaPrioridadTDA {
    void inicializarCola();
    void acolar(Paciente x, int p); // Cambiado a Paciente
    void desacolar();
    Paciente primero();           // Cambiado a Paciente
    boolean colaVacia();
    int prioridad();
}