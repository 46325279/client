package me.zeroeightsix.kami.command.commands;

import me.zeroeightsix.kami.command.Command;
import me.zeroeightsix.kami.command.syntax.ChunkBuilder;
import me.zeroeightsix.kami.module.modules.hidden.FixGui;

import static me.zeroeightsix.kami.KamiMod.MODULE_MANAGER;
import static me.zeroeightsix.kami.util.MessageSendHelper.sendChatMessage;

/**
 * @author S-B99
 */
public class FixGuiCommand extends Command {
    public FixGuiCommand() {
        super("fixgui", new ChunkBuilder().build());
        setDescription("Allows you to disable the automatic gui positioning");
    }

    @Override
    public void call(String[] args) {
        FixGui fixGui = MODULE_MANAGER.getModuleT(FixGui.class);
        if (fixGui.isEnabled()) {
            fixGui.disable();
            sendChatMessage("[" + getLabel() + "] Disabled");
        }
        else {
            fixGui.enable();
            sendChatMessage("[" + getLabel() + "] Enabled");
        }
    }
}
