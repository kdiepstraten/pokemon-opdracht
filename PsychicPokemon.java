public class PsychicPokemon extends Pokemon{
    private Integer specialDefence;
    private Integer specialAttack;


    public PsychicPokemon(String name, Integer hp, Integer level, String type, Integer xp, Integer specialDefence, Integer specialAttack) {
        super(name, hp, level, type, xp);
        this.specialDefence = specialDefence;
        this.specialAttack = specialAttack;
    }

    // Getter and Setter
    public Integer getSpecialDefence() {
        return specialDefence;
    }
    public void setSpecialDefence(Integer specialDefence) {
        this.specialDefence = specialDefence;
    }
    public Integer getSpecialAttack(){
        return specialAttack;
    }
    public void setSpecialAttack(Integer specialAttack){
        this.specialAttack = specialAttack;
    }
    //Override
    @Override
    public void eats(){
        System.out.println("I like mushrooms!");
    }
    @Override   //Psychic Pokemon krijgen 100 special defence mee met iedere aanval
    public void tackle(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " do tackle!");
        pokemon.setHp(pokemon.getHp() - attack);
        this.setSpecialDefence(this.getSpecialDefence() + 100);
    }
    //Special Attack
    public void psychic(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " use Psychic!");
        pokemon.setHp(pokemon.getHp() - attack);
        this.setXp(this.getXp() + attack);
    }

    public void confusion(Integer attack, Pokemon pokemon){
        System.out.println(this.getName() + " use Confusion!");
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
