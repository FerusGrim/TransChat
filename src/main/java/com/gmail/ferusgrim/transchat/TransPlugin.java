package com.gmail.ferusgrim.transchat;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.state.InitializationEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.service.config.ConfigDir;

import java.io.File;

@Plugin(id = "transchat", name = "TransChat", version = "1.0-SNAPSHOT")
public class TransPlugin {

    @Inject
    private Game game;
    
    @Inject
    private Logger logger;
    
    @Inject
    @ConfigDir(sharedRoot = false)
    private File config;
    
    @Subscribe
    public void onInitialization(InitializationEvent event) {
        Trans.set(new TransChat(this.game, this.logger, this.config.getParentFile(), this.config));
    }
}
