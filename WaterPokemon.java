public class WaterPokemon extends Pokemon{

    private Integer defence;
    private Boolean seaWater;

    public WaterPokemon(String name, Integer hp, Integer level, String type, Integer xp, Integer defence, Boolean seaWater) {
        super(name, hp, level, type, xp);
        this.defence = defence;
        this.seaWater = seaWater;
    }

    //Getter and Setter
    public Integer getDefence() {
        return defence;
    }
    public void setDefence(Integer defence) {
        this.defence = defence;
    }
    public Boolean getSeaWater() {
        return seaWater;
    }
    public void setSeaWater(Boolean seaWater) {
        this.seaWater = seaWater;
    }

    //Override
    @Override
    public void eats(){
        System.out.println("Hmmm Bubblegum!");
    }
    @Override   // Water Pokemon bij tackle +100 defence
    public void tackle(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " do tackle!");
        pokemon.setHp(pokemon.getHp() - attack);
        this.setDefence(this.getDefence() + 100);
    }

    // Special Attacks
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
