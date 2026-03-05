package feature.domain;

public class Person {

    private String id;
    private String atk;
    private String defense;
    private String speed;
    private String mana;

    public Person(String id, String atk, String defense, String speed, String mana) {
        this.id = id;
        this.atk = atk;
        this.defense = defense;
        this.speed = speed;
        this.mana = mana;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAtk() {
        return atk;
    }

    public void setAtk(String atk) {
        this.atk = atk;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getMana() {
        return mana;
    }

    public void setMana(String mana) {
        this.mana = mana;
    }
}
