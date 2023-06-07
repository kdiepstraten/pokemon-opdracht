import java.sql.SQLOutput;

public class Pokemon {
    private String name;
    private Integer hp;
    private Integer xp;
    private Integer level;
    private String type;


    public Pokemon(String name, Integer hp, Integer level, String type, Integer xp) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.type = type;
        this.xp = xp;
    }

    //Methods
    public void tackle(Integer attack, Pokemon pokemon){
        System.out.println(this.name + " do tackle!");
        pokemon.hp = pokemon.hp- attack;
    }
    public void heal(Pokemon pokemon){
        pokemon.hp = pokemon.hp + 250;
    }
    public void eats(){
        System.out.println(" ");
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
