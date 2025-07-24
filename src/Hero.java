public class Hero extends Character{
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    private String weapon;

    public Hero(String name, int hp,String weapon){
        super(name,hp);
        this.weapon = weapon;
    }
    public void attack(Creature target) {
        System.out.println(getName()+"は"+getWeapon()+"で攻撃！"+target.getName()+"に10のダメージを与えた！");
        target.setHp(target.getHp()-10);
    }
}
