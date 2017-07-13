package enums;

import java.util.List;

/**
 * Created by Jonathan on 7/12/17.
 */
public enum Weapon {
    CLUB("Club", WeaponType.SIMPLE_MELEE, 1, Currency.SILVER, 1, Dice.D4, DamageType.BLUDGEONING, 2, null),
    DAGGER("Dagger", WeaponType.SIMPLE_MELEE, 2, Currency.GOLD, 1, Dice.D4, DamageType.PIERCING, 1, null),
    GREATCLUB("Greatclub", WeaponType.SIMPLE_MELEE, 2, Currency.SILVER, 1, Dice.D8, DamageType.BLUDGEONING, 10, null),
    HANDAXE("Handaxe", WeaponType.SIMPLE_MELEE, 5, Currency.GOLD, 1, Dice.D6, DamageType.SLASHING, 2, null),
    JAVELIN("Javelin", WeaponType.SIMPLE_MELEE, 5, Currency.SILVER, 1, Dice.D6, DamageType.PIERCING, 2, null),
    LIGHT_HAMMER("Light hammer", WeaponType.SIMPLE_MELEE, 2, Currency.GOLD, 1, Dice.D4, DamageType.BLUDGEONING, 2, null),
    MACE("Mace", WeaponType.SIMPLE_MELEE, 5, Currency.GOLD, 1, Dice.D6, DamageType.BLUDGEONING, 4, null),
    QUARTERSTAFF("Quarterstaff", WeaponType.SIMPLE_MELEE, 2, Currency.SILVER, 1, Dice.D6, DamageType.BLUDGEONING, 4, null),
    SICKLE("Sickle", WeaponType.SIMPLE_MELEE, 1, Currency.GOLD, 1, Dice.D4, DamageType.SLASHING, 2, null),
    SPEAR("Spear", WeaponType.SIMPLE_MELEE, 1, Currency.GOLD, 1, Dice.D6, DamageType.PIERCING, 3, null),

    CROSSBOW_LIGHT("Crossbow, light", WeaponType.SIMPLE_RANGED, 25, Currency.GOLD, 1, Dice.D8, DamageType.PIERCING, 5, null),
    DART("Dart", WeaponType.SIMPLE_RANGED, 5, Currency.COPPER, 1, Dice.D4, DamageType.PIERCING, .25, null),
    SHORTBOW("Shortbow", WeaponType.SIMPLE_RANGED, 25, Currency.GOLD, 1, Dice.D6, DamageType.PIERCING, 2, null),
    SLING("Sling", WeaponType.SIMPLE_RANGED, 1, Currency.SILVER, 1, Dice.D4, DamageType.BLUDGEONING, 0, null),

    BATTLEAXE("Battleaxe", WeaponType.MARTIAL_MELEE, 10, Currency.GOLD, 1, Dice.D8, DamageType.PIERCING, 4, null),
    FLAIL("Flail", WeaponType.MARTIAL_MELEE, 10, Currency.GOLD, 1, Dice.D8, DamageType.BLUDGEONING, 2, null),
    GLAIVE("Glaive", WeaponType.MARTIAL_MELEE, 20, Currency.GOLD, 1, Dice.D10, DamageType.SLASHING, 6, null),
    GREATAXE("Greataxe", WeaponType.MARTIAL_MELEE, 30, Currency.GOLD, 1, Dice.D12, DamageType.SLASHING, 7, null),
    GREATSWORD("Greatsword", WeaponType.MARTIAL_MELEE, 50, Currency.GOLD, 2, Dice.D6, DamageType.SLASHING, 6, null),
    HALBERD("Halberd", WeaponType.MARTIAL_MELEE, 20, Currency.GOLD, 1, Dice.D10, DamageType.SLASHING, 6, null),
    LANCE("Lance", WeaponType.MARTIAL_MELEE, 10, Currency.GOLD, 1, Dice.D12, DamageType.SLASHING, 6, null),
    LONGSWORD("Longsword", WeaponType.MARTIAL_MELEE, 15, Currency.GOLD, 1, Dice.D8, DamageType.PIERCING, 6, null),
    MAUL("Maul", WeaponType.MARTIAL_MELEE, 10, Currency.GOLD, 2, Dice.D6, DamageType.BLUDGEONING, 10, null),
    MORNINGSTAR("Morningstar", WeaponType.MARTIAL_MELEE, 15, Currency.GOLD, 1, Dice.D8, DamageType.PIERCING, 4, null),
    PIKE("Pike", WeaponType.MARTIAL_MELEE, 5, Currency.GOLD, 1, Dice.D10, DamageType.PIERCING, 18, null),
    RAPIER("Rapier", WeaponType.MARTIAL_MELEE, 25, Currency.GOLD, 1, Dice.D8, DamageType.PIERCING, 2, null),
    SCIMITAR("Scimitar", WeaponType.MARTIAL_MELEE, 25, Currency.GOLD, 1, Dice.D6, DamageType.SLASHING, 3, null),
    SHORTSWORD("Shortsword", WeaponType.MARTIAL_MELEE, 10, Currency.GOLD, 1, Dice.D6, DamageType.PIERCING, 2, null),
    TRIDENT("Trident", WeaponType.MARTIAL_MELEE, 5, Currency.GOLD, 1, Dice.D6, DamageType.PIERCING, 4, null),
    WAR_PICK("War pick", WeaponType.MARTIAL_MELEE, 5, Currency.GOLD, 1, Dice.D8, DamageType.PIERCING, 2, null),
    WARHAMMER("Warhammer", WeaponType.MARTIAL_MELEE, 15, Currency.GOLD, 1, Dice.D8, DamageType.BLUDGEONING, 2, null),
    WHIP("Whip", WeaponType.MARTIAL_MELEE, 2, Currency.GOLD, 1, Dice.D4, DamageType.SLASHING, 3, null),

    BLOWGUN("Blowgun", WeaponType.MARTIAL_RANGED, 10, Currency.GOLD, 1, null, DamageType.PIERCING, 1, null),
    CROSSBOW_HAND("Crossbow, hand", WeaponType.MARTIAL_RANGED, 75, Currency.GOLD, 1, Dice.D6, DamageType.PIERCING, 3, null),
    CROSSBOW_HEAVY("Crossbow, heavy", WeaponType.MARTIAL_RANGED, 50, Currency.GOLD, 1, Dice.D10, DamageType.PIERCING, 18, null),
    LONGBOW("Longbow", WeaponType.MARTIAL_RANGED, 50, Currency.GOLD, 1, Dice.D8, DamageType.PIERCING, 2, null),
    NET("Net", WeaponType.MARTIAL_RANGED, 1, Currency.GOLD, 0, null, null, 3, null);

    private String name;
    private WeaponType weaponType;
    private int cost;
    private Currency costType;
    private int numberOfDiceForDamage;
    private Dice diceType;
    private DamageType damageType;
    private double weight;
    private List<WeaponProperty> propertiesList;

    Weapon(String name, WeaponType weaponType, int cost, Currency costType, int numberOfDice, Dice diceType,
           DamageType damageType, double weight, List<WeaponProperty> propertiesList) {
        this.name = name;
        this.weaponType = weaponType;
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

    public WeaponType getWeaponType() {
        return weaponType;
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

    public double getWeight() {
        return weight;
    }

    public List<WeaponProperty> getPropertiesList() {
        return propertiesList;
    }
}
