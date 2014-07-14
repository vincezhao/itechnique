package org.itechnique.web.util;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

    public void test(){
        Timer timer = new Timer("timer",false);
        timer.schedule(new TimerTask(){

            @Override
            public void run() {
                // TODO Auto-generated method stub
                
            }
            
        }, 1000, 3000);
    }
}
