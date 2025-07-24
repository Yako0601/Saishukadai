import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        Hero hero = new Hero("勇者", 100, "剣");
        ArrayList<Character> party = new ArrayList<>();
        party.add(hero);
        party.add(new Wizard("魔法使い", 60, 30));
        party.add(new Theif("盗賊", 70));

        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Goblin('A', 50));
        monsters.add(new Matango('B', 45));
        monsters.add(new Slime('A', 40));

        for (Character c : party) {
            c.showStatus();
        }

        for (Monster m : monsters) {
            m.showStatus();
        }

        for (Character c : party) {
            for (Monster m : monsters) {
                c.attack(m);
            }
        }

        for (Monster m : monsters) {
            for(Character c : party) {
                m.attack(c);
            }
        }
        SuperHero superHero = new SuperHero(hero);
        party.set(0, superHero);
        SuperHero sh = (SuperHero) party.get(party.indexOf(superHero));


            for (Monster m : monsters) {
                sh.attack(m);
            }
    }
    public boolean isAlive(){
        System.out.println();
    }
}

