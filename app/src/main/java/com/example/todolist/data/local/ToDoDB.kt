package com.example.todolist.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todolist.data.model.Alarm
import com.example.todolist.data.model.ToDo

@Database(entities = [ToDo::class,Alarm::class], version = 1)
abstract class ToDoDB : RoomDatabase() {
    abstract fun toDoDAO(): ToDoListDAO
}