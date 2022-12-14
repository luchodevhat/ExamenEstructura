
package Ejercicio1;

public class Cliente {
    private String nombre;
    private int cedula;
    private String producto;
    private double total;
    private boolean discapacidad;

    public Cliente(String nombre, int cedula,String producto, int total, boolean discapacidad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.producto = producto;
        this.total = total;
        this.discapacidad = discapacidad;
    }
    
    public Cliente() {
        this.nombre = "";
        this.cedula = 0;
        this.producto = "";
        this.total = 0;
        this.discapacidad = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Cliente || " + "Nombre: " + nombre + ", cedula: " + cedula + ", discapacidad: " + discapacidad;
    }
    
}
