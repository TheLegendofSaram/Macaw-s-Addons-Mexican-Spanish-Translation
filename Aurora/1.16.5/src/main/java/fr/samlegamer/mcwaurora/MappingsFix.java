package fr.samlegamer.mcwaurora;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = McwAurora.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MappingsFix
{
	private static final MappingMissing.Bridges bridges_bayou = new MappingMissing.Bridges("mcwbridgesaurora", McwAurora.MODID, McwAurora.WOOD_BAYOU);
	private static final MappingMissing.Bridges bridges_mush = new MappingMissing.Bridges("mcwbridgesaurora", McwAurora.MODID, McwAurora.WOOD_ENHANCED_MUSH);
	
	@SubscribeEvent
	public static void missingnoWoodBlock(RegistryEvent.MissingMappings<Block> event)
	{
		bridges_bayou.missingnoWoodBlock(event);
		bridges_mush.missingnoWoodBlock(event);
	}
	
	@SubscribeEvent
	public static void missingnoWoodItem(RegistryEvent.MissingMappings<Item> event)
	{
		bridges_bayou.missingnoWoodItem(event);
		bridges_mush.missingnoWoodItem(event);
	}
}