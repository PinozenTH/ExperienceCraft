package com.pinont.experiencesCraft.Commands;

import com.pinont.experiences.api.commands.SimpleCommand;
import com.pinont.experiences.api.commands.SimpleCommandManager;
import com.pinont.experiencesCraft.GUI.Trash_ui;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class Trash extends SimpleCommand {
    public Trash() {
        this.addCommand(new SimpleCommandManager("trash") {
            @Nullable
            @Override
            public Map<Integer, List<String>> args() {
                return Map.of();
            }

            @Override
            public void execute(CommandSender sender, Command command, String[] args) {
                if (sender instanceof Player player) new Trash_ui().displayTo(player);
            }
        }, CommandSenderType.PLAYER);
    }
}
