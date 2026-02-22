
package modelo.entidades;

import modelo.abstractas.*;

public class Prueba {

    public static void main(String[] args) {
        PartidoPolitico p = new PartidoPolitico("P01", "Partido Demo", "PD", "logo.png", "Juan Ruiz");

        Candidato c = new Candidato("C01", 12345678, "Ana", "Perez", p);
        c.sumarVotos(150);
        c.sumarPreferenciales(40);

        c.mostrarDatos();

        c.reiniciarConteo();
        System.out.println("Luego de reiniciar:");
        c.mostrarDatos();
    }
}
