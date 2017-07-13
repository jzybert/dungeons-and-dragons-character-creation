package races;

import enums.AbilityScoreType;
import enums.Language;
import enums.Size;
import enums.Weapon;

import java.util.*;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Dwarf extends Race {
    public Dwarf() {
        super(Size.MEDIUM, 25, true, Arrays.asList(Language.COMMON, Language.DWARVISH));
        this.increaseAbilityScore(AbilityScoreType.CONSTITUTION, 2);
        this.setWeaponProficiencies(Arrays.asList(Weapon.BATTLEAXE, Weapon.HANDAXE, Weapon.LIGHT_HAMMER, Weapon.WARHAMMER));

        this.additionalTraits.put("Dwarven Resilience.", "You have advantage on saving throws against poison, and you have " +
                "resistance against poison damage.");
        this.additionalTraits.put("Stonecunning.", "Whenever you make an Intelligence (History) check related to the " +
                "origin of stonework, you are considered proficient in the History skill and you double your " +
                "proficiency bonus to the check, instead of your normal proficiency bonus.");
    }
}
