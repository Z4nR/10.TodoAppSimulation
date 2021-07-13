package com.dicoding.todoapp.ui.detail

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dicoding.todoapp.R
import com.dicoding.todoapp.data.Task
import com.dicoding.todoapp.ui.ViewModelFactory
import com.dicoding.todoapp.utils.TASK_ID

class DetailTaskActivity : AppCompatActivity() {

    private lateinit var detailTaskViewModel: DetailTaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_detail)

        //TODO 11 : Show detail task and implement delete action
        val intent = intent.getIntExtra(TASK_ID, 0)

        val detailFactory = ViewModelFactory.getInstance(this)
        detailTaskViewModel = ViewModelProvider(this, detailFactory)[DetailTaskViewModel::class.java]
        detailTaskViewModel.setTaskId(intent)
        detailTaskViewModel.task.observe(this, Observer(this::showDetailTask))
        deleteTask()

    }

    private fun deleteTask() {
        val deleteTask : Button = findViewById(R.id.btn_delete_task)
        deleteTask.setOnClickListener {
            detailTaskViewModel.deleteTask()
        }
    }

    private fun showDetailTask(task: Task) {
        val titleDetail : TextView = findViewById(R.id.detail_ed_title)
        val descriptionDetail : TextView = findViewById(R.id.detail_ed_description)
        val dateDetail : TextView = findViewById(R.id.detail_ed_due_date)

        titleDetail.text = task.title
        descriptionDetail.text = task.description
        dateDetail.text = task.dueDateMillis.toString()
    }
}