public class Wizard extends Character {
    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    private int mp;

    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    public void attack(Creature target){
        mp = mp-1;
        System.out.println(getName()+"は火の玉をとなえた!"+target.getName()+"に3のダメージを与えた！");
        target.setHp(target.getHp()-3);
    }

}
