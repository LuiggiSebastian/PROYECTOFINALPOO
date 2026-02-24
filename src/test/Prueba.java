package test;

import java.util.Calendar;
import modelo.abstractas.*;
import modelo.entidades.*;
import modelo.enums.*;

public class Prueba {

    public static void main(String[] args) {

        // =========================Crear Eleccion

        Calendar fecha = Calendar.getInstance();
        fecha.set(2026, Calendar.JULY, 15);

        Eleccion eleccion = new EleccionNacional(
        "EL001",
        "Eleccion General 2026",
        fecha,
        true
);
          Eleccion eleccion1 = new EleccionNacional(
        "E01",
        "Eleccion General 2026",
        Calendar.getInstance(),
        true
);

        System.out.println("=== ELECCION CREADA ===");
        System.out.println(eleccion);
        System.out.println();

        // =========================Crar Partido Politico=========================
        PartidoPolitico partido1 = new PartidoPolitico(
        "P01",
        "Renovacion Popular",
        "RP",
        "Rafael Lopez Aliaga",
        "999888777",eleccion1);

            PartidoPolitico partido2 = new PartidoPolitico(
        "P02",
        "Fuerza Popular",
        "FP",
        "Keiko Fujimori",
        "988776655",eleccion1);
        // =========================Crear Candidato=========================
        
        Candidato c1 = new Candidato(
        12345678, "C01","Rafael","Lopez Aliaga",45,1,partido1);

        Candidato c2 = new Candidato(
        87654321,"C02","Keiko","Fujimori",42,2,partido2);

        System.out.println("=== CANDIDATOS ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println();

        // ========================= Crear Mesa Electoral=========================
        MesaElectoral mesa = new MesaElectoral("M01", "Lima", 250);

        // ========================= Crear Acta Electoral=========================
        
        ActaElectoral acta = new ActaElectoral(
                "A001",
                mesa,
                200,   // total emitidos
                180,   // válidos
                10,    // blancos
                10     // nulos
        );

        // =========================Registrar Resultados=========================
        ResultadoCandidato r1 = new ResultadoCandidato(c1, 70, 30);
        ResultadoCandidato r2 = new ResultadoCandidato(c2, 110, 60);

        acta.registrarResultado(r1);
        acta.registrarResultado(r2);

        // =========================Validar Actas =========================
        boolean esValida = acta.validarActa();

        System.out.println("=== ACTA ===");
        System.out.println(acta);
        System.out.println("Resultados:");
        System.out.println(acta.listarResultados());
        System.out.println("Acta valida? " + esValida);
        System.out.println();

        // =========================Asociar Acta a Eleccion
        
        eleccion.registrarActa(acta);

        System.out.println("=== ACTAS EN LA ELECCION ===");
        System.out.println("Cantidad de actas: " + eleccion.getCantidadActas());

        ActaElectoral[] actas = eleccion.getActas();
        for (ActaElectoral a : actas) {
            System.out.println(a);
        }
    }
}