public class Main {
    public static void main(String[] args) {
        // Usamos Builder ya que podemos crear los diversos departamentos a nuestra forma y podemos hacer los primarios  y secundarios dentro del builder

                empresaBuilder builder = new empresaBuilder();
                builder.agregarDepartamentoPrincipal("Recursos Humanos")
                        .agregarDepartamentoSecundario("Capacitaciones", "Recursos Humanos")
                        .agregarDepartamentoPrincipal("Desarrollo")
                        .agregarDepartamentoSecundario("Frontend TECH", "Desarrollo")
                        .agregarDepartamentoSecundario("Backend TECH", "Desarrollo");

                departamentoPrincipal empresa = builder.build();
                empresa.mostrarInfo();
            }
    }


