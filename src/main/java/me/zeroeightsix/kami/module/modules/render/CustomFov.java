package me.zeroeightsix.kami.module.modules.render;

import me.zeroeightsix.kami.module.Module;
import me.zeroeightsix.kami.setting.Setting;
import me.zeroeightsix.kami.setting.Settings;

@Module.Info(name = "CusotmFov",category = Module.Category.RENDER,description = "")
public class CustomFov extends Module{

    private Setting<Integer> fov = register(Settings.integerBuilder("Fov").withMinimum(30).withValue(120).withMaximum(360));

    @Override
    public void onUpdate(){
        mc.gameSettings.fovSetting = fov.getValue();
    }
}
