import org.w3c.dom.ls.LSOutput;

public abstract  class Character implements Creature{
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    private String name;
    private int hp;

    public final boolean isAlive(){
        if(hp > 0){
            return true;
        }else {
            return false;
        }
    }
    public Character(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public void showStatus(){
        System.out.println(getName()+":HP"+getHp());

    }
}
