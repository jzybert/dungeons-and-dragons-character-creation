package races;

import enums.AbilityScoreType;
import enums.Language;
import enums.Size;
import enums.Skill;

import java.util.Arrays;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Elf extends Race {

    public Elf() {
        super(Size.MEDIUM, 30, true, Arrays.asList(Language.COMMON, Language.ELVISH));
        this.increaseAbilityScore(AbilityScoreType.DEXTERITY, 2);
        this.setSkillProficiencies(Arrays.asList(Skill.PERCEPTION));

        this.additionalTraits.put("Fey Ancestry", "You have advantage on saving throws against being charmed, and magic " +
                "can't put you to sleep.");
        this.additionalTraits.put("Trance.", "You only need 4 hours of meditation in order to gain the benefits of an " +
                "8 hour long rest.");
    }
}
