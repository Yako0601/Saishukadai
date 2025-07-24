public class Matango extends Monster{

    public Matango(char suffix,int hp){
        super("おばけきのこ",hp,suffix);
    }

    public void attack(Creature target){
        System.out.println(getName()+getSuffix()+"は体当たり攻撃！"+target.getName()+"に6のダメージを与えた！");
        target.setHp(target.getHp()-6);
    }
}
