class departamentoSecundario implements Departamento {
    private final String nombre;

    public departamentoSecundario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("departamento secundario : " + nombre);
    }
}
