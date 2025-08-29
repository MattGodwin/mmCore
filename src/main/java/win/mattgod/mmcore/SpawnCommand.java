package win.mattgod.mmcore;

import io.papermc.paper.command.brigadier.BasicCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

import static org.bukkit.Bukkit.getServer;

@NullMarked
public class SpawnCommand implements BasicCommand {

    @Override
    public void execute(CommandSourceStack source, String[] args) {

        Player p = (Player) source.getExecutor();
        World world = getServer().getWorlds().getFirst();

        if (args.length != 0) {
            source.getSender().sendRichMessage("<red>This command does not take any arguments.");
            return;
        }

        source.getExecutor().sendRichMessage("<green>Teleporting you to spawn.");
        p.teleport(world.getSpawnLocation());

    }

    @Override
    public @Nullable String permission() {
        return "mmcore.spawn.use";
    }
}