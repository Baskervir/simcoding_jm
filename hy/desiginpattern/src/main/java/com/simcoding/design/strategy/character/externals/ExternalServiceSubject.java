package com.simcoding.design.strategy.character.externals;

import com.simcoding.design.strategy.character.model.MainCharacter;

import java.util.Arrays;
import java.util.List;

public class ExternalServiceSubject {
    private final List<ExternalObserver> observerList;
    public ExternalServiceSubject() {
        this.observerList = Arrays.asList(new KakaoTalkExternalService(), new SmsExternalService());
    }
    public void register(ExternalObserver observer){
        this.observerList.add(observer);
    };
    public void unregister(ExternalObserver observer){
        this.observerList.remove(observer);
    };
    public void notifyObservers(MainCharacter main){
        for (ExternalObserver externalObserver : this.observerList) {
            externalObserver.update(main);
        }
    };
}
