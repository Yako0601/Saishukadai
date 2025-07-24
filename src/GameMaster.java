import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<>();
        party.add(new Hero("勇者",100,"剣"));
        party.add(new Wizard("魔法使い",60,30));
        party.add(new Theif("盗賊",70));

        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Goblin('A',50));
        monsters.add(new Matango('B',45));
        monsters.add(new Slime('A',40));

        for(Character c:party) {
            System.out.println(c.getName());
        }
        for(Monster m:monsters) {
            System.out.println(m.getName()+m.getSuffix());
        }
    }


}
