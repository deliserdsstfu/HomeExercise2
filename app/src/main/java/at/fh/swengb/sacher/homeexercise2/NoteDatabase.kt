package at.fh.swengb.sacher.homeexercise2

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDAO

    companion object {
        fun getDatabase(context: Context): NoteDatabase {
            return Room.databaseBuilder(context, NoteDatabase::class.java, "Note-db")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
        }
    }
}