package win.mattgod.mmcore;

import org.bukkit.plugin.java.JavaPlugin;

public final class Mmcore extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        registerCommand("announce", new AnnounceCommand());
        registerCommand("gmc", new GmcCommand());
        registerCommand("gms", new GmsCommand());
        registerCommand("spawn", new SpawnCommand(this));
        registerCommand("setspawn", new SetSpawnCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
