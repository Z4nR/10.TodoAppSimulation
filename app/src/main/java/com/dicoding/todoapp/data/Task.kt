package com.dicoding.todoapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

//TODO 1 : Define a local database table using the schema in app/schema/tasks.json

@Entity (tableName = "tasks")
data class Task(

    @PrimaryKey
    @NotNull
    @ColumnInfo (name = "id")
    val id: Int = 0,

    @NotNull
    @ColumnInfo (name = "title")
    val title: String,

    @NotNull
    @ColumnInfo (name = "description")
    val description: String,

    @NotNull
    @ColumnInfo (name = "dueDate")
    val dueDateMillis: Long,

    @ColumnInfo (name = "completed")
    val isCompleted: Boolean = false

)
