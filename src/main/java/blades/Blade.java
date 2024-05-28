package blades;

import blades.interfaces.Warrable;

public abstract class Blade implements Warrable {
    // Attributes
    protected String id;
    protected String name;
    protected String color;
    protected String type;
    protected int SpeedSpin;
    protected int totalPower;

    // Constructors
    public Blade() { }

    public Blade(String id, String name, String color, String type) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.type = type;
        this.SpeedSpin = 0;
        this.totalPower = 0;
    }

    // Setters

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setColor(String color) { this.color = color; }
    public void setType(String type) { this.type = type; }
    public void setSpeedSpin(int speedSpin) { SpeedSpin = speedSpin; }
    public void setTotalPower(int totalPower) { this.totalPower = totalPower; }

    // Getters


    public String getId() { return id; }
    public String getName() { return name; }
    public String getColor() { return color; }
    public String getType() { return type; }

    public int getSpeedSpin() { return SpeedSpin; }
    public int getTotalPower() { return totalPower; }

    // Methods
    abstract void showBladeData();
}
