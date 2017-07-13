package races.subraces;

import enums.AbilityScoreType;
import enums.ArmorType;
import races.Dwarf;

import java.util.Arrays;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Dwarf_Mountain extends Dwarf {

    public Dwarf_Mountain() {
        super();
        this.increaseAbilityScore(AbilityScoreType.STRENGTH, 2);
        this.setArmorProficiencies(Arrays.asList(ArmorType.LIGHT, ArmorType.MEDIUM));
    }
}
