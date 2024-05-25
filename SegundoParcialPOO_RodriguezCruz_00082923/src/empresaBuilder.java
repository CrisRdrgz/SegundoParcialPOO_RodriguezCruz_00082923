class empresaBuilder {
    private final departamentoPrincipal ceo = new departamentoPrincipal("CEO");

    public empresaBuilder agregarDepartamentoPrincipal(String nombre) {
        ceo.agregarSubDepartamento(new departamentoPrincipal(nombre));
        return this;
    }

    public empresaBuilder agregarDepartamentoSecundario(String nombre, String departamentoPrincipal) {
        Departamento departamento = new departamentoSecundario(nombre);

        ceo.agregarSubDepartamento(departamento);
        return this;
    }

    public departamentoPrincipal build() {
        return ceo;
    }
}
