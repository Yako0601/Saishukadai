public final class Slime extends Monster{

    public Slime(char suffix,int hp){
        super("スライム",hp,suffix);
    }
    public void attack() {
        System.out.println("[name][suffix]は体当たり攻撃！[target.name]に6のダメージを与えた！");
    }
}
