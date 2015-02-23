package com.gmail.ferusgrim.transchat;

import org.slf4j.Logger;
import org.spongepowered.api.Game;

import java.io.File;

public class TransChat {
    
    private final Game game;
    private final Logger logger;
    private final File confDir;
    private final File config;
    
    public TransChat(Game game, Logger logger, File confDir, File config) {
        this.game = game;
        this.logger = logger;
        this.confDir = confDir;
        this.config = config;
    }
    
    public Game getGame() {
        return this.game;
    }
    
    public Logger getLogger() {
        return this.logger;
    }
    
    public File getDataFolder() {
        return this.confDir;
    }
    
    public File getConfig() {
        return this.config;
    }
}
