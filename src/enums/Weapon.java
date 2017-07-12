package enums;

import java.util.List;

/**
 * Created by Jonathan on 7/12/17.
 */
public enum Weapon {
    CLUB("Club", 1, Currency.SILVER, 1, Dice.D4, DamageType.BLUDGEONING, 2, null),
    DAGGER("Dagger", 2, Currency.GOLD, 1, Dice.D4, DamageType.PIERCING, 1, null),
    GREATCLUB("Greatclub", 2, Currency.SILVER, 1, Dice.D8, DamageType.BLUDGEONING, 10, null),
    HANDAXE("Handaxe", 5, Currency.GOLD, 1, Dice.D6, DamageType.SLASHING, 2, null),
    JAVELIN("Javelin", 5, Currency.SILVER, 1, Dice.D6, DamageType.PIERCING, 2, null),
    LIGHT_HAMMER("Light hammer", 2, Currency.GOLD, 1, Dice.D4, DamageType.BLUDGEONING, 2, null),
    MACE("Mace", 5, Currency.GOLD, 1, Dice.D6, DamageType.BLUDGEONING, 4, null),
    QUARTERSTAFF("Quarterstaff", 2, Currency.SILVER, 1, Dice.D6, DamageType.BLUDGEONING, 4, null),
    SICKLE("Sickle", 1, Currency.GOLD, 1, Dice.D4, DamageType.SLASHING, 2, null),
    SPEAR("Spear", 1, Currency.GOLD, 1, Dice.D6, DamageType.PIERCING, 3, null);

    private String name;
    private int cost;
    private Currency costType;
    private int numberOfDiceForDamage;
    private Dice diceType;
    private DamageType damageType;
    private int weight;
    private List<WeaponProperty> propertiesList;

    Weapon(String name, int cost, Currency costType, int numberOfDice, Dice diceType, DamageType damageType,
           int weight, List<WeaponProperty> propertiesList) {
        this.name = name;
        this.cost = cost;
        this.costType = costType;
        this.numberOfDiceForDamage = numberOfDice;
        this.diceType = diceType;
        this.damageType = damageType;
        this.weight = weight;
        this.propertiesList = propertiesList;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public Currency getCostType() {
        return costType;
    }

    public int getNumberOfDiceForDamage() {
        return numberOfDiceForDamage;
    }

    public Dice getDiceType() {
        return diceType;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public int getWeight() {
        return weight;
    }

    public List<WeaponProperty> getPropertiesList() {
        return propertiesList;
    }
}
