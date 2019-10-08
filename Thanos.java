import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<String> hero = new ArrayList<String>();
        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        Hero Black = new Hero("Black Widow", 34);
        hero.add("Black Widow");
        // name: Captain America, age: 100
        Hero Captain = new Hero("Captain America", 100);
        hero.add("Captain America");
        // name: Vision, age: 3
        Hero Vision = new Hero("Vision", 3);
        hero.add("Vision");
        // name: Iron Man, age: 48
        Hero Iron = new Hero("Iron Man", 48);
        hero.add("Iron Man");
        // name: Scarlet Witch, age: 29
        Hero Scarlet = new Hero("Scarlet Witch", 29);
        hero.add("Scarlet Witch");
        // name: Thor, age: 1500
        Hero Thor = new Hero("Thor", 1500);
        hero.add("Thor");
        // name: Spider-Man, age: 18
        Hero Spider= new Hero("Spider-Man", 18);
        hero.add("Spider-Man");
        // name: Hulk, age: 49
        Hero Hulk = new Hero("Hulk", 49);
        hero.add("Hulk");
        // name: Doctor Strange, age: 42
        Hero Doctor = new Hero("Doctor Strange", 42);
        hero.add("Doctor Strange");

        // TODO 3 : It's Thor birthday, now he's 1501
        Thor.setAge(1501);
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(hero);
        // TODO 5 : Keep only the half of the list
        System.out.println("Original arrlist: " + hero);
        List<String> hero2 = hero.subList(0, 4);
        System.out.println("Sublist of arrlist: " + hero2);
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for(int i = 0; i < hero2.size(); i++){
            System.out.println(hero.get(i));
        }
        // TODO 7 : Display the age of Thor
        System.out.println("Happy birthday Thor, you are know " + Thor.getAge() + "! 🎉");
    }
}