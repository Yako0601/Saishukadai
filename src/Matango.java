public class Matango extends Monster{

    public Matango(char suffix,int hp){
        super("おばけきのこ",hp,suffix);
    }

    public void attack(){
        System.out.println("[name][suffix]は体当たり攻撃！[target.name]に6のダメージを与えた！");
    }
}
