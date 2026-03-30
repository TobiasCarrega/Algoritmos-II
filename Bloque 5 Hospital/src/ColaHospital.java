public class ColaHospital implements ColaPrioridadTDA {
    Paciente[] pacientes;
    int[] prioridades;
    int indice;

    @Override
    public void inicializarCola() {
        pacientes = new Paciente[100];
        prioridades = new int[100];
        indice = 0;
    }

    @Override
    public void acolar(Paciente p, int prioridad) { // Asegurate que la interfaz diga Paciente p
        int i = indice;
        while (i > 0 && prioridades[i - 1] < prioridad) {
            pacientes[i] = pacientes[i - 1];
            prioridades[i] = prioridades[i - 1];
            i--;
        }
        pacientes[i] = p;
        prioridades[i] = prioridad;
        indice++;
    }

    @Override
    public void desacolar() {
        for (int j = 0; j < indice - 1; j++) {
            pacientes[j] = pacientes[j + 1];
            prioridades[j] = prioridades[j + 1];
        }
        indice--;
    }

    @Override
    public Paciente primero() { // Asegurate que la interfaz diga Paciente aquí
        return pacientes[0];
    }

    @Override
    public int prioridad() { // ESTE TE FALTABA
        return prioridades[0];
    }

    @Override
    public boolean colaVacia() {
        return (indice == 0);
    }
}
