package win.mattgod.mmcore;

import io.papermc.paper.command.brigadier.BasicCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.Placeholder;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public class GmcCommand implements BasicCommand {

    @Override
    public void execute(CommandSourceStack source, String[] args) {

        Player p = (Player) source.getExecutor();

        if (args.length != 0) {
            source.getSender().sendRichMessage("<red>This command does not take any arguments.");
            return;
        }

        source.getSender().sendRichMessage("<green>Gamemode set to creative.");
        p.setGameMode(GameMode.CREATIVE);
    }

    @Override
    public @Nullable String permission() {
        return "mmcore.gmc.use";
    }
}