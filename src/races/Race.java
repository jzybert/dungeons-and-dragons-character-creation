package races;

import enums.*;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Race {
    private Map<AbilityScoreType, Integer> abilityScoreIncrease;
    private final Size size;
    private int speed;
    private boolean hasDarkvision;
    private List<Language> languages;

    protected Map<String, String> additionalTraits;

    private List<Skill> skillProficiencies;
    private List<Weapon> weaponProficiencies;
    private List<ArmorType> armorProficiencies;

    public Race(Size size, int speed, boolean hasDarkvision, List<Language> languages) {
        this.abilityScoreIncrease = this.mapInitialAbilityScoreIncrease();
        this.size = size;
        this.speed = speed;
        this.hasDarkvision = hasDarkvision;
        this.languages = languages;
    }

    public void setWeaponProficiencies(List<Weapon> weaponProficiencies) {
        this.weaponProficiencies = weaponProficiencies;
    }

    public void setArmorProficiencies(List<ArmorType> armorProficiencies) {
        this.armorProficiencies = armorProficiencies;
    }

    public void setSkillProficiencies(List<Skill> skillProficiencies) {
        this.skillProficiencies = skillProficiencies;
    }

    public void increaseAbilityScore(AbilityScoreType abilityScoreType, int amount) {
        abilityScoreIncrease.put(abilityScoreType, amount);
    }

    private Map<AbilityScoreType, Integer> mapInitialAbilityScoreIncrease() {
        Map<AbilityScoreType, Integer> map = new HashMap<>();
        map.put(AbilityScoreType.STRENGTH, 0);
        map.put(AbilityScoreType.DEXTERITY, 0);
        map.put(AbilityScoreType.CONSTITUTION, 0);
        map.put(AbilityScoreType.INTELLIGENCE, 0);
        map.put(AbilityScoreType.WISDOM, 0);
        map.put(AbilityScoreType.CHARISMA, 0);
        return map;
    }

    public Size getSize() {
        return size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isHasDarkvision() {
        return hasDarkvision;
    }

    public List getLanguages() {
        return languages;
    }

    public List<Skill> getSkillProficiencies() {
        return skillProficiencies;
    }

    public List<Weapon> getWeaponProficiencies() {
        return weaponProficiencies;
    }

    public List<ArmorType> getArmorProficiencies() {
        return armorProficiencies;
    }

    public Map<String, String> getAdditionalTraits() {
        return additionalTraits;
    }
}
