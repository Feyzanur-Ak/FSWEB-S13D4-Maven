package org.example;

public class Player {
    private String name; // Oyuncu ismi
    private int healthPercentage; // Oyuncunun sağlık durumu (% olarak)
    private Weapon weapon; // Oyuncunun silahı

    // Constructor
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;

        // Sağlık değerini kontrol ederek set etme
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    // healthRemaining metodu
    public int healthRemaining() {
        return healthPercentage;
    }

    // loseHealth metodu
    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of the game.");
        }
    }

    // restoreHealth metodu
    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }
}
