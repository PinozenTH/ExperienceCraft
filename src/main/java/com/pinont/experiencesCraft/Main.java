package com.pinont.experiencesCraft;

import com.pinont.experiences.plugin.ExpPlugin;
import com.pinont.experiencesCraft.Commands.Trash;
import com.pinont.experiencesCraft.ItemCreator.CreatorListener;
import com.pinont.experiencesCraft.events.BlockListener;
import com.pinont.experiencesCraft.events.PlayerListener;

public class Main extends ExpPlugin {

    @Override
    public void onPluginStart() {
        this.addListener(new PlayerListener());
        this.addListener(new BlockListener());
        this.addListener(new CreatorListener());

        this.addCommand(new Trash());
    }

    @Override
    public void onPluginStop() {}
}
