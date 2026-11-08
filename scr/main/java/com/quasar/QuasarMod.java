package com.quasar;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuasarMod implements ModInitializer {
    public static final String MOD_ID = "quasar_legit";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // Этот код запускается во время инициализации игры
        LOGGER.info("Quasar Legit Beta v0.1 initialized!");
        LOGGER.info("Welcome back, Admin.");
        
        // TODO: Initialize RoleManager and TelegramAuth here later
    }
}
