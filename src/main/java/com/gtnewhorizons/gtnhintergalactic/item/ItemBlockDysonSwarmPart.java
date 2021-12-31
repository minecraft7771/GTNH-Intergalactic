package galaxyspace.core.item.block;

import java.util.List;

import galaxyspace.core.block.BlockDysonSwarmPart;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockDysonSwarmPart extends ItemBlock {

	public ItemBlockDysonSwarmPart(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "tile.DysonSwarm" + BlockDysonSwarmPart.names[stack.getItemDamage() % BlockDysonSwarmPart.names.length];
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean f3_h) {
		if(stack.getItemDamage() == 9) {
			tooltip.add("Blast Resistance: 1500");
		}
	}

}
