package net.shylex.firstmod.setup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.item.ItemGroup;



public class ModItems {
    public static final RegistryObject<Item> CUM_JELLY = Registration.ITEMS.register("cum_jelly", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    static void register() {}
}
