import java.util.ArrayList;
import java.util.List;

class departamentoPrincipal implements Departamento {
    private final String nombre;
    private final List<Departamento> subDepartamentos = new ArrayList<>();

    public departamentoPrincipal(String nombre) {
        this.nombre = nombre;
    }

    public void agregarSubDepartamento(Departamento departamento) {
        subDepartamentos.add(departamento);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("departamento principal : " + nombre);
        for (Departamento departamento : subDepartamentos) {
            departamento.mostrarInfo();
        }
    }
}