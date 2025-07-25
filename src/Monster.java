public abstract class Monster implements Creature {
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

    public char getSuffix() {
        return suffix;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }

    private String name;
    private int hp;
    private char suffix;

    public Monster(String name, int hp, char suffix) {
        this.name = name;
        this.hp = hp;
        this.suffix = suffix;
    }
    public boolean isAlive() {
        if (this.hp >= 0) {
            return true;
        }else{
            return false;
        }
    }
    public void showStatus(){
        System.out.println(getName()+":HP"+getHp());
    }
}
