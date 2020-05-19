package noobanidus.mods.extracobble.init;

import com.tterrag.registrate.util.DataIngredient;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.ToolType;

import static noobanidus.mods.extracobble.ExtraCobble.REGISTRATE;

public class ModBlocks {
  public static RegistryEntry<Block> MOSSY_ANDESITE_COBBLE = REGISTRATE.block("mossy_andesite_cobble", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.MOSSY_ANDESITE_COBBLE))
      .tag(Tags.Items.COBBLESTONE)
      .build()
      .recipe((ctx, p) -> CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ctx.getEntry()), Items.ANDESITE, 0.125f, 200).addCriterion("has_cobble", p.hasItem(ModBlocks.MOSSY_ANDESITE_COBBLE.get())).build(p, "extracobble:andesite_from_mossy_andesite_cobble"))
      .tag(Tags.Blocks.COBBLESTONE)
      .register();

  public static RegistryEntry<StairsBlock> MOSSY_ANDESITE_COBBLE_STAIRS = REGISTRATE.block("mossy_andesite_cobble_stairs", (b) -> new StairsBlock(() -> MOSSY_ANDESITE_COBBLE.get().getDefaultState(), b))
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.stairsBlock(ctx.getEntry(), p.blockTexture(ModBlocks.MOSSY_ANDESITE_COBBLE.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.MOSSY_ANDESITE_COBBLE_STAIRS))
      .tag(ItemTags.STAIRS)
      .build()
      .tag(BlockTags.STAIRS)
      .recipe((ctx, p) -> p.stairs(DataIngredient.items(ModBlocks.MOSSY_ANDESITE_COBBLE.get()), ctx::getEntry, "stairs", true))
      .register();

  public static RegistryEntry<SlabBlock> MOSSY_ANDESITE_COBBLE_SLAB = REGISTRATE.block("mossy_andesite_cobble_slab", SlabBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.slabBlock(ctx.getEntry(), ModBlocks.MOSSY_ANDESITE_COBBLE.getId(), p.blockTexture(ModBlocks.MOSSY_ANDESITE_COBBLE.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.MOSSY_ANDESITE_COBBLE_SLAB))
      .tag(ItemTags.SLABS)
      .build()
      .tag(BlockTags.SLABS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.MOSSY_ANDESITE_COBBLE.get()), ctx::getEntry, "slabs", true))
      .register();

  public static RegistryEntry<WallBlock> MOSSY_ANDESITE_COBBLE_WALL = REGISTRATE.block("mossy_andesite_cobble_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(ModBlocks.MOSSY_ANDESITE_COBBLE.get()));
        p.wallInventory(ctx.getName() + "_inventory", p.blockTexture(ModBlocks.MOSSY_ANDESITE_COBBLE.get()));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.MOSSY_ANDESITE_COBBLE_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.MOSSY_ANDESITE_COBBLE.get()), ctx::getEntry, "walls", true))
      .register();

  public static RegistryEntry<Block> ANDESITE_COBBLE = REGISTRATE.block("andesite_cobble", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.ANDESITE_COBBLE))
      .tag(Tags.Items.COBBLESTONE)
      .build()
      .recipe((ctx, p) -> CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ctx.getEntry()), Items.ANDESITE, 0.125f, 200).addCriterion("has_cobble", p.hasItem(ModBlocks.ANDESITE_COBBLE.get())).build(p, "extracobble:andesite_from_andesite_cobble"))
      .tag(Tags.Blocks.COBBLESTONE)
      .register();

  public static RegistryEntry<StairsBlock> ANDESITE_COBBLE_STAIRS = REGISTRATE.block("andesite_cobble_stairs", (b) -> new StairsBlock(() -> ANDESITE_COBBLE.get().getDefaultState(), b))
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.stairsBlock(ctx.getEntry(), p.blockTexture(ModBlocks.ANDESITE_COBBLE.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.ANDESITE_COBBLE_STAIRS))
      .tag(ItemTags.STAIRS)
      .build()
      .tag(BlockTags.STAIRS)
      .recipe((ctx, p) -> p.stairs(DataIngredient.items(ModBlocks.ANDESITE_COBBLE.get()), ctx::getEntry, "stairs", true))
      .register();

  public static RegistryEntry<SlabBlock> ANDESITE_COBBLE_SLAB = REGISTRATE.block("andesite_cobble_slab", SlabBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.slabBlock(ctx.getEntry(), ModBlocks.ANDESITE_COBBLE.getId(), p.blockTexture(ModBlocks.ANDESITE_COBBLE.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.ANDESITE_COBBLE_SLAB))
      .tag(ItemTags.SLABS)
      .build()
      .tag(BlockTags.SLABS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.ANDESITE_COBBLE.get()), ctx::getEntry, "slabs", true))
      .register();

  public static RegistryEntry<WallBlock> ANDESITE_COBBLE_WALL = REGISTRATE.block("andesite_cobble_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(ModBlocks.ANDESITE_COBBLE.get()));
        p.wallInventory(ctx.getName() + "_inventory", p.blockTexture(ModBlocks.ANDESITE_COBBLE.get()));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.ANDESITE_COBBLE_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.ANDESITE_COBBLE.get()), ctx::getEntry, "walls", true))
      .register();

  public static RegistryEntry<GravelBlock> ANDESITE_GRAVEL = REGISTRATE.block("andesite_gravel", GravelBlock::new)
      .properties(o -> o.hardnessAndResistance(0.6f).sound(SoundType.GROUND).harvestTool(ToolType.SHOVEL))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.ANDESITE_GRAVEL))
      .tag(Tags.Items.GRAVEL)
      .build()
      .tag(Tags.Blocks.GRAVEL)
      .register();

  public static RegistryEntry<SandBlock> ANDESITE_SAND = REGISTRATE.block("andesite_sand", Material.SAND, (b) -> new SandBlock(0x888780, b))
      .properties(o -> o.sound(SoundType.SAND).hardnessAndResistance(0.5f).harvestTool(ToolType.SHOVEL))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.ANDESITE_SAND))
      .tag(Tags.Items.SAND)
      .build()
      .tag(Tags.Blocks.SAND)
      .register();

  public static RegistryEntry<Block> MOSSY_GRANITE_COBBLE = REGISTRATE.block("mossy_granite_cobble", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.MOSSY_GRANITE_COBBLE))
      .tag(Tags.Items.COBBLESTONE)
      .build()
      .recipe((ctx, p) -> CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ctx.getEntry()), Items.GRANITE, 0.125f, 200).addCriterion("has_cobble", p.hasItem(ModBlocks.MOSSY_GRANITE_COBBLE.get())).build(p, "extracobble:granite_from_mossy_granite_cobble"))
      .tag(Tags.Blocks.COBBLESTONE)
      .register();

  public static RegistryEntry<StairsBlock> MOSSY_GRANITE_COBBLE_STAIRS = REGISTRATE.block("mossy_granite_cobble_stairs", (b) -> new StairsBlock(() -> MOSSY_GRANITE_COBBLE.get().getDefaultState(), b))
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.stairsBlock(ctx.getEntry(), p.blockTexture(ModBlocks.MOSSY_GRANITE_COBBLE.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.MOSSY_GRANITE_COBBLE_STAIRS))
      .tag(ItemTags.STAIRS)
      .build()
      .tag(BlockTags.STAIRS)
      .recipe((ctx, p) -> p.stairs(DataIngredient.items(ModBlocks.MOSSY_GRANITE_COBBLE.get()), ctx::getEntry, "stairs", true))
      .register();

  public static RegistryEntry<SlabBlock> MOSSY_GRANITE_COBBLE_SLAB = REGISTRATE.block("mossy_granite_cobble_slab", SlabBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.slabBlock(ctx.getEntry(), ModBlocks.MOSSY_GRANITE_COBBLE.getId(), p.blockTexture(ModBlocks.MOSSY_GRANITE_COBBLE.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.MOSSY_GRANITE_COBBLE_SLAB))
      .tag(ItemTags.SLABS)
      .build()
      .tag(BlockTags.SLABS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.MOSSY_GRANITE_COBBLE.get()), ctx::getEntry, "slabs", true))
      .register();

  public static RegistryEntry<WallBlock> MOSSY_GRANITE_COBBLE_WALL = REGISTRATE.block("mossy_granite_cobble_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(ModBlocks.MOSSY_GRANITE_COBBLE.get()));
        p.wallInventory(ctx.getName() + "_inventory", p.blockTexture(ModBlocks.MOSSY_GRANITE_COBBLE.get()));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.MOSSY_GRANITE_COBBLE_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.MOSSY_GRANITE_COBBLE.get()), ctx::getEntry, "walls", true))
      .register();

  public static RegistryEntry<Block> GRANITE_COBBLE = REGISTRATE.block("granite_cobble", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.GRANITE_COBBLE))
      .tag(Tags.Items.COBBLESTONE)
      .build()
      .recipe((ctx, p) -> CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ctx.getEntry()), Items.GRANITE, 0.125f, 200).addCriterion("has_cobble", p.hasItem(ModBlocks.GRANITE_COBBLE.get())).build(p, "extracobble:granite_from_granite_cobble"))
      .tag(Tags.Blocks.COBBLESTONE)
      .register();


  public static RegistryEntry<StairsBlock> GRANITE_COBBLE_STAIRS = REGISTRATE.block("granite_cobble_stairs", (b) -> new StairsBlock(() -> GRANITE_COBBLE.get().getDefaultState(), b))
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.stairsBlock(ctx.getEntry(), p.blockTexture(ModBlocks.GRANITE_COBBLE.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.GRANITE_COBBLE_STAIRS))
      .tag(ItemTags.STAIRS)
      .build()
      .tag(BlockTags.STAIRS)
      .recipe((ctx, p) -> p.stairs(DataIngredient.items(ModBlocks.GRANITE_COBBLE.get()), ctx::getEntry, "stairs", true))
      .register();

  public static RegistryEntry<SlabBlock> GRANITE_COBBLE_SLAB = REGISTRATE.block("granite_cobble_slab", SlabBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.slabBlock(ctx.getEntry(), ModBlocks.GRANITE_COBBLE.getId(), p.blockTexture(ModBlocks.GRANITE_COBBLE.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.GRANITE_COBBLE_SLAB))
      .tag(ItemTags.SLABS)
      .build()
      .tag(BlockTags.SLABS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.GRANITE_COBBLE.get()), ctx::getEntry, "slabs", true))
      .register();

  public static RegistryEntry<WallBlock> GRANITE_COBBLE_WALL = REGISTRATE.block("granite_cobble_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(ModBlocks.GRANITE_COBBLE.get()));
        p.wallInventory(ctx.getName() + "_inventory", p.blockTexture(ModBlocks.GRANITE_COBBLE.get()));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.GRANITE_COBBLE_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.GRANITE_COBBLE.get()), ctx::getEntry, "walls", true))
      .register();

  public static RegistryEntry<GravelBlock> GRANITE_GRAVEL = REGISTRATE.block("granite_gravel", GravelBlock::new)
      .properties(o -> o.hardnessAndResistance(0.6f).sound(SoundType.GROUND).harvestTool(ToolType.SHOVEL))
      .item()
      .tag(Tags.Items.GRAVEL)
      .model((ctx, p) -> p.blockItem(ModBlocks.GRANITE_GRAVEL))
      .build()
      .tag(Tags.Blocks.GRAVEL)
      .register();

  public static RegistryEntry<SandBlock> GRANITE_SAND = REGISTRATE.block("granite_sand", Material.SAND, (b) -> new SandBlock(0x936c59, b))
      .properties(o -> o.sound(SoundType.SAND).hardnessAndResistance(0.5f).harvestTool(ToolType.SHOVEL))
      .item()
      .tag(Tags.Items.SAND)
      .model((ctx, p) -> p.blockItem(ModBlocks.GRANITE_SAND))
      .build()
      .tag(Tags.Blocks.SAND)
      .register();

  public static RegistryEntry<Block> MOSSY_DIORITE_COBBLE = REGISTRATE.block("mossy_diorite_cobble", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.MOSSY_DIORITE_COBBLE))
      .tag(Tags.Items.COBBLESTONE)
      .build()
      .recipe((ctx, p) -> CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ctx.getEntry()), Items.DIORITE, 0.125f, 200).addCriterion("has_cobble", p.hasItem(ModBlocks.MOSSY_DIORITE_COBBLE.get())).build(p, "extracobble:diorite_from_mossy_diorite_cobble"))
      .tag(Tags.Blocks.COBBLESTONE)
      .register();

  public static RegistryEntry<StairsBlock> MOSSY_DIORITE_COBBLE_STAIRS = REGISTRATE.block("mossy_diorite_cobble_stairs", (b) -> new StairsBlock(() -> MOSSY_DIORITE_COBBLE.get().getDefaultState(), b))
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.stairsBlock(ctx.getEntry(), p.blockTexture(ModBlocks.MOSSY_DIORITE_COBBLE.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.MOSSY_DIORITE_COBBLE_STAIRS))
      .tag(ItemTags.STAIRS)
      .build()
      .tag(BlockTags.STAIRS)
      .recipe((ctx, p) -> p.stairs(DataIngredient.items(ModBlocks.MOSSY_DIORITE_COBBLE.get()), ctx::getEntry, "stairs", true))
      .register();

  public static RegistryEntry<SlabBlock> MOSSY_DIORITE_COBBLE_SLAB = REGISTRATE.block("mossy_diorite_cobble_slab", SlabBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.slabBlock(ctx.getEntry(), ModBlocks.MOSSY_DIORITE_COBBLE.getId(), p.blockTexture(ModBlocks.MOSSY_DIORITE_COBBLE.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.MOSSY_DIORITE_COBBLE_SLAB))
      .tag(ItemTags.SLABS)
      .build()
      .tag(BlockTags.SLABS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.MOSSY_DIORITE_COBBLE.get()), ctx::getEntry, "slabs", true))
      .register();

  public static RegistryEntry<WallBlock> MOSSY_DIORITE_COBBLE_WALL = REGISTRATE.block("mossy_diorite_cobble_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(ModBlocks.MOSSY_DIORITE_COBBLE.get()));
        p.wallInventory(ctx.getName() + "_inventory", p.blockTexture(ModBlocks.MOSSY_DIORITE_COBBLE.get()));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.MOSSY_DIORITE_COBBLE_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.MOSSY_DIORITE_COBBLE.get()), ctx::getEntry, "walls", true))
      .register();

  public static RegistryEntry<Block> DIORITE_COBBLE = REGISTRATE.block("diorite_cobble", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.DIORITE_COBBLE))
      .tag(Tags.Items.COBBLESTONE)
      .build()
      .tag(Tags.Blocks.COBBLESTONE)
      .recipe((ctx, p) -> CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ctx.getEntry()), Items.DIORITE, 0.125f, 200).addCriterion("has_cobble", p.hasItem(ModBlocks.DIORITE_COBBLE.get())).build(p, "extracobble:diorite_from_diorite_cobble"))
      .register();

  public static RegistryEntry<StairsBlock> DIORITE_COBBLE_STAIRS = REGISTRATE.block("diorite_cobble_stairs", (b) -> new StairsBlock(() -> DIORITE_COBBLE.get().getDefaultState(), b))
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.stairsBlock(ctx.getEntry(), p.blockTexture(ModBlocks.DIORITE_COBBLE.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.DIORITE_COBBLE_STAIRS))
      .tag(ItemTags.STAIRS)
      .build()
      .tag(BlockTags.STAIRS)
      .recipe((ctx, p) -> p.stairs(DataIngredient.items(ModBlocks.DIORITE_COBBLE.get()), ctx::getEntry, "stairs", true))
      .register();

  public static RegistryEntry<SlabBlock> DIORITE_COBBLE_SLAB = REGISTRATE.block("diorite_cobble_slab", SlabBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.slabBlock(ctx.getEntry(), ModBlocks.DIORITE_COBBLE.getId(), p.blockTexture(ModBlocks.DIORITE_COBBLE.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.DIORITE_COBBLE_SLAB))
      .tag(ItemTags.SLABS)
      .build()
      .tag(BlockTags.SLABS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.DIORITE_COBBLE.get()), ctx::getEntry, "slabs", true))
      .register();

  public static RegistryEntry<WallBlock> DIORITE_COBBLE_WALL = REGISTRATE.block("diorite_cobble_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(ModBlocks.DIORITE_COBBLE.get()));
        p.wallInventory(ctx.getName() + "_inventory", p.blockTexture(ModBlocks.DIORITE_COBBLE.get()));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.DIORITE_COBBLE_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.DIORITE_COBBLE.get()), ctx::getEntry, "walls", true))
      .register();

  public static RegistryEntry<GravelBlock> DIORITE_GRAVEL = REGISTRATE.block("diorite_gravel", GravelBlock::new)
      .properties(o -> o.hardnessAndResistance(0.6f).sound(SoundType.GROUND).harvestTool(ToolType.SHOVEL))
      .item()
      .tag(Tags.Items.GRAVEL)
      .model((ctx, p) -> p.blockItem(ModBlocks.DIORITE_GRAVEL))
      .build()
      .tag(Tags.Blocks.GRAVEL)
      .register();

  public static RegistryEntry<SandBlock> DIORITE_SAND = REGISTRATE.block("diorite_sand", Material.SAND, (b) -> new SandBlock(0xafada5, b))
      .properties(o -> o.sound(SoundType.SAND).hardnessAndResistance(0.5f).harvestTool(ToolType.SHOVEL))
      .item()
      .tag(Tags.Items.SAND)
      .model((ctx, p) -> p.blockItem(ModBlocks.DIORITE_SAND))
      .build()
      .tag(Tags.Blocks.SAND)
      .register();

  public static RegistryEntry<SandBlock> STONE_SAND = REGISTRATE.block("stone_sand", Material.SAND, (b) -> new SandBlock(0x737270, b))
      .properties(o -> o.sound(SoundType.SAND).hardnessAndResistance(0.5f).harvestTool(ToolType.SHOVEL))
      .item()
      .tag(Tags.Items.SAND)
      .model((ctx, p) -> p.blockItem(ModBlocks.STONE_SAND))
      .build()
      .tag(Tags.Blocks.SAND)
      .register();

  // Additional Vanilla Blocks
  public static RegistryEntry<StairsBlock> CRACKED_STONE_BRICK_STAIRS = REGISTRATE.block("cracked_stone_brick_stairs", (b) -> new StairsBlock(Blocks.CRACKED_STONE_BRICKS::getDefaultState, b))
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.stairsBlock(ctx.getEntry(), p.blockTexture(Blocks.CRACKED_STONE_BRICKS)))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.CRACKED_STONE_BRICK_STAIRS))
      .tag(ItemTags.STAIRS)
      .build()
      .tag(BlockTags.STAIRS)
      .recipe((ctx, p) -> p.stairs(DataIngredient.items(Blocks.CRACKED_STONE_BRICKS), ctx::getEntry, "stairs", true))
      .register();

  public static RegistryEntry<SlabBlock> CRACKED_STONE_BRICK_SLAB = REGISTRATE.block("cracked_stone_brick_slab", SlabBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.slabBlock(ctx.getEntry(), Blocks.CRACKED_STONE_BRICKS.getRegistryName(), p.blockTexture(Blocks.CRACKED_STONE_BRICKS)))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.CRACKED_STONE_BRICK_SLAB))
      .tag(ItemTags.SLABS)
      .build()
      .tag(BlockTags.SLABS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(Blocks.CRACKED_STONE_BRICKS), ctx::getEntry, "slabs", true))
      .register();

  public static RegistryEntry<WallBlock> CRACKED_STONE_BRICK_WALL = REGISTRATE.block("cracked_stone_brick_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(Blocks.CRACKED_STONE_BRICKS));
        p.models().wallInventory(ctx.getName() + "_inventory", p.blockTexture(Blocks.CRACKED_STONE_BRICKS));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.CRACKED_STONE_BRICK_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(Blocks.CRACKED_STONE_BRICKS), ctx::getEntry, "walls", true))
      .register();

  public static RegistryEntry<WallBlock> POLISHED_DIORITE_WALL = REGISTRATE.block("polished_diorite_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(Blocks.POLISHED_DIORITE));
        p.models().wallInventory(ctx.getName() + "_inventory", p.blockTexture(Blocks.POLISHED_DIORITE));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.POLISHED_DIORITE_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(Blocks.POLISHED_DIORITE), ctx::getEntry, "walls", true))
      .register();

  public static RegistryEntry<WallBlock> POLISHED_GRANITE_WALL = REGISTRATE.block("polished_granite_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(Blocks.POLISHED_GRANITE));
        p.models().wallInventory(ctx.getName() + "_inventory", p.blockTexture(Blocks.POLISHED_GRANITE));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.POLISHED_GRANITE_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(Blocks.POLISHED_GRANITE), ctx::getEntry, "walls", true))
      .register();

  public static RegistryEntry<WallBlock> POLISHED_ANDESITE_WALL = REGISTRATE.block("polished_andesite_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(Blocks.POLISHED_ANDESITE));
        p.models().wallInventory(ctx.getName() + "_inventory", p.blockTexture(Blocks.POLISHED_ANDESITE));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.POLISHED_ANDESITE_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(Blocks.POLISHED_ANDESITE), ctx::getEntry, "walls", true))
      .register();

  // Extra bricks

  public static RegistryEntry<Block> DIORITE_BRICKS = REGISTRATE.block("diorite_bricks", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.DIORITE_BRICKS))
      .build()
      .recipe((ctx, p) -> p.square(DataIngredient.items(Blocks.POLISHED_DIORITE), ctx::getEntry, true))
      .register();

  public static RegistryEntry<StairsBlock> DIORITE_BRICK_STAIRS = REGISTRATE.block("diorite_brick_stairs", (b) -> new StairsBlock(() -> DIORITE_BRICKS.get().getDefaultState(), b))
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.stairsBlock(ctx.getEntry(), p.blockTexture(ModBlocks.DIORITE_BRICKS.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.DIORITE_BRICK_STAIRS))
      .tag(ItemTags.STAIRS)
      .build()
      .tag(BlockTags.STAIRS)
      .recipe((ctx, p) -> p.stairs(DataIngredient.items(ModBlocks.DIORITE_BRICKS.get()), ctx::getEntry, "stairs", true))
      .register();

  public static RegistryEntry<SlabBlock> DIORITE_BRICK_SLAB = REGISTRATE.block("diorite_brick_slab", SlabBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.slabBlock(ctx.getEntry(), ModBlocks.DIORITE_BRICKS.getId(), p.blockTexture(ModBlocks.DIORITE_BRICKS.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.DIORITE_BRICK_SLAB))
      .tag(ItemTags.SLABS)
      .build()
      .tag(BlockTags.SLABS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.DIORITE_BRICKS.get()), ctx::getEntry, "slabs", true))
      .register();

  public static RegistryEntry<WallBlock> DIORITE_BRICK_WALL = REGISTRATE.block("diorite_brick_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(ModBlocks.DIORITE_BRICKS.get()));
        p.models().wallInventory(ctx.getName() + "_inventory", p.blockTexture(ModBlocks.DIORITE_BRICKS.get()));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.DIORITE_BRICK_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.DIORITE_BRICKS.get()), ctx::getEntry, "walls", true))
      .register();

  public static RegistryEntry<Block> CHISELED_DIORITE_BRICKS = REGISTRATE.block("chiseled_diorite_bricks", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.CHISELED_DIORITE_BRICKS))
      .build()
      .recipe((ctx, p) -> p.square(DataIngredient.items(ModBlocks.CHISELED_DIORITE_BRICKS.get()), ctx::getEntry, true))
      .register();

  public static RegistryEntry<Block> ANDESITE_BRICKS = REGISTRATE.block("andesite_bricks", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.ANDESITE_BRICKS))
      .build()
      .recipe((ctx, p) -> p.square(DataIngredient.items(Blocks.POLISHED_ANDESITE), ctx::getEntry, true))
      .register();

  public static RegistryEntry<StairsBlock> ANDESITE_BRICK_STAIRS = REGISTRATE.block("andesite_brick_stairs", (b) -> new StairsBlock(() -> ANDESITE_BRICKS.get().getDefaultState(), b))
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.stairsBlock(ctx.getEntry(), p.blockTexture(ModBlocks.ANDESITE_BRICKS.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.ANDESITE_BRICK_STAIRS))
      .tag(ItemTags.STAIRS)
      .build()
      .tag(BlockTags.STAIRS)
      .recipe((ctx, p) -> p.stairs(DataIngredient.items(ModBlocks.ANDESITE_BRICKS.get()), ctx::getEntry, "stairs", true))
      .register();

  public static RegistryEntry<SlabBlock> ANDESITE_BRICK_SLAB = REGISTRATE.block("andesite_brick_slab", SlabBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.slabBlock(ctx.getEntry(), ModBlocks.ANDESITE_BRICKS.getId(), p.blockTexture(ModBlocks.ANDESITE_BRICKS.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.ANDESITE_BRICK_SLAB))
      .tag(ItemTags.SLABS)
      .build()
      .tag(BlockTags.SLABS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.ANDESITE_BRICKS.get()), ctx::getEntry, "slabs", true))
      .register();

  public static RegistryEntry<WallBlock> ANDESITE_BRICK_WALL = REGISTRATE.block("andesite_brick_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(ModBlocks.ANDESITE_BRICKS.get()));
        p.models().wallInventory(ctx.getName() + "_inventory", p.blockTexture(ModBlocks.ANDESITE_BRICKS.get()));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.ANDESITE_BRICK_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.ANDESITE_BRICKS.get()), ctx::getEntry, "walls", true))
      .register();

  public static RegistryEntry<Block> CHISELED_ANDESITE_BRICKS = REGISTRATE.block("chiseled_andesite_bricks", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.CHISELED_ANDESITE_BRICKS))
      .build()
      .recipe((ctx, p) -> p.square(DataIngredient.items(ModBlocks.CHISELED_ANDESITE_BRICKS.get()), ctx::getEntry, true))
      .register();

  public static RegistryEntry<Block> GRANITE_BRICKS = REGISTRATE.block("granite_bricks", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.GRANITE_BRICKS))
      .build()
      .recipe((ctx, p) -> p.square(DataIngredient.items(Blocks.POLISHED_GRANITE), ctx::getEntry, true))
      .register();

  public static RegistryEntry<StairsBlock> GRANITE_BRICK_STAIRS = REGISTRATE.block("granite_brick_stairs", (b) -> new StairsBlock(() -> GRANITE_BRICKS.get().getDefaultState(), b))
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.stairsBlock(ctx.getEntry(), p.blockTexture(ModBlocks.GRANITE_BRICKS.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.GRANITE_BRICK_STAIRS))
      .tag(ItemTags.STAIRS)
      .build()
      .tag(BlockTags.STAIRS)
      .recipe((ctx, p) -> p.stairs(DataIngredient.items(ModBlocks.GRANITE_BRICKS.get()), ctx::getEntry, "stairs", true))
      .register();

  public static RegistryEntry<SlabBlock> GRANITE_BRICK_SLAB = REGISTRATE.block("granite_brick_slab", SlabBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> p.slabBlock(ctx.getEntry(), ModBlocks.GRANITE_BRICKS.getId(), p.blockTexture(ModBlocks.GRANITE_BRICKS.get())))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.GRANITE_BRICK_SLAB))
      .tag(ItemTags.SLABS)
      .build()
      .tag(BlockTags.SLABS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.GRANITE_BRICKS.get()), ctx::getEntry, "slabs", true))
      .register();

  public static RegistryEntry<WallBlock> GRANITE_BRICK_WALL = REGISTRATE.block("granite_brick_wall", WallBlock::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .blockstate((ctx, p) -> {
        p.wallBlock(ctx.getEntry(), p.blockTexture(ModBlocks.GRANITE_BRICKS.get()));
        p.models().wallInventory(ctx.getName() + "_inventory", p.blockTexture(ModBlocks.GRANITE_BRICKS.get()));
      })
      .item()
      .model((ctx, p) -> p.blockWithInventoryModel(ModBlocks.GRANITE_BRICK_WALL))
      .tag(ItemTags.WALLS)
      .build()
      .tag(BlockTags.WALLS)
      .recipe((ctx, p) -> p.slab(DataIngredient.items(ModBlocks.GRANITE_BRICKS.get()), ctx::getEntry, "walls", true))
      .register();

  public static RegistryEntry<Block> CHISELED_GRANITE_BRICKS = REGISTRATE.block("chiseled_granite_bricks", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.CHISELED_GRANITE_BRICKS))
      .build()
      .recipe((ctx, p) -> p.square(DataIngredient.items(ModBlocks.CHISELED_GRANITE_BRICKS.get()), ctx::getEntry, true))
      .register();

  static {
    REGISTRATE.addRawLang("itemGroup.extracobble", "Extra Cobble");
  }

  public static void load() {
  }
}
