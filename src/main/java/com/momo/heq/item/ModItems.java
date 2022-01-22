package com.momo.heq.item;

import com.momo.heq.init.ModCreativeTab;
import com.momo.heq.item.armors.ItemArmorBase;
import com.momo.heq.item.armors.ItemHorseArmor;
import com.momo.heq.item.armors.ModArmorMaterials;
import com.momo.heq.item.bows.ItemBowBase;
import com.momo.heq.item.bows.ItemFastBow;
import com.momo.heq.item.food.ItemAppleBase;
import com.momo.heq.item.shield.ItemShieldBase;
import com.momo.heq.item.tools.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	//tools
	public static final ItemSword EMERALD_SWORD = new ItemSwordBase("emerald_sword", ModToolMaterials.EMERALD, ModCreativeTab.HARDER_COMBAT);
	public static final ItemSpade EMERALD_SHOVEL = new ItemSpadeBase("emerald_shovel", ModToolMaterials.EMERALD, ModCreativeTab.HARDER_TOOL);
	public static final ItemPickaxe EMERALD_PICKAXE = new ItemPickaxeBase("emerald_pickaxe", ModToolMaterials.EMERALD, ModCreativeTab.HARDER_TOOL);
	public static final ItemAxe EMERALD_AXE = new ItemAxeBase("emerald_axe", ModToolMaterials.EMERALD, ModCreativeTab.HARDER_TOOL,6.0F,-3.0F);
	public static final ItemHoe EMERALD_HOE = new ItemHoeBase("emerald_hoe", ModToolMaterials.EMERALD, ModCreativeTab.HARDER_TOOL);

	public static final ItemSword IRON_BLOCK_SWORD = new ItemSwordBase("iron_block_sword", ModToolMaterials.IRON_BLOCK, ModCreativeTab.HARDER_COMBAT);
	public static final ItemSpade IRON_BLOCK_SHOVEL = new ItemSpadeBase("iron_block_shovel", ModToolMaterials.IRON_BLOCK, ModCreativeTab.HARDER_TOOL);
	public static final ItemPickaxe IRON_BLOCK_PICKAXE = new ItemPickaxeBase("iron_block_pickaxe", ModToolMaterials.IRON_BLOCK, ModCreativeTab.HARDER_TOOL);
	public static final ItemAxe IRON_BLOCK_AXE = new ItemAxeBase("iron_block_axe", ModToolMaterials.IRON_BLOCK, ModCreativeTab.HARDER_TOOL,8.0F,-3.1F);
	public static final ItemHoe IRON_BLOCK_HOE = new ItemHoeBase("iron_block_hoe", ModToolMaterials.IRON_BLOCK, ModCreativeTab.HARDER_TOOL);

	public static final ItemSword DIAMOND_BLOCK_SWORD = new ItemSwordBase("diamond_block_sword", ModToolMaterials.DIAMOND_BLOCK, ModCreativeTab.HARDER_COMBAT);
	public static final ItemSpade DIAMOND_BLOCK_SHOVEL = new ItemSpadeBase("diamond_block_shovel", ModToolMaterials.DIAMOND_BLOCK, ModCreativeTab.HARDER_TOOL);
	public static final ItemPickaxe DIAMOND_BLOCK_PICKAXE = new ItemPickaxeBase("diamond_block_pickaxe", ModToolMaterials.DIAMOND_BLOCK, ModCreativeTab.HARDER_TOOL);
	public static final ItemAxe DIAMOND_BLOCK_AXE = new ItemAxeBase("diamond_block_axe", ModToolMaterials.DIAMOND_BLOCK, ModCreativeTab.HARDER_TOOL,8.0F,-3.0F);
	public static final ItemHoe DIAMOND_BLOCK_HOE = new ItemHoeBase("diamond_block_hoe", ModToolMaterials.DIAMOND_BLOCK, ModCreativeTab.HARDER_TOOL);

	public static final ItemSword GOLD_BLOCK_SWORD = new ItemSwordBase("gold_block_sword", ModToolMaterials.GOLD_BLOCK, ModCreativeTab.HARDER_COMBAT);
	public static final ItemSpade GOLD_BLOCK_SHOVEL = new ItemSpadeBase("gold_block_shovel", ModToolMaterials.GOLD_BLOCK, ModCreativeTab.HARDER_TOOL);
	public static final ItemPickaxe GOLD_BLOCK_PICKAXE = new ItemPickaxeBase("gold_block_pickaxe", ModToolMaterials.GOLD_BLOCK, ModCreativeTab.HARDER_TOOL);
	public static final ItemAxe GOLD_BLOCK_AXE = new ItemAxeBase("gold_block_axe", ModToolMaterials.GOLD_BLOCK, ModCreativeTab.HARDER_TOOL,6.0F,-3.0F);
	public static final ItemHoe GOLD_BLOCK_HOE = new ItemHoeBase("gold_block_hoe", ModToolMaterials.GOLD_BLOCK, ModCreativeTab.HARDER_TOOL);

	public static final ItemSword EMERALD_BLOCK_SWORD = new ItemSwordBase("emerald_block_sword", ModToolMaterials.EMERALD_BLOCK, ModCreativeTab.HARDER_COMBAT);
	public static final ItemSpade EMERALD_BLOCK_SHOVEL = new ItemSpadeBase("emerald_block_shovel", ModToolMaterials.EMERALD_BLOCK, ModCreativeTab.HARDER_TOOL);
	public static final ItemPickaxe EMERALD_BLOCK_PICKAXE = new ItemPickaxeBase("emerald_block_pickaxe", ModToolMaterials.EMERALD_BLOCK, ModCreativeTab.HARDER_TOOL);
	public static final ItemAxe EMERALD_BLOCK_AXE = new ItemAxeBase("emerald_block_axe", ModToolMaterials.EMERALD_BLOCK, ModCreativeTab.HARDER_TOOL,6.0F,-3.0F);
	public static final ItemHoe EMERALD_BLOCK_HOE = new ItemHoeBase("emerald_block_hoe", ModToolMaterials.EMERALD_BLOCK, ModCreativeTab.HARDER_TOOL);

	//armor
	public static final Item EMERALD_HELMET = new ItemArmorBase("emerald_helmet", ModArmorMaterials.EMERALD, EntityEquipmentSlot.HEAD).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item EMERALD_CHESTPLATE = new ItemArmorBase("emerald_chestplate", ModArmorMaterials.EMERALD, EntityEquipmentSlot.CHEST).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item EMERALD_LEGGINGS = new ItemArmorBase("emerald_leggings", ModArmorMaterials.EMERALD, EntityEquipmentSlot.LEGS).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item EMERALD_BOOTS = new ItemArmorBase("emerald_boots", ModArmorMaterials.EMERALD, EntityEquipmentSlot.FEET).setCreativeTab(ModCreativeTab.HARDER_COMBAT);

	public static final Item IRON_BLOCK_HELMET = new ItemArmorBase("iron_block_helmet", ModArmorMaterials.IRON_BLOCK, EntityEquipmentSlot.HEAD).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item IRON_BLOCK_CHESTPLATE = new ItemArmorBase("iron_block_chestplate", ModArmorMaterials.IRON_BLOCK, EntityEquipmentSlot.CHEST).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item IRON_BLOCK_LEGGINGS = new ItemArmorBase("iron_block_leggings", ModArmorMaterials.IRON_BLOCK, EntityEquipmentSlot.LEGS).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item IRON_BLOCK_BOOTS = new ItemArmorBase("iron_block_boots", ModArmorMaterials.IRON_BLOCK, EntityEquipmentSlot.FEET).setCreativeTab(ModCreativeTab.HARDER_COMBAT);

	public static final Item DIAMOND_BLOCK_HELMET = new ItemArmorBase("diamond_block_helmet", ModArmorMaterials.DIAMOND_BLOCK, EntityEquipmentSlot.HEAD).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item DIAMOND_BLOCK_CHESTPLATE = new ItemArmorBase("diamond_block_chestplate", ModArmorMaterials.DIAMOND_BLOCK, EntityEquipmentSlot.CHEST).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item DIAMOND_BLOCK_LEGGINGS = new ItemArmorBase("diamond_block_leggings", ModArmorMaterials.DIAMOND_BLOCK, EntityEquipmentSlot.LEGS).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item DIAMOND_BLOCK_BOOTS = new ItemArmorBase("diamond_block_boots", ModArmorMaterials.DIAMOND_BLOCK, EntityEquipmentSlot.FEET).setCreativeTab(ModCreativeTab.HARDER_COMBAT);

	public static final Item GOLD_BLOCK_HELMET = new ItemArmorBase("gold_block_helmet", ModArmorMaterials.GOLD_BLOCK, EntityEquipmentSlot.HEAD).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item GOLD_BLOCK_CHESTPLATE = new ItemArmorBase("gold_block_chestplate", ModArmorMaterials.GOLD_BLOCK, EntityEquipmentSlot.CHEST).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item GOLD_BLOCK_LEGGINGS = new ItemArmorBase("gold_block_leggings", ModArmorMaterials.GOLD_BLOCK, EntityEquipmentSlot.LEGS).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item GOLD_BLOCK_BOOTS = new ItemArmorBase("gold_block_boots", ModArmorMaterials.GOLD_BLOCK, EntityEquipmentSlot.FEET).setCreativeTab(ModCreativeTab.HARDER_COMBAT);

	public static final Item EMERALD_BLOCK_HELMET = new ItemArmorBase("emerald_block_helmet", ModArmorMaterials.EMERALD_BLOCK, EntityEquipmentSlot.HEAD).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item EMERALD_BLOCK_CHESTPLATE = new ItemArmorBase("emerald_block_chestplate", ModArmorMaterials.EMERALD_BLOCK, EntityEquipmentSlot.CHEST).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item EMERALD_BLOCK_LEGGINGS = new ItemArmorBase("emerald_block_leggings", ModArmorMaterials.EMERALD_BLOCK, EntityEquipmentSlot.LEGS).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item EMERALD_BLOCK_BOOTS = new ItemArmorBase("emerald_block_boots", ModArmorMaterials.EMERALD_BLOCK, EntityEquipmentSlot.FEET).setCreativeTab(ModCreativeTab.HARDER_COMBAT);

	//horse armor
	public static final Item EMERALD_HORSE_ARMOR = new ItemHorseArmor("emerald_horse_armor").setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item LEATHER_HORSE_ARMOR = new ItemHorseArmor("leather_horse_armor").setCreativeTab(ModCreativeTab.HARDER_COMBAT);

	//shield
    public static final Item IRON_SHIELD = new ItemShieldBase("iron_shield", 504).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
    public static final Item GOLD_SHIELD = new ItemShieldBase("gold_shield", 756).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
    public static final Item EMERALD_SHIELD = new ItemShieldBase("emerald_shield", 1134).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
    public static final Item DIAMOND_SHIELD = new ItemShieldBase("diamond_shield", 1701).setCreativeTab(ModCreativeTab.HARDER_COMBAT);

	//bow
	public static final Item IRON_BOW = new ItemBowBase("iron_bow", 752).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item DIAMOND_BOW = new ItemFastBow("diamond_bow", 1569, 6.67F).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item GOLD_BOW = new ItemFastBow("gold_bow", 576, 10.0F).setCreativeTab(ModCreativeTab.HARDER_COMBAT);
	public static final Item EMERALD_BOW = new ItemFastBow("emerald_bow", 864, 5.0F).setCreativeTab(ModCreativeTab.HARDER_COMBAT);

    //apple
	public static final Item METAL_APPLE = new ItemAppleBase("metal_apple", 6).setAlwaysEdible().setCreativeTab(ModCreativeTab.HARDER_TOOL);


}
