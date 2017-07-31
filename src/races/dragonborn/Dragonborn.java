package races.dragonborn;

import enums.AbilityScoreType;
import enums.Language;
import enums.Size;
import races.Race;

import java.util.Arrays;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Dragonborn extends Race {

    private DraconicAncestry draconicAncestry;

    public Dragonborn() {
        super(Size.MEDIUM, 30, false, Arrays.asList(Language.COMMON, Language.DRACONIC));
        this.increaseAbilityScore(AbilityScoreType.STRENGTH, 2);
        this.increaseAbilityScore(AbilityScoreType.CHARISMA, 1);

        int savingThrowDC = 8;
        String damage = "2d6";
        this.additionalTraits.put("Breath Weapon", "You can use your action to exhale destructive energy.\n" +
                " When you use your breath weapon, each creature in a " + this.draconicAncestry.getShapeOfBreath() + " must " +
                "make a saving throw. The DC for this saving throw is " + savingThrowDC + ". A creature takes " + damage + " on" +
                "a failed save, and half as much damage on a successful one.\n After you use your breath weapon, you can't " +
                "use it again until you complete a short or long rest.");
    }
}
