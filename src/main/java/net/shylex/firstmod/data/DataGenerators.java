package net.shylex.firstmod.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.shylex.firstmod.FirstMod;
import net.shylex.firstmod.data.client.ModBlockStateProvider;
import net.shylex.firstmod.data.client.ModItemModelProvider;
import net.shylex.firstmod.data.client.ModRecipeProvider;

@Mod.EventBusSubscriber(modid=FirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators(){}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        //Generate Block States and Item Models
        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));

        //Generate Tags
        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);
        gen.addProvider(blockTags);
        gen.addProvider(new ModItemTagsProvider(gen, blockTags, existingFileHelper));

        //Generate Loot Tables
        gen.addProvider(new ModLootTableProvider(gen));

        //Generate Recipes
        gen.addProvider(new ModRecipeProvider(gen));

    }
}
