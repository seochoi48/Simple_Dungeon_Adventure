package com.example.simpledungeonadventure.Story

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.simpledungeonadventure.MainActivity
import com.example.simpledungeonadventure.R

class Scene4North : Fragment() {
    private lateinit var northButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_scene4_north, container, false)
        northButton = view.findViewById(R.id.North)
        northButton.setOnClickListener {
            (activity as MainActivity)!!.gotoFragment(Scene5_North())
        }
        return view
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Scene4North()
    }
}