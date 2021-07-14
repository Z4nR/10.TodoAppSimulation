package com.dicoding.todoapp.ui.list

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.dicoding.todoapp.R
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

//TODO 16 : Write UI test to validate when user tap Add Task (+), the AddTaskActivity displayed

@RunWith(AndroidJUnit4::class)
class TaskActivityTest {

    private val fakeTitle : String = "Lorem Ipsum"
    private val fakeDesc : String = "Awkakwkakwk"

    @Before
    fun setUp() {
        ActivityScenario.launch(TaskActivity::class.java)
    }

    @Test
    fun writeNewTask(){
        onView(withId(R.id.rv_task))
            .check(matches(isDisplayed()))
        onView(withId(R.id.fab))
            .perform(ViewActions.click())
    }

}