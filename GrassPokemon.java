public class GrassPokemon extends Pokemon{

    private Integer specialDefence;
    private String location;

    public GrassPokemon(String name, Integer hp, Integer level, String type, Integer xp, Integer specialDefence, String location) {
        super(name, hp, level, type, xp);
        this.specialDefence = specialDefence;
        this.location = location;
    }

    //Getters and Setters
    public Integer getSpecialDefence() {
        return specialDefence;
    }
    public void setSpecialDefence(Integer specialDefence) {
        this.specialDefence = specialDefence;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    //Override
    @Override
    public void eats(){
        System.out.println("Im Vegan so no meat for me please. ");
    }
    @Override   // Grass Pokemon krijgt +100 special defence bij attack
    public void tackle(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " do tackle!");
        pokemon.setHp(pokemon.getHp() - attack);
        this.setSpecialDefence(this.getSpecialDefence() + 100);
    }

    // Special Attack
    public void razorLeaf(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " use Razor Leaf!");
        pokemon.setHp(pokemon.getHp() - attack);
        this.setXp(this.getXp() + attack);
    }

    public void vineWhip(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " use Vine Whip!");
        pokemon.setHp(pokemon.getHp() - attack);
        this.setXp(this.getXp() + attack);
    }

    public void leafStorm(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " use Leaf Storm!");
        pokemon.setHp(pokemon.getHp() - attack);
        this.setXp(this.getXp() + attack);
    }
}
