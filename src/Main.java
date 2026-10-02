import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;


// I am stuck in utter confusion
public class Main {
    public static void Main(String[] args) throws InterruptedException {


        // bunch of cofeee hahahahahahahahahahahaha
        List<Creatures_and_coffee> starter = new ArrayList<>();
        List<Creatures_and_coffee> enemy = new ArrayList<>();
        starter.add(new Creatures_and_coffee("Black Coffee", 20, 5, 5, 1, "Dark", "The coffee was animated by sheer spite and self hatred, whoever commanded this creature would soon gain such self hatred"));
        enemy.add(new Creatures_and_coffee("Bad Black Coffee", 20, 5, 5, 1, "Dark", "What's worse than black coffee, bad black coffee of course! The sheer hatred and spite had caused this creature to reject morals and go bad."));
        starter.add(new Creatures_and_coffee("Decaf", 1, 5, 2, 1, "Normal", "A pathetic creature, whoever commands it should just feel shame for forcing it into battle, it is a shame there is no laws yet."));
        enemy.add(new Creatures_and_coffee("Bad Decaf", 1, 5, 2, 1, "Normal", "Due to the abuses of its former owner, it became more bitter. It now flails its arms weakly at anyone who stumbles upon it."));
        starter.add(new Creatures_and_coffee("Espresso", 5, 20, 50, 1, "Dark", "A small yet powerful creature, even if it has no durability against any foe, its attack sure pack a punch."));
        enemy.add(new Creatures_and_coffee("Bad Espresso", 5, 20, 50, 1, "Dark", "The minute creature who was tired of being severely underestimated soon rejected societal norms and turned bitter"));
        starter.add(new Creatures_and_coffee("Macchiato", 15, 1, 10, 1, "Grass", "Its rage diluted by the water and milk, causing it to be larger but it unfortunately does not retain the strength of a espresso."));
        enemy.add(new Creatures_and_coffee("Bad Macchiato", 15, 1, 10, 1, "Grass", "Unlike the whole other lot of 'bad' coffee creatures, these Macchiato creatures became so diluted that they are lazy and only disobey others out of sloth."));
        starter.add(new Creatures_and_coffee("Cappuccino", 20, 5, 17, 1, "Fire", "Basic, all around the type of creature that a strange old man would hand to you and let you wander off into the world without supervision."));
        enemy.add(new Creatures_and_coffee("Bad Cappuccino", 20, 5, 17, 1, "Fire", "Imagine being handed your starter creature and then you notice this thing. The creature is caged and as soon as you reach for it the scientist stops you and warns against it."));
        starter.add(new Creatures_and_coffee("Frappe", 30, 5, 12, 1, "Ice", "The bitterness of once powerful espresso shot mixed with a cold bitter resentment. In consequence it lost the strength it once had but gained more durability to survive it's foes."));
        enemy.add(new Creatures_and_coffee("Bad Frappe", 30, 5, 12, 1, "Ice", "The espresso shot did not gain fresh cold milk mixed in with the bitterness. The sour rotten mixture created a putrid mutation that filled it with rage and hatred causing it to be cold yet wrathful."));
        starter.add(new Creatures_and_coffee("Americano", 5, 5, 2, 1, "Water", "It once was a brutal creature filled with an unstoppable rage that soon was poisoned which resulted into the diluted husk of what it once was."));
        enemy.add(new Creatures_and_coffee("Bad Americano", 5, 5, 2, 1, "Water", "Imagine losing your strength, combined with a huge amount of junk that makes your body so weak that you can barely lift a pencil; The Bad Americano while retaining its hatred, it can only just gently push and shove others in it's rage."));
        starter.add(new Creatures_and_coffee("Mocha", 50, 1, 1, 1, "Dragon", "The sweetness of sugar and chocolate fattened the gluttonous creature until it became a colossal bloated wall."));
        enemy.add(new Creatures_and_coffee("Bad Mocha", 50, 1, 1, 1, "Dragon", "Instead of sweet regular chocolate, this poor creature tortured itself gorging on dark chocolate. Swollen and fattened by its habits, it was not long until it became a bloated wall of sugar and fat with barely any caffeine in the mix."));




        Scanner input = new Scanner(System.in);
        boolean blasphemousrejection = false;
        while (!blasphemousrejection) {
            for (Creatures_and_coffee E : enemy) {
                enemy.removeIf(e -> e.getHealth() <= 0);
                E.wait();
            }
        }
    }


}





