import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        //System.out.println("--味方パーティ--");
        Hero hero = new Hero("勇者", 100, "剣");
        ArrayList<Character> party = new ArrayList<>();
        party.add(hero);
        party.add(new Wizard("魔法使い", 60, 30));
        party.add(new Theif("盗賊", 70));

        //System.out.println("--敵グループ--");
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Goblin('A', 50));
        monsters.add(new Matango('A', 45));
        monsters.add(new Slime('A', 40));

        System.out.println("--味方パーティ--");
        for (Character c : party) {
            c.showStatus();
        }

        System.out.println("--敵グループ--");
        for (Monster m : monsters) {
            m.showStatus();
        }

        System.out.println("味方の総攻撃！");
        for (Character c : party) {
            for (Monster m : monsters) {
                c.attack(m);
            }
        }

        System.out.println("敵の総攻撃!");
        for (Monster m : monsters) {
            for(Character c : party) {
                m.attack(c);
            }
        }

        System.out.println("ダメージを受けた勇者が突然光だした！");
        System.out.println("勇者はスーパーヒーローに進化した！");
        SuperHero superHero = new SuperHero(hero);
        party.set(0, superHero);
        SuperHero sh = (SuperHero) party.get(party.indexOf(superHero));


            for (Monster m : monsters) {
                sh.attack(m);
            }
        System.out.println("--味方パーティ最終ステータス--");
        for(Character c : party) {
            c.showStatus();
            System.out.print("生存状況:");
            if(c.isAlive()) {
                System.out.println("生存");
            }else {
                System.out.println("死亡");
            }
        }
        System.out.println("--敵グループ最終ステータス--");
        for (Monster m : monsters) {
            m.showStatus();
            System.out.print("生存状況:");
            if(m.isAlive()) {
                System.out.println("生存");
            }else{
                System.out.println("討伐済み");
            }
        }
    }
    }



