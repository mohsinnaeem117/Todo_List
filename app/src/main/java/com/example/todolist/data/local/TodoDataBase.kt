package com.example.todolist.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todolist.domain.Todo

@Database(entities = [Todo::class], version = 1, exportSchema = true)
abstract class TodoDataBase: RoomDatabase() {
    abstract fun todoDao(): TodoDao
}