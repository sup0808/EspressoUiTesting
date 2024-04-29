package com.demo.espressouitesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test



class MainActivityTest{

    @get:Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun test_nextButton(){
        onView(withId(R.id.btn_next)).perform(click())
        onView(withId(R.id.btn_next)).perform(click())
      //  onView(withId(R.id.btn_next)).perform(click())
        onView(withId(R.id.txt_writer)).check(matches(withText("Vince Lombardi")))

    }
}