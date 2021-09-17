package afraidmonster.metaldecorations;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class metaldecorations implements ModInitializer {

	public static final String MOD_ID = "metaldecorations";

	public static final ItemGroup METAL_DOORS = FabricItemGroupBuilder.create(
            new Identifier("metaldecorations", "metal_decorations"))
            .icon(() -> new ItemStack(metaldecorations.GOLD_STAIRS)) 
            .build();
	
	
	public static final Block IRON_STAIRS = new CustomStairBlock(Blocks.IRON_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.IRON_BLOCK));
	public static final Block GOLD_STAIRS = new CustomStairBlock(Blocks.GOLD_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.GOLD_BLOCK));
	public static final Block LAPIS_STAIRS = new CustomStairBlock(Blocks.LAPIS_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.LAPIS_BLOCK));
	public static final Block DIAMOND_STAIRS = new CustomStairBlock(Blocks.DIAMOND_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK));
	public static final Block NETHERITE_STAIRS = new CustomStairBlock(Blocks.NETHERITE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK));
	public static final Block EMERALD_STAIRS = new CustomStairBlock(Blocks.EMERALD_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.EMERALD_BLOCK));
	public static final Block COAL_STAIRS = new CustomStairBlock(Blocks.COAL_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.COAL_BLOCK));
	public static final Block REDSTONE_STAIRS = new CustomStairBlock(Blocks.REDSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK));
	public static final Block COPPER_STAIRS = new CustomStairBlock(Blocks.COPPER_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.COPPER_BLOCK));

	public static final Block IRON_SLAB = new CustomSlabBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK));
	public static final Block GOLD_SLAB = new CustomSlabBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK));
	public static final Block LAPIS_SLAB = new CustomSlabBlock(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK));
	public static final Block DIAMOND_SLAB = new CustomSlabBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK));
	public static final Block NETHERITE_SLAB = new CustomSlabBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK));
	public static final Block EMERALD_SLAB = new CustomSlabBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK));
	public static final Block COAL_SLAB = new CustomSlabBlock(FabricBlockSettings.copy(Blocks.COAL_BLOCK));
	public static final Block REDSTONE_SLAB = new CustomSlabBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK));
	public static final Block COPPER_SLAB = new CustomSlabBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK));
	
	



	
	
	
	@Override
	public void onInitialize() {
		

										
		
		
		
		
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "iron_stairs"), IRON_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "iron_stairs"), new BlockItem(IRON_STAIRS, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "gold_stairs"), GOLD_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "gold_stairs"), new BlockItem(GOLD_STAIRS, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "lapis_stairs"), LAPIS_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "lapis_stairs"), new BlockItem(LAPIS_STAIRS, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "copper_stairs"), COPPER_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "copper_stairs"), new BlockItem(COPPER_STAIRS, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "diamond_stairs"), DIAMOND_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "diamond_stairs"), new BlockItem(DIAMOND_STAIRS, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "netherite_stairs"), NETHERITE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "netherite_stairs"), new BlockItem(NETHERITE_STAIRS, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "emerald_stairs"), EMERALD_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "emerald_stairs"), new BlockItem(EMERALD_STAIRS, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "redstone_stairs"), REDSTONE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "redstone_stairs"), new BlockItem(REDSTONE_STAIRS, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "coal_stairs"), COAL_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "coal_stairs"), new BlockItem(COAL_STAIRS, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		
		

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "iron_slab"), IRON_SLAB);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "iron_slab"), new BlockItem(IRON_SLAB, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "gold_slab"), GOLD_SLAB);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "gold_slab"), new BlockItem(GOLD_SLAB, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "lapis_slab"), LAPIS_SLAB);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "lapis_slab"), new BlockItem(LAPIS_SLAB, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "copper_slab"), COPPER_SLAB);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "copper_slab"), new BlockItem(COPPER_SLAB, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "diamond_slab"), DIAMOND_SLAB);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "diamond_slab"), new BlockItem(DIAMOND_SLAB, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "netherite_slab"), NETHERITE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "netherite_slab"), new BlockItem(NETHERITE_SLAB, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "emerald_slab"), EMERALD_SLAB);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "emerald_slab"), new BlockItem(EMERALD_SLAB, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "redstone_slab"), REDSTONE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "redstone_slab"), new BlockItem(REDSTONE_SLAB, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "coal_slab"), COAL_SLAB);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "coal_slab"), new BlockItem(COAL_SLAB, new Item.Settings().group(metaldecorations.METAL_DOORS)));
	}

	}

