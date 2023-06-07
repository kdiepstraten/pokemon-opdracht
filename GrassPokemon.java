public class GrassPokemon extends Pokemon{

    private String sex;

    public GrassPokemon(String name, Integer hp, Integer level, String type, Integer xp, String sex) {
        super(name, hp, level, type, xp);
        this.sex = sex;
    }

    @Override
    public void eats(){
        System.out.println("I am Vegan so no meat for me please.");
    }
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
