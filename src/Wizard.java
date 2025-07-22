public class Wizard extends Character {
    int mp;

    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    public void attack(Creature target){
        mp = mp-1;
        System.out.println("[name]は火の玉をとなえた！[target.name]に3のダメージを与えた！");
    }

}
