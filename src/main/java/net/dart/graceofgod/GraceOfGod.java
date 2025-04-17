package net.dart.graceofgod;

import net.dart.graceofgod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GraceOfGod implements ModInitializer {
	public static final String MOD_ID = "graceofgod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}