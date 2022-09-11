package MaceraOyunu.obstacle;

public class Obstacle {
    private int id;
    private int damage;
    private int health;
    private String name;
    private int award;
    private int orjinalHealt;

    public Obstacle(int id,String name, int damage, int health, int award) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.orjinalHealt = health;
        this.award = award;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getAward() {
        return award;
    }

    public int getOrjinalHealt() {
        return orjinalHealt;
    }

    public void setOrjinalHealt(int orjinalHealt) {
        this.orjinalHealt = orjinalHealt;
    }

    public void setAward(int award) {
        this.award = award;
    }

}
