package win.mattgod.mmcore;

import io.papermc.paper.command.brigadier.BasicCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public class GmsCommand implements BasicCommand {

    @Override
    public void execute(CommandSourceStack source, String[] args) {

        Player p = (Player) source.getExecutor();

        if (args.length != 0) {
            source.getSender().sendRichMessage("<red>This command does not take any arguments.");
            return;
        }

        source.getSender().sendRichMessage("<green>Gamemode set to survival.");
        p.setGameMode(GameMode.SURVIVAL);
    }

    @Override
    public @Nullable String permission() {
        return "mmcore.gms.use";
    }
}