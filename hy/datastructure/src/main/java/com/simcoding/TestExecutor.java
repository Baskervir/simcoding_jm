package com.simcoding;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class TestExecutor {

    static public <T> void add100_000_00Elements(List<Integer> list){
        logTimeLaps("add", ()->
            IntStream.range(0, 10_000_000).forEach(
                    list::add
            )
        );
    }

    static public <T> void removeRandomIndexFor1000Times(List<Integer> list){
        logTimeLaps("remove", ()->IntStream.range(0, 1_000).forEach(
                list::remove
        ));
    }

    static public <T> void accRandomElementFor10000Times(List<Integer> list){
        logTimeLaps("random access",()->
            IntStream.range(0, 10_000).forEach(
                    t-> {
                        Integer i = list.get(t);
                    }
            )
        );
    }


    static public <T> void insertElementAtRandomIndexFor10_000Times(List<Integer> list){
        logTimeLaps("insert",()->
            IntStream.range(0, 10_000).forEach(
                    t-> {
                        Random r = new Random();
                        list.add(r.nextInt(10_000), t);
                    }
            )
        );
    }

    static public void logTimeLaps(String marker, Runnable r){
        long start = System.currentTimeMillis();
        r.run();
        long end = System.currentTimeMillis() - start;
        Duration duration = Duration.ofMillis(end);
        System.out.println(marker+" timelaps : "+ duration.getSeconds()+" 초"+" "+duration.toMillis());
    }

}
