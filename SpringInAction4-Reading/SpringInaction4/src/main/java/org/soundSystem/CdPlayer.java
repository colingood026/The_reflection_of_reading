package org.soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by colin.lee on 2017/6/7.
 */
@Component
public class CdPlayer implements MediaPlayer {

    private CompactDisc cd;


    @Inject
    public void initCd(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired
    public CdPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {

    }
}
