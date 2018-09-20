package com.gtb.wechat;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

public class HelloWordControllerTest {


    private HelloWordController helloWordController;

    @Before
    public void setUp(){
        helloWordController = new HelloWordController();
    }


    @Test
    public void showAccessTimesTest(){
        Integer times = 100;

        Integer accessTimes = helloWordController.showAccessTimes();
        Assert.assertEquals(times, accessTimes);


    }











    @After
    public void destory(){
        System.out.println("After:destory()");
    }



}
