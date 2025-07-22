public abstract  class Character implements Creature{
    String name;
    int hp;

    public boolean isAlive(){
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
        System.out.println("name:HP[hp]");
    }
}
