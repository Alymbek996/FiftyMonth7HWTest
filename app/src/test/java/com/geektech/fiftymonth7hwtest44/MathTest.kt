package com.geektech.fiftymonth7hwtest44

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
   private var math:Math?=null

    @Before
    fun init(){
        math= Math()
    }
    @Test
    fun simpleAdd(){
        assertEquals("4",math?.add("2", "2"))
    }
    @Test
    fun negativeAdd(){
        assertEquals("4",math?.add("6","-2"))
    }
    @Test
    fun withDotAdd(){
        assertEquals("У вас лишняя точка", math?.add("4.","2"))
    }

    @Test
    fun floatAdd(){
        assertEquals("4", math?.add("2f","2f"))
    }

    @Test
    fun emptyAdd(){
        assertEquals("Вы не ввели ничего",math?.add("2",""))
    }
    @Test
    fun simpleDivide(){
        assertEquals("3",math?.divide("6","2"))
    }
    @Test
    fun symbolAdd  (){
        assertEquals("Вы ввели символы",math?.add("6hghghhg","2"))
    }
    @Test
    fun divideOnZero(){
        assertEquals("Делить на ноль нельзя",math?.divide("6","0"))
    }

    @After
    fun detach(){
        math= null
    }
}