package com.momo.heq.item.armors;

import com.momo.heq.item.ItemBase;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.item.ItemStack;

public class ItemHorseArmor extends ItemBase {
    private String armorName;

    public ItemHorseArmor(String name){
        super(name);
        this.setMaxStackSize(1);
        armorName = name;
    }

    @Override
    public HorseArmorType getHorseArmorType(ItemStack stack) {
        if (this.armorName.equals("emerald_horse_armor")) {
            return ModHorseArmor.HORSE_ARMOR_EMERALD; }
        else if(this.armorName.equals("leather_horse_armor")){
            return ModHorseArmor.HORSE_ARMOR_LEATHER;}
        else
            return HorseArmorType.NONE;
    }
}
