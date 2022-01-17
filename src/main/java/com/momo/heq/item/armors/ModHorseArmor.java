package com.momo.heq.item.armors;

import com.momo.heq.MoMoFramework;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraftforge.common.util.EnumHelper;

public class ModHorseArmor{
    public static final HorseArmorType HORSE_ARMOR_LEATHER =
            EnumHelper.addHorseArmor("leather_horse_armor",
                    MoMoFramework.MODID + ":textures/entity/horse/armor/horse_armor_leather.png", 3);

    public static final HorseArmorType HORSE_ARMOR_EMERALD =
            EnumHelper.addHorseArmor("emerald_horse_armor",
                    MoMoFramework.MODID + ":textures/entity/horse/armor/horse_armor_emerald.png", 9);
}

