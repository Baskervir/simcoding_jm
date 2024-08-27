package com.simcoding.design.strategy.character.externals;

import com.simcoding.design.strategy.character.model.MainCharacter;

public class SmsExternalService implements ExternalService, ExternalObserver{
    @Override
    public void update(MainCharacter main) {
        this.send(main+" SMSMS!!!!!!!!!!!!!!");
    }

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
