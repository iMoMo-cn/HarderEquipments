package com.momo.heq.item.food;

import com.momo.heq.item.ItemVariantBase;
import com.momo.heq.util.IHasModel;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemAppleBase extends ItemVariantBase implements IHasModel {
    /** Number of ticks to run while 'EnumAction'ing until result. */
    public final int itemUseDuration;
    /** The amount this food item heals the player. */
    private final int healAmount;
    private final float saturationModifier;
    /** Whether wolves like this food (true for raw and cooked porkchop). */
    private final boolean isWolfsFavoriteMeat;
    /** If this field is true, the food can be consumed even if the player don't need to eat. */
    private boolean alwaysEdible;

    public ItemAppleBase(String name, int count) {
        super(name, count);
        this.healAmount = 4;
        this.isWolfsFavoriteMeat = false;
        this.saturationModifier = 1.2F;
        this.itemUseDuration = 32;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return super.hasEffect(stack) || stack.getMetadata() % 2 == 1;
    }

    public EnumRarity getRarity(ItemStack stack)
    {
        return stack.getMetadata() % 2 == 0 ? EnumRarity.RARE : EnumRarity.EPIC;
    }

   public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            entityplayer.getFoodStats().addStats(this.healAmount, this.saturationModifier);
            worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            this.onFoodEaten(stack, worldIn, entityplayer);
            entityplayer.addStat(StatList.getObjectUseStats(this));

            if (entityplayer instanceof EntityPlayerMP)
            {
                CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP)entityplayer, stack);
            }
        }

        stack.shrink(1);
        return stack;
    }

    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote) {
            if (stack.getMetadata() == 0) {
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 0));
            } else if (stack.getMetadata() == 1) {
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 3));
            } else if (stack.getMetadata() == 2) {
                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 200, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2400, 0));
            } else if (stack.getMetadata() == 3){
                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 800, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 6000, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 3));
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 6000, 1));
            }else if (stack.getMetadata() == 4) {
                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 300, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2400, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 2400, 1));
            } else if (stack.getMetadata() == 5){
                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1200, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 2));
                player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 6000, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 3));
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 6000, 2));
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 6000, 3));
                player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 6000, 1));
            }
        }
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.EAT;
    }

    /**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (playerIn.canEat(this.alwaysEdible))
        {
            playerIn.setActiveHand(handIn);
            return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
        }
        else
        {
            return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
        }
    }

    public int getHealAmount(ItemStack stack)
    {
        return this.healAmount;
    }

    public float getSaturationModifier(ItemStack stack)
    {
        return this.saturationModifier;
    }

    /**
     * Whether wolves like this food (true for raw and cooked porkchop).
     */
    public boolean isWolfsFavoriteMeat()
    {
        return this.isWolfsFavoriteMeat;
    }


    /**
     * Set the field 'alwaysEdible' to true, and make the food edible even if the player don't need to eat.
     */
    public ItemAppleBase setAlwaysEdible()
    {
        this.alwaysEdible = true;
        return this;
    }
}
