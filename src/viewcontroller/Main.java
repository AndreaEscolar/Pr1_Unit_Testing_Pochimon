package viewcontroller;


import model.*;

public class Main {

	public static void main(String[] args) {
		 // Crear un Pochimon 
        Pochimon pikachu = new Pochimon();
        pikachu.setName("Pikachu");
        pikachu.setExp(100);
        pikachu.setMaxHp(100);

        // Crear un entrenador
        Trainer ash = new Trainer();
        ash.setName("Ash");
        ash.getTeam().add(pikachu);

        // Mostrar información (
        System.out.println("Entrenador: " + ash.getName());
        System.out.println("Primer Pochimon en el equipo: " + ash.getTeam().get(0).getName());
        
    }

}
