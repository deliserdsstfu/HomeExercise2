package at.fh.swengb.sacher.homeexercise2



import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.note_adapter.view.*


class NoteAdapter : RecyclerView.Adapter<NoteViewHolder>() {

    var list = listOf<Note>()


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): NoteViewHolder {
        val inflater = LayoutInflater.from(p0.context)
        val noteView  = inflater.inflate(R.layout.note_adapter, p0, false)
        return NoteViewHolder(noteView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: NoteViewHolder, p1: Int) {
        val note = list[p1]
        p0.bindItem(note)
    }


}


class NoteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bindItem(note: Note) {
        itemView.text.text = note.text
        itemView.bold.text = note.bold
    }
}