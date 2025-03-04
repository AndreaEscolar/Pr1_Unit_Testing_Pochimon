package model;

import java.util.ArrayList;

public class PochimonSpecies {
    private String speciesName;
    private ArrayList<Type> types;

    // Getters y Setters
    public String getSpeciesName() { 
    	return speciesName; 
    }
    public ArrayList<Type> getTypes() { 
    	return types; 
    }
    public void setTypes(ArrayList<Type> types) { 
    	this.types = types; 
    }
}
