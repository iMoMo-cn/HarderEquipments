package com.momo.heq.item.armors;


import com.momo.heq.MoMoFramework;
import com.momo.heq.util.Reference;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;


public class ModArmorMaterials {

    //Armor Material
	/*
	（nameIn, maxDamageFactorIn, damageReductionAmountArrayIn[], enchantabilityIn, soundEventIn, toughnessIn）
	LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts[], enchantability, soundOnEquip, toughness).setRepairItem(ItemStack)
	*/

    public static final ItemArmor.ArmorMaterial EMERALD =
            EnumHelper.addArmorMaterial("emerald", MoMoFramework.MODID + ":emerald",11, new int[]{1, 3, 5, 2},
                    30, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F).setRepairItem(new ItemStack(Items.EMERALD));

    public static final ItemArmor.ArmorMaterial IRON_BLOCK =
            EnumHelper.addArmorMaterial("iron_block", MoMoFramework.MODID + ":iron_block", 135, new int[]{2, 5, 6, 2},
                    9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.IRON_BLOCK)));

    public static final ItemArmor.ArmorMaterial DIAMOND_BLOCK =
            EnumHelper.addArmorMaterial("diamond_block", MoMoFramework.MODID + ":diamond_block", 297, new int[]{3, 6, 8, 3},
                    10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.DIAMOND_BLOCK)));

    public static final ItemArmor.ArmorMaterial GOLD_BLOCK =
            EnumHelper.addArmorMaterial("gold_block", MoMoFramework.MODID + ":gold_block", 63, new int[]{1, 3, 5, 2},
                    25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.GOLD_BLOCK)));

    public static final ItemArmor.ArmorMaterial EMERALD_BLOCK =
            EnumHelper.addArmorMaterial("emerald_block", MoMoFramework.MODID + ":emerald_block", 99, new int[]{1, 3, 5, 2},
                    25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.EMERALD_BLOCK)));
}
