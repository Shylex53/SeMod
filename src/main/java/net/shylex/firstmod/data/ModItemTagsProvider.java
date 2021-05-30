package net.shylex.firstmod.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.shylex.firstmod.FirstMod;
import net.shylex.firstmod.setup.ModItems;
import net.shylex.firstmod.setup.ModTags;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator generatorIn, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper){
     super(generatorIn, blockTagProvider, FirstMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(){
        copy(ModTags.Blocks.ORES_JIZZ, ModTags.Items.ORES_JIZZ);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCKS_CUM, ModTags.Items.STORAGE_BLOCKS_CUM);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        tag(ModTags.Items.INGOTS_CUM).add(ModItems.CUM_JELLY.get());
        tag(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_CUM);
    }

}
