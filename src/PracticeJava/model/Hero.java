package PracticeJava.model;

public class Hero extends Character{

    //생성자
    public Hero(String name){
        setName(name);
    }
    private boolean isFlying;

    public boolean isFlying(){
        return isFlying;
    }

    public void setFlying(boolean flying){
        isFlying = flying;
    }

    @Override
    public void attack(Hero hero){
        System.out.println(this.getName()+"이 "+ hero.getName() + "과 싸움을 했다.");
    }
}
