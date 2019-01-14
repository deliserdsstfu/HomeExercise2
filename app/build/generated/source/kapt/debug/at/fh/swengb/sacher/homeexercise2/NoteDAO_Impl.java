package at.fh.swengb.sacher.homeexercise2;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class NoteDAO_Impl implements NoteDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfNote;

  private final SharedSQLiteStatement __preparedStmtOfDeleteall;

  public NoteDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNote = new EntityInsertionAdapter<Note>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Note`(`bold`,`text`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Note value) {
        if (value.getBold() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getBold());
        }
        if (value.getText() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getText());
        }
      }
    };
    this.__preparedStmtOfDeleteall = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from Note";
        return _query;
      }
    };
  }

  @Override
  public void insert(Note note) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfNote.insert(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteall() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteall.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteall.release(_stmt);
    }
  }

  @Override
  public List<Note> getAll() {
    final String _sql = "SELECT * FROM Note";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfBold = _cursor.getColumnIndexOrThrow("bold");
      final int _cursorIndexOfText = _cursor.getColumnIndexOrThrow("text");
      final List<Note> _result = new ArrayList<Note>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Note _item;
        final String _tmpBold;
        _tmpBold = _cursor.getString(_cursorIndexOfBold);
        final String _tmpText;
        _tmpText = _cursor.getString(_cursorIndexOfText);
        _item = new Note(_tmpBold,_tmpText);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
