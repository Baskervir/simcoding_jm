package com.simcoding.design.strategy.character.config;

public class InitializerFasade {
    EnvSettingConfing envSettingConfing = new EnvSettingConfing();
    GameStatisticReporter reporter = new GameStatisticReporter();
    public void config(){
        envSettingConfing.envSet();
        reporter.report();

    }
}
