package model;

import java.util.Objects;

public class Move extends ElementAbs {
    // Atributos
    private int id;
    private String name;
    private int powerPoints;
    private int maxPowerPoints;
    private Type type;

    // Constructor
    public Move(int id, String name, int powerPoints, int maxPowerPoints, Type type) {
        this.id = id;
        this.name = name;
        this.powerPoints = powerPoints;
        this.maxPowerPoints = maxPowerPoints;
        this.type = type;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }

    public int getMaxPowerPoints() {
        return maxPowerPoints;
    }

    public void setMaxPowerPoints(int maxPowerPoints) {
        this.maxPowerPoints = maxPowerPoints;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    // Método useMove
    public void useMove() {
        if (powerPoints > 0) {
            powerPoints--;
        } else {
            System.out.println("No quedan powerPoints para usar este movimiento.");
        }
    }

    // Método toString para representación textual
    @Override
    public String toString() {
        return "Move{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", powerPoints=" + powerPoints +
                ", maxPowerPoints=" + maxPowerPoints +
                ", type=" + type +
                '}';
    }

    // Método equals y hashCode para comparar objetos Move
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Move move = (Move) o;
        return id == move.id &&
                powerPoints == move.powerPoints &&
                maxPowerPoints == move.maxPowerPoints &&
                Objects.equals(name, move.name) &&
                Objects.equals(type, move.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, powerPoints, maxPowerPoints, type);
    }
}