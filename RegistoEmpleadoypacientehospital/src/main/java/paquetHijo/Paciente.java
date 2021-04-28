package paquetHijo;

import paquetPadre.Persona;

public class Paciente extends Persona {

    int telefono;
    int edad;
    float montoPagar;

    public Paciente(int telefono, int edad, int codigo, String nombre, String apellido, String direccion, String ciudad) {
        super(codigo, nombre, apellido, direccion, ciudad);
        this.telefono = telefono;
        this.edad = edad;
        this.montoPagar = 0;
    }

    public float calcular(int edad) {
        if (0 <= edad && edad <= 10) {
            montoPagar = 50;
        }
        if (11 <= edad && edad <= 17) {
            montoPagar = 70;
        }
        if (18 <= edad && edad <= 60) {
            montoPagar = 100;
        }

        if (61 <= edad && edad <= 100) {
            montoPagar = 60;
        }

        return montoPagar;
    }

    public String mostrarsDatos() {
        String resultado = "";

        resultado = resultado + "\n\ncodigo:" + getCodigo()
                + "\nNombre:" + getNombre()
                + "\nApellido:" + getApellido()
                + "\nDireccion:" + getDireccion()
                + "\nCiudad:" + getCiudad()
                + "\nTelefono:" + telefono
                + "\nedad:" + edad
                + "\nMonto:" + montoPagar;
        return resultado;
    }

}
