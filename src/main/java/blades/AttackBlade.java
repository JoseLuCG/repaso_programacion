package blades;

import static Tools.Functions.outPut;

public class AttackBlade extends Blade{
    // Attributes
    private int attackPower;

    // Constructors
    public AttackBlade () {}
    public AttackBlade(String id, String name, String color, String type, int attackPower) {
        super(id, name, color, type);
        this.attackPower = attackPower;
    }

    // Getters
    public int getAttackPower() { return attackPower; }

    // Setters
    public void setAttackPower(int attackPower) { this.attackPower = attackPower; }

    // Methods
    @Override
    void showBladeData() {
        outPut.println("Id  nombre  color  tipo  VelocidadGiro  poderTotal");
        outPut.printf("%2s %2s %2s %2s %2d %2d",id,name, color,type,SpeedSpin,totalPower);
    }

    @Override
    public void throwBlade(int speed) {
        this.SpeedSpin = speed;
        if (this.totalPower * attackPower < 100) {
            this.totalPower = SpeedSpin * attackPower;
        } else this.totalPower = 100;
    }

    @Override
    public void attackToBlade(Blade obj) {
        if (obj instanceof AttackBlade) {
            System.out.println("No podemos luchar entre nosotros. Somos el mismo tipo de blade.");
        } else {
            outPut.println("Comienza el ataque!");

        }
    }
}
