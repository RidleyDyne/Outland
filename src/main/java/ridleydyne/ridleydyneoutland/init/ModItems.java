package ridleydyne.ridleydyneoutland.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import ridleydyne.ridleydyneoutland.*;
import ridleydyne.ridleydyneoutland.item.*;

public enum ModItems {
    DIMENSIONAL_CRYSTAL(new RidliumDimensionalCrystal());

    private final Item item;

    ModItems(Item item) {
        this.item = item;
        this.item.setRegistryName(this.getName());
    }

    public String getName() {
        return String.valueOf(this).toLowerCase();
    }

    public Item getItem() {
        return this.item;
    }
   
    public static Properties defaultItemProperties(int maxStackSize) {
        return new Item.Properties()
            .maxStackSize(1)        
            .group(ridleydyneoutland.ITEM_GROUP)
            .setNoRepair();
    }
}
