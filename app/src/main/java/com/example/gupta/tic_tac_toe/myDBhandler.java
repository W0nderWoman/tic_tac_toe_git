package com.example.gupta.tic_tac_toe;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Gupta on 07-02-2018.
 */

public class myDBhandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="ttt.db";
    public static final String TABLE_NAME="games";
    public static final String COLUMN_ID="g_no";
    public static final String COLUMN1_NAME="p1_name";
    public static final String COLUMN2_NAME="p2_name";
    public static final String COLUMN3_NAME="w_no";
    public static final String COLUMN4_NAME="w_name";
//constructor
    public myDBhandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="CREATE TABLE "+TABLE_NAME+"("
                +COLUMN_ID+"INTEGER PRIMARY KEY INCREMENT,"
                +COLUMN1_NAME+"TEXT,"
                +COLUMN2_NAME+"TEXT,"
                +COLUMN3_NAME+"INTEGER,"
                +COLUMN4_NAME+"TEXT"
                +");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
    public void addproduct(game_data game)
    {
        ContentValues values=new ContentValues();
        values.put(COLUMN_ID,game.getG_no());
        SQLiteDatabase db=getWritableDatabase();
        db.insert(TABLE_NAME,null,values);
        db.close();
    }
    public void deleteproduct(String gamename)
    {
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL("DELETE FROM "+TABLE_NAME+" WHERE "+COLUMN_ID+"=\""+gamename+"\";");
    }
    public String databasetostring()
    {
        String dbString="";
        SQLiteDatabase db=getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME+"WHERE 1";
        Cursor c=db.rawQuery(query,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {
            if(c.getString(c.getColumnIndex("productname"))!=null)
            {
                dbString+=c.getString(c.getColumnIndex("productname"));
                dbString+="\n";
            }
            c.moveToNext();
        }
        db.close();
        return dbString;
    }
}
