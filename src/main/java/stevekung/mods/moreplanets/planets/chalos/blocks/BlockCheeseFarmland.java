package stevekung.mods.moreplanets.planets.chalos.blocks;

import net.minecraft.block.Block;
import stevekung.mods.moreplanets.utils.blocks.BlockFarmlandMP;
import stevekung.mods.stevekunglib.utils.BlockStateProperty;

public class BlockCheeseFarmland extends BlockFarmlandMP
{
    public BlockCheeseFarmland(String name)
    {
        super();
        this.setDefaultState(this.getDefaultState().withProperty(BlockStateProperty.MOISTURE, Integer.valueOf(0)));
        this.setUnlocalizedName(name);
    }

    @Override
    protected Block getDirtBlock()
    {
        return ChalosBlocks.CHEESE_DIRT;
    }

    @Override
    protected Block getSourceBlock()
    {
        return ChalosBlocks.CHEESE_MILK_FLUID_BLOCK;
    }
}