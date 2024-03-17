package PracticeJava.model;

public abstract class Character extends Person{

    //Chacracter의 추상 클래스를 상속받는 클래스가 attack 매소드를 구현하도록 강제화.
    public abstract void attack(Hero hero);
}
