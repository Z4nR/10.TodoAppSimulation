package com.dicoding.todoapp.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.todoapp.R
import com.dicoding.todoapp.ui.list.TaskViewModel

class DetailTaskActivity : AppCompatActivity() {

    private lateinit var detailTaskViewModel: DetailTaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_detail)

        //TODO 11 : Show detail task and implement delete action
        showDetailTask()

    }

    private fun showDetailTask() {
        TODO("Not yet implemented")
    }
}