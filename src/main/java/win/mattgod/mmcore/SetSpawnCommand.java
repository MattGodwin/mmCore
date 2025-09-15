package win.mattgod.mmcore;

import org.bukkit.Location;
import io.papermc.paper.command.brigadier.BasicCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import org.bukkit.entity.Player;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import win.mattgod.mmcore.utils.LocationUtil;

@NullMarked
public class SetSpawnCommand implements BasicCommand {

    private final Mmcore plugin;

    public SetSpawnCommand(Mmcore plugin) {
        this.plugin = plugin;
    }

    @Override
    public void execute(CommandSourceStack source, String[] args) {

        Player p = (Player) source.getExecutor();

        if (args.length != 0) {
            source.getSender().sendRichMessage("<red>This command does not take any arguments.");
            return;
        }

        source.getExecutor().sendRichMessage("<green>Server spawn set.");
        LocationUtil.saveLocation(plugin, "spawn-location", p.getLocation());


    }

    @Override
    public @Nullable String permission() {
        return "mmcore.setSpawn.use";
    }
}