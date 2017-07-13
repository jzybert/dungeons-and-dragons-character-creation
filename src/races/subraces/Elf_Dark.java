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
    }
}
