package com.simcoding.design.strategy.character.externals;

/**
 * @apiNote 외부 메시지 발송용 인터페이스. SMS, 카톡, 메일 등, 외부 시스템과 연동을 위한 작업이 필요할 시,
 * 해당 인터페이스를 구현하도록 한다.
 * **/
public interface ExternalService {
    void send(String message);
}
