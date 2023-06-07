public class WaterPokemon extends Pokemon{

    private Integer height;

    public WaterPokemon(String name, Integer hp, Integer level, String type, Integer xp, Integer height) {
        super(name, hp, level, type, xp);
        this.height = height;
    }

    @Override
    public void eats(){
        System.out.println("Hmmm Bubblegum!");
    }
    public void hydroPump(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " use Hydro Pump!");
        pokemon.setHp(pokemon.getHp() - attack);
        this.setXp(this.getXp() + attack);
    }

    public void surf(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " use Surf!");
        pokemon.setHp(pokemon.getHp() - attack);
        this.setXp(this.getXp() + attack);
    }
}
