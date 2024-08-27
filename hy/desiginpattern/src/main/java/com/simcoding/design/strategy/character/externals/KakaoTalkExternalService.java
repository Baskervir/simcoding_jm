package com.simcoding.design.strategy.character.externals;

import com.simcoding.design.strategy.character.model.MainCharacter;

public class KakaoTalkExternalService implements ExternalService, ExternalObserver {
    @Override
    public void send(String message) {
        System.out.println("까까오톡!!!! "+message);
    }

    @Override
    public void update(MainCharacter main) {

        this.send(main.toString()+" is moved");

    }
}
