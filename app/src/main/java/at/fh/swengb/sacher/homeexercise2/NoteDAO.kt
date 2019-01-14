package at.fh.swengb.sacher.homeexercise2

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query


@Dao
interface NoteDAO {

    @Insert
    fun insert(note: Note)

    @Query("SELECT * FROM Note")
    fun getAll() : List<Note>

    @Query("delete from Note")
    fun deleteall()


}