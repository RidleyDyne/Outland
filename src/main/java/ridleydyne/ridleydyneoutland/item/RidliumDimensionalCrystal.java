package ridleydyne.ridleydyneoutland.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ridleydyne.ridleydyneoutland.init.ModItems;

public class RidliumDimensionalCrystal extends Item {
    public RidliumDimensionalCrystal() {
        super(ModItems.defaultItemProperties(64));
    }

    @Override
    public void onUse(World worldIn, LivingEntity livingEntityIn, ItemStack stack, int count) {
        // This is currently debug code for testing purposes
        // livingEntityIn.changeDimension(worldIn.getServer(), );

    }

}
