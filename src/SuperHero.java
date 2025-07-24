public class SuperHero extends Hero {
    public SuperHero(Hero hero){
        super(hero.getName(), hero.getHp(), hero.getWeapon());
    }
    public void attack(Creature target) {
        System.out.println(getName()+"は"+getWeapon()+"で攻撃！[target.name]に25のダメージを与えた！");
    }
}