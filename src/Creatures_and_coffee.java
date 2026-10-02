public class Creatures_and_coffee {
    private String name;
    private double health;
    private int defense;
    private double damage;
    private int level;
    private String element;
    private String description;












    public Creatures_and_coffee(String name, double health, int defense, double damage, int level, String element, String description) {
        this.name = name;
        this.health = health;
        this.defense = defense;
        this.damage = damage;
        this.level = level;
        this.element = element;
        this.description = description;








    }










    public String getName() {
        return name;
    }




    public String getDescription() {
        return description;
    }




    public double getHealth() {
        return health;
    }




    public int getDefense() {
        return defense;
    }




    public double getDamage() {
        return damage;
    }




    public int getLevel() {
        return level;
    }




    public String getElement() {
        return element;
    }


    private static int totalCreated = 0;
    public Creatures_and_coffee(String name, double level, double hp) {
        // ... set fields ...
        totalCreated++;
    }










    // stupid calculations of elements, yes its palworld logic, also future reminder you will need even numbers
    public static double damageCalculator(String name, double health, double damagerecieved, String coffeeElement, String enemyElement) {
        double result = health - damagerecieved;








        // fire v grass&ice
        if (coffeeElement.equals("Grass") && enemyElement.equals("Fire")) {
            damagerecieved = damagerecieved * 2;
            result = health - damagerecieved;
        } else if (coffeeElement.equals("Ice") && enemyElement.equals("Fire")) {
            damagerecieved = damagerecieved * 2;
            result = health - damagerecieved;
        } else if (coffeeElement.equals("Fire") && enemyElement.equals("Grass")) {
            damagerecieved = damagerecieved / 2;
            result = health - damagerecieved;
        } else if (coffeeElement.equals("Fire") && enemyElement.equals("Ice")) {
            damagerecieved = damagerecieved / 2;
            result = health - damagerecieved;
        } else {
        }








        // Ice v Dragon
        if (coffeeElement.equals("Dragon") && enemyElement.equals("Ice")) {
            damagerecieved = damagerecieved * 2;
            result = health - damagerecieved;
        } else if (coffeeElement.equals("Ice") && enemyElement.equals("Dragon")) {
            damagerecieved = damagerecieved / 2;
            result = health - damagerecieved;
        } else {
        }








        // Dark v Dragon
        if (coffeeElement.equals("Dark") && enemyElement.equals("Dragon")) {
            damagerecieved = damagerecieved * 2;
            result = health - damagerecieved;
        } else if (coffeeElement.equals("Dragon") && enemyElement.equals("Dark")) {
            damagerecieved = damagerecieved / 2;
            result = health - damagerecieved;
        } else {
        }








        // Dark v neutral
        if (coffeeElement.equals("Neutral") && enemyElement.equals("Dark")) {
            damagerecieved = damagerecieved * 2;
            result = health - damagerecieved;
        } else if (coffeeElement.equals("Dark") && enemyElement.equals("Neutral")) {
            damagerecieved = damagerecieved / 2;
            result = health - damagerecieved;
        } else {
        }








        // water v fire
        if (coffeeElement.equals("Fire") && enemyElement.equals("Water")) {
            damagerecieved = damagerecieved * 2;
            result = health - damagerecieved;
        } else if (coffeeElement.equals("Water") && enemyElement.equals("Fire")) {
            damagerecieved = damagerecieved / 2;
            result = health - damagerecieved;
        } else {
        }








        // grass & ground
        if (coffeeElement.equals("Ground") && enemyElement.equals("Grass")) {
            damagerecieved = damagerecieved * 2;
            result = health - damagerecieved;
        } else if (coffeeElement.equals("Grass") && enemyElement.equals("Ground")) {
            damagerecieved = damagerecieved / 2;
            result = health - damagerecieved;
        } else {
        }








        // electric & ground
        if (coffeeElement.equals("Electric") && enemyElement.equals("Ground")) {
            damagerecieved = damagerecieved * 2;
            result = health - damagerecieved;
        } else if (coffeeElement.equals("Ground") && enemyElement.equals("Electric")) {
            damagerecieved = damagerecieved / 2;
            result = health - damagerecieved;
        } else {
        }








        // electric & water
        if (coffeeElement.equals("Water") && enemyElement.equals("Electric")) {
            damagerecieved = damagerecieved * 2;
            result = health - damagerecieved;
        } else if (coffeeElement.equals("Electric") && enemyElement.equals("Water")) {
            damagerecieved = damagerecieved / 2;
            result = health - damagerecieved;
        } else {
        }




        // health decider
        if (health == 0) {
            System.out.println("Hey this " + name + "kinda died");
        }
        return result;




    }




    public void setLevel(int level, double health, double damage) {
        double damagestart = damage * 0.05;
        double damageresult1 = damagestart * level;
        double Healthstart = health * 0.05;
        double healthresult1 = Healthstart * level;
        double healthresult = health + healthresult1;
        double damageresult = damageresult1 + damage;








        this.health = healthresult;
        this.damage =  damageresult;
        this.level = level;




    }
}


