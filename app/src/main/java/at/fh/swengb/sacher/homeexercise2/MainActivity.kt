package at.fh.swengb.sacher.homeexercise2

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun addUser(v: View){


        val sharedPreferences = getSharedPreferences(packageName, Context.MODE_PRIVATE)


        if(name.text.toString() == "" )
        {
            Log.i("Empty", "Please enter a valid input")
        }
        else if (nameandage.text.isEmpty() )
        {
            Log.i("Empty", "Please enter a valid input")
        }
        else
        {
            sharedPreferences.edit().putString("MY_KEY_FOR_STRING", name.text.toString()).apply()
            sharedPreferences.edit().putInt("MY_KEY_FOR_INT", nameandage.text.toString().toInt()).apply()

            val intent = Intent(this, NoteListActivity::class.java)
            startActivity(intent)
        }


    }


}
