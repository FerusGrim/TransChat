package com.gmail.ferusgrim.transchat;

import org.slf4j.Logger;
import org.spongepowered.api.Game;

import java.io.File;

public final class Trans {
    
    private static TransChat instance;
    
    public static void set(TransChat instance) {
        if (Trans.instance != null) {
            throw new UnsupportedOperationException("Cannot redefine the TransChat singleton!");
        }
        
        Trans.instance = instance;
    }
    
    public static Game getGame() {
        return instance.getGame();
    }
    
    public static Logger getLogger() {
        return instance.getLogger();
    }
    
    public static File getDataFolder() {
        return instance.getDataFolder();
    }
    
    public static File getConfig() {
        return instance.getConfig();
    }
}
