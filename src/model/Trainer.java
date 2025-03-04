package model;

import java.util.ArrayList;
import java.util.List;

public class Trainer extends ElementAbs {
	
	private int id;
    private ArrayList<Badge> badges;
    private ArrayList<Pochimon> team;
    
 // Constructor
    public Trainer() {
        this.team = new ArrayList<>();  
        this.badges = new ArrayList<>(); 
    }



	
	// Getters and Setters
	public int getId() {
		return id;
	}
	
	public ArrayList<Pochimon> getTeam() { 
		return team; 
	}
	
	public void setTeam(ArrayList<Pochimon> team) { 
		this.team = team; 
	}
	
	public ArrayList<Badge> getBadges() {
        return badges;
    }

    public void setBadges(ArrayList<Badge> badges) {
        this.badges = badges;
    }

    // Método para añadir una insignia
    public void addBadge(Badge badge) {
        badges.add(badge);
    }
    
    public void addExperience(int exp) {
        this.exp += exp;
        if (this.exp >= expToNextLevel) {
            levelUp();
        }
    }

    private void levelUp() {
        level++;
        expToNextLevel = calculateExpToNextLevel();
    }

    private int calculateExpToNextLevel() {
        // Lógica para calcular la experiencia necesaria para el siguiente nivel
        return 100 * level;
    }

}
