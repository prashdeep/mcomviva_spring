package com.classpath.test;

import com.classpath.annotations.One;

import com.classpath.annotations.Two;
import org.junit.Assert;
import org.junit.Test;


public class TestOne {

    @Test
    public void testExecute(){;
        Two two = new Two(null);
        One one  = new One(two);
        one.execute();
        //Assert.a
    }


}
