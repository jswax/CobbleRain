package net.rain;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CobbleRain implements ModInitializer {
	public static final String MOD_ID = "cobblerain";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Initializing CobbleRain v1.0");
	}
}