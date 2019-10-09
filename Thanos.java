import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        List<Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        Hero Black = new Hero("Black Widow", 34);
        heroes.add(Black);
        // name: Captain America, age: 100
        Hero Captain = new Hero("Captain America", 100);
        heroes.add(Captain);
        // name: Vision, age: 3
        Hero Vision = new Hero("Vision", 3);
        heroes.add(Vision);
        // name: Iron Man, age: 48
        Hero Iron = new Hero("Iron Man", 48);
        heroes.add(Iron);
        // name: Scarlet Witch, age: 29
        Hero Scarlet = new Hero("Scarlet Witch", 29);
        heroes.add(Scarlet);
        // name: Thor, age: 1500
        Hero Thor = new Hero("Thor", 1500);
        heroes.add(Thor);
        // name: Spider-Man, age: 18
        Hero Spider= new Hero("Spider-Man", 18);
        heroes.add(Spider);
        // name: Hulk, age: 49
        Hero Hulk = new Hero("Hulk", 49);
        heroes.add(Hulk);
        // name: Doctor Strange, age: 42
        Hero Doctor = new Hero("Doctor Strange", 42);
        heroes.add(Doctor);

        // TODO 3 : It's Thor birthday, now he's 1501
        Thor.setAge(1501);
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        // TODO 5 : Keep only the half of the list
        System.out.println("");
        System.out.println("Original arrlist: ");
        for (Hero hero : heroes) {
            System.out.print(hero.getName() + " ");
            System.out.println("");
        }
        heroes = heroes.subList(0, 4);
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
        System.out.println("Happy birthday Thor, you are know " + Thor.getAge() + "! 🎉");
    }
}