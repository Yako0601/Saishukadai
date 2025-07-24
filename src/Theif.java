public class Theif extends Character{
    public Theif(String name,int hp){
        super(name,hp);
    }
    public void attack(Creature target) {
        System.out.println(getName() + "は素早く攻撃した！[target.name]に3のダメージを与えた！");
    }
}
