package net.fabricmc.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Mod entrypoint - runs on the client side when Minecraft starts.
 *
 * Currently sends a greeting in chat when the player joins a world/server.
 * Extend this class to add more features.
 */
public class ExampleMod implements ClientModInitializer {
	public static final String MOD_ID = "examplemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private boolean greeted = false;

	@Override
	public void onInitializeClient() {
		LOGGER.info("ExampleMod initialized on the client!");

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if (!greeted && client.player != null && client.world != null) {
				greeted = true;
				client.player.networkHandler.sendChatMessage("ExampleMod loaded successfully!");
			}
		});
	}
}
