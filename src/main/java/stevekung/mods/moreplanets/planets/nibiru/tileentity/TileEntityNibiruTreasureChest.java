package stevekung.mods.moreplanets.planets.nibiru.tileentity;

import stevekung.mods.moreplanets.planets.nibiru.blocks.NibiruBlocks;
import stevekung.mods.moreplanets.utils.tileentity.TileEntityTreasureChestMP;

public class TileEntityNibiruTreasureChest extends TileEntityTreasureChestMP
{
    public TileEntityNibiruTreasureChest()
    {
        super(6, "nibiru", NibiruBlocks.NIBIRU_TREASURE_CHEST);
    }
}