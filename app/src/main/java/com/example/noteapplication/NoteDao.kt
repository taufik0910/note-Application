package com.example.noteapplication

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: Note)

    @Update
    suspend fun update()

    @Delete
    suspend fun delete()
    @Query("select * from noteTable order by id ASC")
    fun getAllNote():LiveData<List<Note>>

}