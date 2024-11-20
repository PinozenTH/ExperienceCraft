package com.pinont.experiencesCraft.Commands;

import com.pinont.experiences.api.commands.SimpleCommand;
import com.pinont.experiences.api.commands.SimpleCommandManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public class spawn extends SimpleCommand {
    public spawn() {
        this.addCommand(new SimpleCommandManager("spawn") {
            @Override
            public @NotNull Map<Integer, List<String>> args() {
                return Map.of(0, List.of("test"));
            }

            @Override
            public void execute(CommandSender sender, Command command, String[] args) {
                if (sender instanceof Player player) {
                    player.sendMessage("Hello, World!");
                }
            }
        }, CommandSenderType.PLAYER);
    }
}
