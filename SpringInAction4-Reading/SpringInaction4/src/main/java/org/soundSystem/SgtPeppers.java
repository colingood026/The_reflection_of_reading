package org.soundSystem;

import org.springframework.stereotype.Component;

/**
 * Created by Colin on 2017/6/6.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Lonely home";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("playing "+title+" by "+artist);
    }
}
