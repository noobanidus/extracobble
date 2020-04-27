package noobanidus.mods.extracobble.init;

import com.tterrag.registrate.util.RegistryEntry;
import net.minecraft.block.Block;
import net.minecraft.block.GravelBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

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

  public static RegistryEntry<Block> ANDESITE_COBBLE = REGISTRATE.block("andesite_cobble", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.ANDESITE_COBBLE))
      .tag(Tags.Items.COBBLESTONE)
      .build()
      .recipe((ctx, p) -> CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ctx.getEntry()), Items.ANDESITE, 0.125f, 200).addCriterion("has_cobble", p.hasItem(ModBlocks.ANDESITE_COBBLE.get())).build(p, "extracobble:andesite_from_andesite_cobble"))
      .tag(Tags.Blocks.COBBLESTONE)
      .register();

  public static RegistryEntry<GravelBlock> ANDESITE_GRAVEL = REGISTRATE.block("andesite_gravel", GravelBlock::new)
      .properties(o -> o.hardnessAndResistance(0.6f).sound(SoundType.GROUND))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.ANDESITE_GRAVEL))
      .tag(Tags.Items.GRAVEL)
      .build()
      .tag(Tags.Blocks.GRAVEL)
      .register();

  public static RegistryEntry<SandBlock> ANDESITE_SAND = REGISTRATE.block("andesite_sand", Material.SAND, (b) -> new SandBlock(0x888780, b))
      .properties(o -> o.sound(SoundType.SAND).hardnessAndResistance(0.5f))
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

  public static RegistryEntry<Block> GRANITE_COBBLE = REGISTRATE.block("granite_cobble", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.GRANITE_COBBLE))
      .tag(Tags.Items.COBBLESTONE)
      .build()
      .recipe((ctx, p) -> CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ctx.getEntry()), Items.GRANITE, 0.125f, 200).addCriterion("has_cobble", p.hasItem(ModBlocks.GRANITE_COBBLE.get())).build(p, "extracobble:granite_from_granite_cobble"))
      .tag(Tags.Blocks.COBBLESTONE)
      .register();

  public static RegistryEntry<GravelBlock> GRANITE_GRAVEL = REGISTRATE.block("granite_gravel", GravelBlock::new)
      .properties(o -> o.hardnessAndResistance(0.6f).sound(SoundType.GROUND))
      .item()
      .tag(Tags.Items.GRAVEL)
      .model((ctx, p) -> p.blockItem(ModBlocks.GRANITE_GRAVEL))
      .build()
      .tag(Tags.Blocks.GRAVEL)
      .register();

  public static RegistryEntry<SandBlock> GRANITE_SAND = REGISTRATE.block("granite_sand", Material.SAND, (b) -> new SandBlock(0x936c59, b))
      .properties(o -> o.sound(SoundType.SAND).hardnessAndResistance(0.5f))
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

  public static RegistryEntry<Block> DIORITE_COBBLE = REGISTRATE.block("diorite_cobble", Block::new)
      .properties(o -> o.hardnessAndResistance(2.0F, 6.0F))
      .item()
      .model((ctx, p) -> p.blockItem(ModBlocks.DIORITE_COBBLE))
      .tag(Tags.Items.COBBLESTONE)
      .build()
      .tag(Tags.Blocks.COBBLESTONE)
      .recipe((ctx, p) -> CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ctx.getEntry()), Items.DIORITE, 0.125f, 200).addCriterion("has_cobble", p.hasItem(ModBlocks.DIORITE_COBBLE.get())).build(p, "extracobble:diorite_from_diorite_cobble"))
      .register();

  public static RegistryEntry<GravelBlock> DIORITE_GRAVEL = REGISTRATE.block("diorite_gravel", GravelBlock::new)
      .properties(o -> o.hardnessAndResistance(0.6f).sound(SoundType.GROUND))
      .item()
      .tag(Tags.Items.GRAVEL)
      .model((ctx, p) -> p.blockItem(ModBlocks.DIORITE_GRAVEL))
      .build()
      .tag(Tags.Blocks.GRAVEL)
      .register();

  public static RegistryEntry<SandBlock> DIORITE_SAND = REGISTRATE.block("diorite_sand", Material.SAND, (b) -> new SandBlock(0xafada5, b))
      .properties(o -> o.sound(SoundType.SAND).hardnessAndResistance(0.5f))
      .item()
      .tag(Tags.Items.SAND)
      .model((ctx, p) -> p.blockItem(ModBlocks.DIORITE_SAND))
      .build()
      .tag(Tags.Blocks.SAND)
      .register();

  static {
    REGISTRATE.addRawLang("itemGroup.extracobble", "Extra Cobble");
  }

  public static void load() {
  }
}
