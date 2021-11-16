package io.github.bagble.hello;

import io.github.kill00.sqlitemc.slm;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        slm.register(this);
        slm.setupDB("hello");
    }
}