package com.momo.heq.init;

import com.momo.heq.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModCreativeTab {
    public static final CreativeTabs HARDER_TOOL = new CreativeTabs(CreativeTabs.getNextID(), "harder_tool")
    {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem() { return new ItemStack(ModItems.IRON_BLOCK_AXE); }
    };

    public static final CreativeTabs HARDER_COMBAT = new CreativeTabs(CreativeTabs.getNextID(), "harder_combat")
    {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModItems.GOLD_BLOCK_SWORD);
        }
    };
}
