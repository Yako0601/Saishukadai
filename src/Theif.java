public class Theif extends Character{
    public Theif(String name,int hp){
        super(name,hp);
    }
    public void attack(Creature target) {
        System.out.println(getName() + "は、素早く攻撃した！"+target.getName()+"に3のダメージを与えた！");
        target.setHp(target.getHp()-3);
    }
}
