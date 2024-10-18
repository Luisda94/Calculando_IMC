package main;

import modelo.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear 5 personas
        Persona persona1 = new Persona("Luis", 25, 70.5, 1.75);
        Persona persona2 = new Persona("Ana", 16, 55.0, 1.60);
        Persona persona3 = new Persona("Carlos", 30, 80.0, 1.82);
        Persona persona4 = new Persona("Marta", 20, 62.5, 1.65);
        Persona persona5 = new Persona("Jorge", 12, 45.0, 1.50);

        // Crear un arreglo para las personas
        Persona[] personas = {persona1, persona2, persona3, persona4, persona5};


        }
	}


