import java.util.ArrayList;
import java.util.Scanner;
public class The_coffee_addict {
    private String name;
    private Creatures_and_coffee activeCreature;
    private Creatures_and_coffee enemy;




    public The_coffee_addict (String name, Creatures_and_coffee starter, Creatures_and_coffee enemy) {
        this.name = name;
        this.activeCreature = starter;
    }

//adding a change for testing. huge big big change


    public void fight(Creatures_and_coffee starter, Creatures_and_coffee enemy, int conditional) {
        if (conditional == 1) {
            Creatures_and_coffee.damageCalculator(starter.getName(), starter.getHealth(), enemy.getDamage(), starter.getElement(), enemy.getElement());
        } else if (conditional == 2) {
            Creatures_and_coffee.damageCalculator(enemy.getName(), enemy.getHealth(), starter.getDamage(), enemy.getElement(), starter.getElement());
        }
    }


    public void showActive() {
        System.out.println(name + " 's active: " + activeCreature);
    }
}