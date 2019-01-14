package at.fh.swengb.sacher.homeexercise2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_add_note.*

class AddNoteActivity : AppCompatActivity() {

    lateinit var database: NoteDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        database = NoteDatabase.getDatabase(this)

    }

    fun save(v: View) {

        val bold = input1.text.toString()
        val text = input2.text.toString()

        val note = Note(bold = bold, text = text)

        database.noteDao.insert(note)
        finish()
    }
}
