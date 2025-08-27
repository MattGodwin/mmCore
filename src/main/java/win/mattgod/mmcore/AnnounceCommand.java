package win.mattgod.mmcore;

import io.papermc.paper.command.brigadier.BasicCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.Placeholder;
import org.bukkit.Bukkit;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public class AnnounceCommand implements BasicCommand {

    @Override
    public void execute(CommandSourceStack source, String[] args) {

        if (args.length == 0) {
            source.getSender().sendRichMessage("<red>You cannot send an empty broadcast!");
            return;
        }

        final String message = String.join(" ", args);
        final Component broadcastMessage = MiniMessage.miniMessage().deserialize(
                "<red><bold>Announcement</red> <dark_gray>»</dark_gray> <message>",
                Placeholder.unparsed("message", message)
        );

        Bukkit.broadcast(broadcastMessage);
    }

    @Override
    public @Nullable String permission() {
        return "mmcore.announce.use";
    }
}