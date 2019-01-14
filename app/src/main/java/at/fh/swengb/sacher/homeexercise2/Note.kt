package at.fh.swengb.sacher.homeexercise2

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
class Note (@PrimaryKey  var bold : String, val text: String) {


    override fun toString(): String {
        return "Note(bold='$bold', text='$text')"
    }

}