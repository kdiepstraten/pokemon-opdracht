public class FirePokemon extends Pokemon{

    private String color;
    private Boolean strong;

    public FirePokemon(String name, Integer hp, Integer level, String type, Integer xp, String color, Boolean strong) {
        super(name, hp, level, type, xp);
        this.color = color;
        this.strong = strong;
    }

    //Getters and Setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Boolean getStrong() {
        return strong;
    }
    public void setStrong(Boolean strong) {
        this.strong = strong;
    }

    //Override
    @Override
    public void eats(){
        System.out.println("Give me some Hot Cheetos please!");
    }
    @Override // Fire Pokemon krijgen +50 attack en +50 xp bij uitvoeren van Tackle
    public void tackle(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " do tackle!");
        attack = attack + 50;
        pokemon.setHp(pokemon.getHp() - attack);
        this.setXp(this.getXp() + 50);
    }

    // Special Attack
    public void heatwave(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " use Heatwave!");
        pokemon.setHp(pokemon.getHp() - attack);
        this.setXp(this.getXp() + attack);
    }
    public void flamethrower(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " use Flamethrower");
        pokemon.setHp(pokemon.getHp() - attack);
        this.setXp(this.getXp() + attack);
    }
    // Laat een pokemon een level omhoog gaan na 200 xp
    public void levelUp(Pokemon pokemon){
        if (pokemon.getXp()> 200){
            pokemon.setLevel(pokemon.getLevel() + 1);
            pokemon.setXp(0);
        }
    }
}
