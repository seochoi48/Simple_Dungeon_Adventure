package com.example.simpledungeonadventure

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.replace
import com.example.simpledungeonadventure.Story.Scene2North
import java.util.*
import kotlin.reflect.KClass


private const val  KEY_INDEX =  "index"
class MainActivity : AppCompatActivity() {
//    val file:String = fileName.text.toString()
//    val data: String = fileData.text.toString()
//    val fileOutputStream:FileOutputStream
      private val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val fileName = findViewById<EditText>(R.id.editFile)
//        val fileData = findViewById<EditText>(R.id.editData)
//
//        val btnSave = findViewById<Button>(R.id.btnSave)
//        val btnView = findViewById<Button>(R.id.btnView)

        //inflate fragments
        if(currentFragment == null){
            val fragment = DungeonMenu.newInstance()
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit()
        }
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)

    }


    fun saveCurrentPlace(fileID: String){

        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.apply {
            putString("Fragment_TAG", fileID)
        }.apply()
        Toast.makeText(this,fileID.toString(), Toast.LENGTH_SHORT).show()
        //savedInstanceState.putSerializable("save_Fragment", currentFragment)

    }

    fun loadSavedPlace() {
//        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
//        val savedTAG: String? = sharedPreferences.getString("Fragment_TAG", null)
//        resources.getIdentifier(savedTAG,"layout", packageName)
//        Scene2North.javaClass.`package`
//        val hexFrag = java.lang.Integer.toHexString(savedTAG)
        try{
            val savedFragment: Fragment = Class.forName("com.example.simpledungeonadventure.Story.Scene5_North").newInstance() as Fragment
            gotoFragment(savedFragment)

        } catch (e: ClassNotFoundException) {
            Toast.makeText(this, "Class not found", Toast.LENGTH_SHORT).show()
        }




//        savedFragment?.let {
//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.fragment_container, it)
//                .commit()
//        }
//        Toast.makeText(this, savedTAG.toString(), Toast.LENGTH_LONG).show()

    }

    fun gotoFragment(fragmentDestination: Fragment) {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragmentDestination)
            .commit()
    }
}


