public class Goblin extends Monster{

    public Goblin(char suffix,int hp){
        super("ゴブリン",hp,suffix);
    }
    public void attack(Creature target){
        System.out.println(getName()+getSuffix()+"はナイフで切りつけた！[target.name]に8のダメージを与えた！");
    }
}
