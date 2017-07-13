package races.subraces;

import enums.AbilityScoreType;
import enums.Weapon;
import races.Elf;

import java.util.Arrays;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Elf_Wood extends Elf {

    public Elf_Wood() {
        super();
        this.increaseAbilityScore(AbilityScoreType.WISDOM, 1);
        this.setWeaponProficiencies(Arrays.asList(Weapon.LONGSWORD, Weapon.SHORTSWORD, Weapon.SHORTBOW, Weapon.LONGBOW));
        this.setSpeed(35);
    }
}
