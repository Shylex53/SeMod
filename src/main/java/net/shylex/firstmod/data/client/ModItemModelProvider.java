package net.shylex.firstmod.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.shylex.firstmod.FirstMod;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper){
        super(generator, FirstMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels(){
        withExistingParent("jizz_ore", modLoc("block/jizz_ore"));
        withExistingParent("cum_block", modLoc("block/cum_block"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "cum_jelly");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/"+name);
    }
}
