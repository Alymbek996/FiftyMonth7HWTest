package com.geektech.fiftymonth7hwtest44

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.regex.Pattern.matches

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    var math:Math?=null
    @Before
    fun init(){
        math=Math()
    }


    @Test
    fun simpleAdd(){
        onView(withId(R.id.et_first)).perform(typeText("2"))
        onView(withId(R.id.et_second)).perform(typeText("2"))
        onView(withId(R.id.btn_plus)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("4")))



    }
    @Test
    fun divide(){
        onView(withId(R.id.et_first)).perform(typeText("6"))
        onView(withId(R.id.et_second)).perform(typeText("2"))
        onView(withId(R.id.btn_divide)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("На ноль делить нельзя")))
    }
    @After
    fun detach(){
        math=null
    }
}





