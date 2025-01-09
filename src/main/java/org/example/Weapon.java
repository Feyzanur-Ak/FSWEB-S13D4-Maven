package org.example;

public enum Weapon {
    SWORD(50, 1.2); // Kılıç


    private final int damage;        // Silahın hasarı
    private final double attackSpeed; // Saldırı hızı

    // Constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    // Getter metotları
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
