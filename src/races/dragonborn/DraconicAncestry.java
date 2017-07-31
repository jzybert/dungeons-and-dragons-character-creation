package races.dragonborn;

import enums.DamageType;

/**
 * Created by Jonathan on 7/31/17.
 */
public enum DraconicAncestry {
    BLACK(DamageType.ACID, "5 by 30 ft. line (Dex. save)"), BLUE(DamageType.LIGHTNING, "5 by 30 ft. line (Dex. save)"),
    BRASS(DamageType.FIRE, "5 by 30 ft. line (Dex. save)"), BRONZE(DamageType.LIGHTNING, "5 by 30 ft. line (Dex. save)"),
    COPPER(DamageType.ACID, "5 by 30 ft. line (Dex. save)"), GOLD(DamageType.FIRE, "15 ft. cone (Dex. save)"),
    GREEN(DamageType.POISON, "15 ft. cone (Con. save)"), RED(DamageType.FIRE, "15 ft. cone (Dex. save)"),
    SILVER(DamageType.COLD, "15 ft. cone (Con. save)"), WHITE(DamageType.COLD, "15 ft. cone (Con. save)");

    private DamageType damageType;
    private String shapeOfBreath;

    DraconicAncestry(DamageType damageType, String shapeOfBreath) {
        this.damageType = damageType;
        this.shapeOfBreath = shapeOfBreath;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public String getShapeOfBreath() {
        return shapeOfBreath;
    }
}
