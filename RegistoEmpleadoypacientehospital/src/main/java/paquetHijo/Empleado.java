package paquetHijo;

import paquetPadre.Persona;

public class Empleado extends Persona {

    int escala;
    float sueldo;

    public Empleado(int escala, int codigo, String nombre, String apellido, String direccion, String ciudad) {
        super(codigo, nombre, apellido, direccion, ciudad);
        this.escala = escala;
        this.sueldo = 0;
    }

    public float calcular(int escala) {
        if (escala == 10) {
            sueldo = 7000;
        }
        if (escala == 11) {
            sueldo = 5250;
        }
        if (escala == 12) {
            sueldo = 3750;
        }
        if (escala == 13) {
            sueldo = 1500;
        }

        return sueldo;
    }

    public String mostrarsDatos() {
        String resultado = "";
        resultado = resultado + "\n\ncodigo:" + getCodigo()
                + "\nNombre:" + getNombre()
                + "\nApellido:" + getApellido()
                + "\nDireccion:" + getDireccion()
                + "\nCiudad:" + getCiudad()
                + "\nEscala:" + escala
                + "\nSueldo:" + sueldo;
        return resultado;
    }
}
