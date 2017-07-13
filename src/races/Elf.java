package races;

import enums.AbilityScoreType;
import enums.Language;
import enums.Size;

import java.util.Arrays;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Elf extends Race {

    public Elf() {
        super(Size.MEDIUM, 30, true, Arrays.asList(Language.COMMON, Language.ELVISH));
        this.increaseAbilityScore(AbilityScoreType.DEXTERITY, 2);
    }
}
