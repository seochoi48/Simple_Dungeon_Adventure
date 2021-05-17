package com.example.simpledungeonadventure
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.simpledungeonadventure.Story.Scene1


private const val TAG = "DungeonMenu"
class DungeonMenu : androidx.fragment.app.Fragment() {
    lateinit var startButton: Button
    lateinit var loadButton: Button
    lateinit var characterButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(com.example.simpledungeonadventure.R.layout.fragment_dungeon_menu, container, false)
        startButton = view.findViewById(com.example.simpledungeonadventure.R.id.StartButton)
        loadButton = view.findViewById(com.example.simpledungeonadventure.R.id.LoadButton)
        characterButton = view.findViewById(com.example.simpledungeonadventure.R.id.CharacterSelect)
        startButton.setOnClickListener {
           (activity as MainActivity)!!.gotoFragment(Scene1())
        }
        loadButton.setOnClickListener {
            (activity as MainActivity)!!.loadSavedPlace()
        }
        characterButton.setOnClickListener {
            
        }
        return view
    }


    companion object {

        @JvmStatic
        fun newInstance() : DungeonMenu {
            return DungeonMenu()
        }

    }

}