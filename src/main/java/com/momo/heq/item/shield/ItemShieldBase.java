package com.momo.heq.item.shield;

import com.momo.heq.MoMoFramework;
import com.momo.heq.item.ModItems;
import com.momo.heq.util.IHasModel;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.util.text.translation.I18n;

import javax.annotation.Nullable;

public class ItemShieldBase extends ItemShield implements IHasModel {
    String displayName;
    public ItemShieldBase(String name, int maxDamageIn){
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        this.setMaxDamage(maxDamageIn);
        this.displayName = name;

        ModItems.ITEMS.add(this);
    }

    public String getItemStackDisplayName(ItemStack stack)
    {
            return I18n.translateToLocal("item." + displayName + ".name");
    }

    public boolean isShield(ItemStack stack, @Nullable EntityLivingBase entity)
    {
        return true;
    }

  @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        if(this == ModItems.IRON_SHIELD) {
            return repair.getItem() == Items.IRON_INGOT;}
        if(this == ModItems.GOLD_SHIELD){
            return repair.getItem() == Items.GOLD_INGOT;}
        if(this == ModItems.EMERALD_SHIELD){
            return repair.getItem() == Items.EMERALD;}
        if(this == ModItems.DIAMOND_SHIELD){
            return repair.getItem() == Items.DIAMOND;}
        else return super.getIsRepairable(toRepair, repair);
    }

    @Override
    public void registerModels() {
        MoMoFramework.proxy.registerItemRenderer(this, 0, "inventory"); }
}
