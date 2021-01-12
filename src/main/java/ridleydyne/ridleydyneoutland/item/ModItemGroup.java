package ridleydyne.ridleydyneoutland.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ridleydyne.ridleydyneoutland.init.ModItems;

public class ModItemGroup extends ItemGroup {
    public ModItemGroup(String label) {
        super(label);
        //this.setNoTitle();
    }
    
    @Override
	public ItemStack createIcon() {
		return new ItemStack(ModItems.DIMENSIONAL_CRYSTAL.getItem());
    }
    
    @Override
	public boolean hasSearchBar() {
		return false;
	}
}