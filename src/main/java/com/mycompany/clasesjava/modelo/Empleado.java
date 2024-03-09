package com.mycompany.clasesjava.modelo;

public class Empleado extends AbstractPersona {

    private int codigo;
    private String puesto;
    private int salario;

    public Empleado(int id, String nombre, String apellido, String direccion, int telefono, int codigo, String puesto, int salario) {
        super(id, nombre, apellido, direccion, telefono);
        this.codigo = codigo;
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public void ConsultarPersona() {
        System.out.println(this.getId() + " " + this.getNombre() + " " + this.getApellido() + " "
                + this.getDireccion() + " " + this.getTelefono());
    }

    public void GuardarEmpleado(Empleado empleado) {
        this.setCodigo(empleado.getCodigo());
        this.setPuesto(empleado.getPuesto());
        this.setSalario(empleado.getSalario());
    }

    public void ObtenerEmpleado() {
        System.out.println(this.codigo + " " + this.puesto + " " + this.salario);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
