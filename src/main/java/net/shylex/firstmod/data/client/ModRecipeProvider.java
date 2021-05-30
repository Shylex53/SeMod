package net.shylex.firstmod.data.client;

import net.minecraft.data.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.shylex.firstmod.FirstMod;
import net.shylex.firstmod.setup.ModBlocks;
import net.shylex.firstmod.setup.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator){
        super(generator);
    }

    @Override
    //Turn Storage Block into 9 Jelly
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer){
        ShapelessRecipeBuilder.shapeless(ModItems.CUM_JELLY.get(), 9)
                .requires(ModBlocks.CUM_BLOCK.get())
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer);

        //9 Jelly to Storage Block
        ShapedRecipeBuilder.shaped(ModBlocks.CUM_BLOCK.get())
                .define('#', ModItems.CUM_JELLY.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(ModItems.CUM_JELLY.get()))
                .save(consumer);

        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.JIZZ_ORE.get()), ModItems.CUM_JELLY.get(), 0.7f, 200)
                .unlockedBy("has_item", has(ModBlocks.JIZZ_ORE.get()))
                .save(consumer, modId("cum_jelly_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.JIZZ_ORE.get()), ModItems.CUM_JELLY.get(), 0.7f, 100)
                .unlockedBy("has_item", has(ModBlocks.JIZZ_ORE.get()))
                .save(consumer, modId("cum_jelly_blasting"));

    }

    private static ResourceLocation modId(String path){
        return new ResourceLocation(FirstMod.MOD_ID, path);
    }

}
