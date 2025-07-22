public abstract class Monster implements Creature {
    String name;
    int hp;
    char suffix;

    public Monster(String name, int hp, char suffix) {
        this.name = name;
        this.hp = hp;
    }
    public boolean isAlive() {
        if (this.hp <= 0) {
            return true;
        }else{
            return false;
        }
    }
    public void showStatus(){
        System.out.println("name:HP[hp]");
    }
}
