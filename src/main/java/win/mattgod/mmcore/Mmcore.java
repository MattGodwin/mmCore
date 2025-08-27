package win.mattgod.mmcore;

import org.bukkit.plugin.java.JavaPlugin;

public final class Mmcore extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommand("announce", new AnnounceCommand());
        registerCommand("gmc", new GmcCommand());
        registerCommand("gms", new GmsCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
