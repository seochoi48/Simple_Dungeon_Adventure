package Database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.simpledungeonadventure.SaveFile

@Database (entities = [SaveFile::class], version = 1)
abstract class SaveDatabase : RoomDatabase() {
}