package com.momo.heq.item.tools;


import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;


public class ModToolMaterials{

    //Tool Material
	/*
	WOOD(0, 59, 2.0F, 0.0F, 15),
    STONE(1, 131, 4.0F, 1.0F, 5),
    IRON(2, 250, 6.0F, 2.0F, 14),
    DIAMOND(3, 1561, 8.0F, 3.0F, 10),
    GOLD(0, 32, 12.0F, 0.0F, 22);

    EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability).setRepairItem(ItemStack)
	*/

    public static final Item.ToolMaterial EMERALD =
            EnumHelper.addToolMaterial("emerald", 1, 46, 14.0F, 1.0F, 26)
                    .setRepairItem(new ItemStack(Items.EMERALD));

    public static final Item.ToolMaterial IRON_BLOCK =
            EnumHelper.addToolMaterial("iron_block", 2, 2250, 6.0F, 2.0F, 14)
                    .setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.IRON_BLOCK)));

    public static final Item.ToolMaterial DIAMOND_BLOCK =
            EnumHelper.addToolMaterial("diamond_block", 3, 14049, 8.0F, 3.0F, 10)
                    .setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.DIAMOND_BLOCK)));

    public static final Item.ToolMaterial GOLD_BLOCK =
            EnumHelper.addToolMaterial("gold_block", 0, 288, 12.0F, 0.0F, 22)
                    .setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.GOLD_BLOCK)));

    public static final Item.ToolMaterial EMERALD_BLOCK =
            EnumHelper.addToolMaterial("emerald_block", 1, 414, 14.0F, 1.0F, 26)
                    .setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.EMERALD_BLOCK)));
}
