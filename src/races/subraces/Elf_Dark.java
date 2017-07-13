package races.subraces;

import enums.AbilityScoreType;
import enums.Weapon;
import races.Elf;

import java.util.Arrays;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Elf_Dark extends Elf {

    public Elf_Dark() {
        super();
        this.increaseAbilityScore(AbilityScoreType.CHARISMA, 1);
        this.setWeaponProficiencies(Arrays.asList(Weapon.RAPIER, Weapon.SHORTSWORD, Weapon.CROSSBOW_HAND));

        this.additionalTraits.put("Superior Darkvision.", "Your darkvision has a radius of 120 feet.");
        this.additionalTraits.put("Sunlight Sensitivity.", "You have disadvantage on attack rolls and on Wisdom " +
                "(Perception) chekcs that rely on sight when you, the target of your attack, or whatever you are " +
                "trying to perceive is in direct sunlight.");
    }
}
