package at.fh.swengb.sacher.homeexercise2;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {at.fh.swengb.sacher.homeexercise2.Note.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lat/fh/swengb/sacher/homeexercise2/NoteDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "noteDao", "Lat/fh/swengb/sacher/homeexercise2/NoteDAO;", "getNoteDao", "()Lat/fh/swengb/sacher/homeexercise2/NoteDAO;", "Companion", "app_debug"})
public abstract class NoteDatabase extends android.arch.persistence.room.RoomDatabase {
    public static final at.fh.swengb.sacher.homeexercise2.NoteDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract at.fh.swengb.sacher.homeexercise2.NoteDAO getNoteDao();
    
    public NoteDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lat/fh/swengb/sacher/homeexercise2/NoteDatabase$Companion;", "", "()V", "getDatabase", "Lat/fh/swengb/sacher/homeexercise2/NoteDatabase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final at.fh.swengb.sacher.homeexercise2.NoteDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}