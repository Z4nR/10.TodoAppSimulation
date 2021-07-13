package com.dicoding.todoapp.ui.add

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagedList
import com.dicoding.todoapp.data.Task
import com.dicoding.todoapp.data.TaskRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddTaskViewModel(private val taskRepository: TaskRepository) : ViewModel() {

    fun setAddTask(newTask: Task){
        viewModelScope.launch(Dispatchers.IO) {
            taskRepository.insertTask(newTask)
        }
    }

}