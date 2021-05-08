package com.example.simpledungeonadventure

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class DungeonMenu : Fragment() {
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
        val view =  inflater.inflate(R.layout.fragment_dungeon_menu, container, false)
        startButton = view.findViewById(R.id.StartButton)
        loadButton = view.findViewById(R.id.LoadButton)
        characterButton = view.findViewById(R.id.CharacterSelect)

        startButton.setOnClickListener {

        }
        loadButton.setOnClickListener {

        }
        characterButton.setOnClickListener {
            
        }
        return view
    }

    companion object {
    }
}