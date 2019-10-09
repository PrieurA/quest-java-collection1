import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        List<Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        Hero black = new Hero("Black Widow", 34);
        heroes.add(black);
        // name: Captain America, age: 100
        Hero captain = new Hero("Captain America", 100);
        heroes.add(captain);
        // name: Vision, age: 3
        Hero vision = new Hero("Vision", 3);
        heroes.add(vision);
        // name: Iron Man, age: 48
        Hero iron = new Hero("Iron Man", 48);
        heroes.add(iron);
        // name: Scarlet Witch, age: 29
        Hero scarlet = new Hero("Scarlet Witch", 29);
        heroes.add(scarlet);
        // name: Thor, age: 1500
        Hero thor = new Hero("Thor", 1500);
        heroes.add(thor);
        // name: Spider-Man, age: 18
        Hero spider= new Hero("Spider-Man", 18);
        heroes.add(spider);
        // name: Hulk, age: 49
        Hero hulk = new Hero("Hulk", 49);
        heroes.add(hulk);
        // name: Doctor Strange, age: 42
        Hero doctor = new Hero("Doctor Strange", 42);
        heroes.add(doctor);

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        // TODO 5 : Keep only the half of the list
        System.out.println("");
        System.out.println("Original arrlist: ");
        for (Hero hero : heroes) {
            System.out.print(hero.getName() + " ");
            System.out.println("");
        }
        heroes = heroes.subList(0, heroes.size() /2);
        System.out.println("");
        System.out.println("Sublist of arrlist: ");
        for (Hero hero2 : heroes) {
            System.out.print(hero2.getName() + " ");
            System.out.println("");
        }
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        System.out.println("");
        System.out.println("Remaining heroes: ");
        for (Hero Hero : heroes) {
            System.out.println(Hero.getName());
        }
        // TODO 7 : Display the age of Thor
        System.out.println("");
        System.out.println("Happy birthday Thor, you are now " + thor.getAge() + "! 🎉");
    }
}