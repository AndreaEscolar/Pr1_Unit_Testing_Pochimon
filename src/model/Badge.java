package model;

public class Badge {
	
	private String name;
    private double boost;
    private int obedienceLevel;

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBoost() {
        return boost;
    }

    public void setBoost(double boost) {
        this.boost = boost;
    }

    public int getObedienceLevel() {
        return obedienceLevel;
    }

    public void setObedienceLevel(int obedienceLevel) {
        this.obedienceLevel = obedienceLevel;
    }
}
