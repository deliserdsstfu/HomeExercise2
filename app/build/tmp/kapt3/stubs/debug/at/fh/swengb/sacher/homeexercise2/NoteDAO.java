package at.fh.swengb.sacher.homeexercise2;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lat/fh/swengb/sacher/homeexercise2/NoteDAO;", "", "deleteall", "", "getAll", "", "Lat/fh/swengb/sacher/homeexercise2/Note;", "insert", "note", "app_debug"})
public abstract interface NoteDAO {
    
    @android.arch.persistence.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    at.fh.swengb.sacher.homeexercise2.Note note);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM Note")
    public abstract java.util.List<at.fh.swengb.sacher.homeexercise2.Note> getAll();
    
    @android.arch.persistence.room.Query(value = "delete from Note")
    public abstract void deleteall();
}