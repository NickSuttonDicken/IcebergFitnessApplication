package com.froztisoftware.icebergfitness.util

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import java.util.*

class DBHandler(context: Context) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION){

    override fun onCreate(db: SQLiteDatabase?) {
        //Creating Exercise Sets Table
        var CREATE_TABLE = "CREATE TABLE $TABLE_EXERCISE_SETS(" +
                "$UID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "$ES_ORDER INTEGER," +
                "$WEIGHT REAL," +
                "$WEIGHT_UNITS TEXT," +
                "$ES_REPS INTEGER," +
                "$ES_DISTANCE REAL," +
                "$ES_DISTANCE_UNITS TEXT," +
                "$ES_TIME TEXT," +
                "$EXERCISE_ID INTEGER," +
                "$WORKOUT_ID INTEGER," +
                "$CREATED INTEGER," +
                "$UPDATED INTEGER," +
                "$ES_ONE_REP_MAX REAl," +
                "$ES_VOLUME REAL," +
                "FOREIGN KEY($EXERCISE_ID) REFERENCES $TABLE_EXERCISES($UID)," +
                "FOREIGN KEY($WORKOUT_ID) REFERENCES $TABLE_WORKOUTS($UID))"
        db!!.execSQL(CREATE_TABLE)

        //Creating Exercises Table
        CREATE_TABLE = "CREATE TABLE $TABLE_EXERCISES(" +
                "$UID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "$NAME TEXT," +
                "$CREATED INTEGER," +
                "$UPDATED INTEGER)"
        db.execSQL(CREATE_TABLE)

        //Creating Workouts Table
        CREATE_TABLE = "CREATE TABLE $TABLE_WORKOUTS(" +
                "$UID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "$W_DATE TEXT," +
                "$ROUTINE_ID INTEGER," +
                "$CREATED INTEGER," +
                "$UPDATED INTEGER," +
                "FOREIGN KEY($ROUTINE_ID) REFERENCES $TABLE_ROUTINES($UID))"
        db.execSQL(CREATE_TABLE)

        //Creating Routines Table
        CREATE_TABLE = "CREATE TABLE $TABLE_ROUTINES(" +
                "$UID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "$NAME TEXT," +
                "$PLAN_ID INTEGER," +
                "$CREATED INTEGER," +
                "$UPDATED INTEGER," +
                "FOREIGN KEY($PLAN_ID) REFERENCES $TABLE_PLANS($UID))"
        db.execSQL(CREATE_TABLE)

        //Creating Plans Table
        CREATE_TABLE = "CREATE TABLE $TABLE_PLANS(" +
                "$UID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "$NAME TEXT," +
                "$CREATED INTEGER," +
                "$UPDATED INTEGER)"
        db.execSQL(CREATE_TABLE)

        //Creating User Table
        CREATE_TABLE = "CREATE TABLE $TABLE_USER(" +
                "$UID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "$FIRST TEXT," +
                "$LAST TEXT," +
                "$HEIGHT REAL," +
                "$HEIGHT_UNITS TEXT," +
                "$AGE INTEGER," +
                "$WEIGHT REAL," +
                "$WEIGHT_UNITS TEXT)"
        db.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_EXERCISE_SETS")
        onCreate(db)

        db.execSQL("DROP TABLE IF EXISTS $TABLE_EXERCISES")
        onCreate(db)

        db.execSQL("DROP TABLE IF EXISTS $TABLE_WORKOUTS")
        onCreate(db)

        db.execSQL("DROP TABLE IF EXISTS $TABLE_ROUTINES")
        onCreate(db)

        db.execSQL("DROP TABLE IF EXISTS $TABLE_PLANS")
        onCreate(db)

        db.execSQL("DROP TABLE IF EXISTS $TABLE_USER")
        onCreate(db)
    }

    companion object {
        //Universal Table Variables
        const val DB_VERSION = 1;
        const val DB_NAME = "icebergDB"
        const val NAME = "name"
        const val CREATED = "created_at"
        const val UPDATED = "updated_at"
        const val WEIGHT = "weight"
        const val WEIGHT_UNITS = "weight_units"
        const val UID = "uid"

        //Foreign Key Variables
        const val EXERCISE_ID = "exercise_id"
        const val WORKOUT_ID = "workout_id"
        const val ROUTINE_ID = "routine_id"
        const val PLAN_ID = "plan_id"

        //Exercise Sets Table Variables
        const val TABLE_EXERCISE_SETS = "exercise_sets"
        const val ES_ORDER = "order_no"
        const val ES_REPS = "reps"
        const val ES_DISTANCE = "distance"
        const val ES_DISTANCE_UNITS = "distance_units"
        const val ES_TIME = "time"
        const val ES_ONE_REP_MAX = "one_rep_max"
        const val ES_VOLUME = "volume"

        //Exercises Table Variables
        const val TABLE_EXERCISES = "exercises"

        //Workouts Table Variables
        const val TABLE_WORKOUTS = "workouts"
        const val W_DATE = "date"

        //Routines Table Variables
        const val TABLE_ROUTINES = "routines"

        //Plan Table Variables
        const val TABLE_PLANS = "plans"

        //User Table Variables
        const val TABLE_USER = "user"
        const val FIRST = "firstname"
        const val LAST = "lastname"
        const val HEIGHT = "height"
        const val HEIGHT_UNITS = "height_units"
        const val AGE = "age"

    }
}