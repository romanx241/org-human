package ru.netology.java30.humanorc;

public class Player {
    protected String name; //имя
    protected int health; // здоровье
    protected int hitPoints;// сила

    public Player(String name, int health, int hitPoints) {
        this.name = name;
        this.health = health;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public boolean decreaseHealth(int damage) {
        health -= damage;
        return health <= 0;
    }

    public boolean isAlive() {
        return health > 0;
    }

    protected static boolean prob(int percents) {
        return Math.random() < percents / 100.;
    } //вычисление вероятности перенимания опыта людьми и выбора орками наставника

    @Override
    public String toString() {
        return getHitPoints() + "/" + getHealth() + " " + getName();
    }
}