package net.shylex.firstmod.setup;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import net.shylex.firstmod.FirstMod;

public class ModTags {
    public static final class Blocks{
        public static final ITag.INamedTag<Block> ORES_JIZZ = forge("ores/jizz");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_CUM = forge("storage_blocks/cum");

        private static ITag.INamedTag<Block> forge(String path){
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path){
            return BlockTags.bind(new ResourceLocation(FirstMod.MOD_ID, path).toString());
        }



    }

    public static final class Items{
        public static final ITag.INamedTag<Item> ORES_JIZZ = forge("ores/jizz");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_CUM = forge("storage_blocks/cum");

        public static final ITag.INamedTag<Item> INGOTS_CUM = forge("ingots/cum");


        private static ITag.INamedTag<Item> forge(String path){
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path){
            return ItemTags.bind(new ResourceLocation(FirstMod.MOD_ID, path).toString());
        }
    }
}
