package fr.deepchunks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class DeepChunksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // smartCull = cave culling / occlusion culling de Minecraft (desactive = tout est rendu)
        ClientTickEvents.END_CLIENT_TICK.register(client -> client.smartCull = false);
    }
}
