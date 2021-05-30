package net.shylex.firstmod.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import net.shylex.firstmod.FirstMod;
import net.shylex.firstmod.setup.ModBlocks;
import net.shylex.firstmod.setup.ModTags;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper){
        super(generatorIn, FirstMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(){
        tag(ModTags.Blocks.ORES_JIZZ).add(ModBlocks.JIZZ_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_JIZZ);
        tag(ModTags.Blocks.STORAGE_BLOCKS_CUM).add(ModBlocks.CUM_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_CUM);

    }
}
