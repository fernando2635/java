public class Empleado {
    private String nombre;
    private String identificacion;
    private double salario;

    public Empleado(String nombre, String identificacion, double salario) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}