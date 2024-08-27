package com.simcoding.design.strategy.character.externals;

import com.simcoding.design.strategy.character.model.MainCharacter;

public interface ExternalObserver {
    void update(MainCharacter main);
}
