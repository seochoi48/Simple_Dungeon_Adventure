package com.example.simpledungeonadventure.Story

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.simpledungeonadventure.MainActivity
import com.example.simpledungeonadventure.R



class Scene3North : Fragment() {
    private lateinit var northbutton:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_scene3_north, container, false)
        // Inflate the layout for this fragment
        northbutton = view.findViewById(R.id.North)
        northbutton.setOnClickListener {
            (activity as MainActivity)!!.gotoFragment(Scene4North())
        }
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                Scene3North()
    }
}