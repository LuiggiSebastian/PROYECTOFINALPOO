package test;

import modelo.entidades.Candidato;
import modelo.entidades.PartidoPolitico;
import modelo.gestion.GestionCandidato;
import modelo.gestion.GestionPartido;

public class Prueba2 {
    public static void main(String[] args) {
       GestionElecciones ge = new GestionElecciones();

Calendar f1 = Calendar.getInstance();
f1.set(2026, Calendar.MAY, 15);

Calendar f2 = Calendar.getInstance();
f2.set(2026, Calendar.OCTOBER, 2);

Calendar f3 = Calendar.getInstance();
f3.set(2026, Calendar.NOVEMBER, 20);

System.out.println("Registrar elección municipal: " +
        ge.registrarEleccion(new EleccionMunicipal("E001", "Elección Municipal 2026", f1, true)));

System.out.println("Registrar elección nacional: " +
        ge.registrarEleccion(new EleccionNacional("E002", "Elección Nacional 2026", f2, false)));

System.out.println("Registrar referéndum: " +
        ge.registrarEleccion(new EleccionReferendum("E003", "Referéndum 2026", f3, true)));

System.out.println("\n=== LISTA DE ELECCIONES ===");
System.out.println(ge.listarElecciones());
    }
}