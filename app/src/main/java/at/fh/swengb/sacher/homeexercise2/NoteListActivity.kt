package at.fh.swengb.sacher.homeexercise2

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.constraint.solver.widgets.ConstraintTableLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_note_list.*

class NoteListActivity : AppCompatActivity() {

    var notes = mutableListOf<Note>()
    var adapter = NoteAdapter()
    lateinit var database: NoteDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)

        val sharedPreferences = getSharedPreferences(packageName, Context.MODE_PRIVATE)


        val savedString = sharedPreferences.getString("MY_KEY_FOR_STRING", null)
        val savedInt = sharedPreferences.getInt("MY_KEY_FOR_INT", -1)

        var name = findViewById(R.id.nameandage) as TextView

        name.text = "Notes for ${savedString} , ${savedInt}"
     }


    fun addNote(v: View){

        val intent = Intent(this, AddNoteActivity::class.java)
        startActivity(intent)
        //database.noteDao.deleteall()

    }

    override fun onResume() {
        super.onResume()

       database = NoteDatabase.getDatabase(this)
        notes = database.noteDao.getAll().toMutableList()

        adapter.list = notes
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


    }


}
