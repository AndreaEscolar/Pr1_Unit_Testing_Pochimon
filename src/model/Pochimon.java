package model;

import java.util.List;

public class Pochimon extends ElementAbs implements ICatchable {
	
    private static int numPochidex;
	private String name;
    private String species;
    private String description;
    private boolean isShiny;
    private boolean isWild;
    private List<String> types;
    private List<String> moves;
    private int hp;
    private int maxHp;
    private int attack;
    private int defense;
    
    public Pochimon(String name, String species, String description, boolean isShiny, boolean isWild,
			List<String> types, List<String> moves, int hp, int maxHp, int attack, int defense) {
		this.name = name;
		this.species = species;
		this.description = description;
		this.isShiny = isShiny;
		this.isWild = isWild;
		this.types = types;
		this.moves = moves;
		this.hp = hp;
		this.maxHp = maxHp;
		this.attack = attack;
		this.defense = defense;
	}


	public Pochimon() {
		// TODO Auto-generated constructor stub
	}


	public int getNumPochidex() {
		return numPochidex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public String getDescription() {
		return description;
	}

	public boolean isShiny() {
		return isShiny;
	}

	public boolean isWild() {
		return isWild;
	}

	public void setWild(boolean isWild) {
		this.isWild = isWild;
	}

	public List<String> getTypes() {
		return types;
	}

	public List<String> getMoves() {
		return moves;
	}
	

	public int getHp() {
		return hp;
	}

	public int getMaxHp() {
		return maxHp;
	}
	
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	@Override
	public String toString() {
		return "Pochimon [numPochidex=" + numPochidex + ", name=" + name + ", species=" + species + ", description=" + description
				+ ", isShiny=" + isShiny + ", isWild=" + isWild + ", types=" + types + ", moves=" + moves + ", hp=" + hp
				+ ", maxHp=" + maxHp + ", attack=" + attack + ", defense=" + defense + "]";
	}


	@Override
	public boolean tryToCatch() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public double getCaptureRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void attackFoe(Pochimon foe) {
        // Lógica para atacar a un enemigo
    }

    public void evolve() {
       // Lógica para evolucionar
    }
	
}
