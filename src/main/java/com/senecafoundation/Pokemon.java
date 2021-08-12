package com.senecafoundation;
import java.util.List;
import java.util.ArrayList;

public class Pokemon extends ActualPokemon{
    private String name;
    private String avgSize; 
    private String region; 
    private Integer hp; 
    private Integer attack; 
    private Integer defense; 
    private Integer spDefense;
    private Integer spAttack; 
    private Integer speed; 
    private List<PokemonType> types = new ArrayList<PokemonType>();
    //new file called pokemon type
    //
    
    public Pokemon(
        String name, 
        String avgSize,
        String color, 
        String region, 
        Integer hp, 
        Integer attack, 
        Integer defense, 
        Integer spDefense, 
        Integer spAttack, 
        Integer speed,
        String ability1, //active ability in future
        List<PokemonType> types
        ) {
        super(color, ability1);
        this.setName(name);
        this.setAvgSize(avgSize);
        this.setRegion(region);
        this.setHp(hp);
        this.setAttack(attack);
        this.setDefense(defense);
        this.setSpDefense(spDefense);
        this.setSpAttack(spAttack);
        this.setSpeed(speed);
        this.setTypes(types);
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name; 
    }
    public String getAvgSize()
    {
        return avgSize;
    }
    public void setAvgSize(String avgSize)
    {
        this.avgSize = avgSize;
    }
    public String getRegion()
    {
        return region; 
    }
    public void setRegion(String region)
    {
        this.region = region;
    }
    public Integer getHp()
    {
        return hp; 
    }
    public void setHp(Integer hp)
    {
        this.hp = hp;
    }
    public Integer getAttack()
    {
        return attack;
    }
    public void setAttack(Integer attack)
    {
        this.attack = attack; 
    }
    public Integer getDefense()
    {
        return defense; 
    }
    public void setDefense(Integer defense)
    {
        this.defense = defense;
    }
    public Integer getSpDefense()
    {
        return spDefense;
    }
    public void setSpDefense(Integer spDefense)
    {
        this.spDefense = spDefense;
    }
    public Integer getSpAttack()
    {
        return spAttack;
    }
    public void setSpAttack(Integer spAttack)
    {
        this.spAttack = spAttack;
    }
    public Integer getSpeed()
    {
        return speed;
    }
    public void setSpeed(Integer speed)
    {
        this.speed = speed;
    }
    public List<PokemonType> getTypes(){
        return types;
    }
    public void setTypes(List<PokemonType> types)
    {
        this.types = types;
    }
}
