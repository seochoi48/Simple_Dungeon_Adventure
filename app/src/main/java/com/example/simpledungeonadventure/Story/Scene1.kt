package com.example.simpledungeonadventure.Story

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.simpledungeonadventure.MainActivity
import com.example.simpledungeonadventure.R

private const val TAG = "SCENE1"
class Scene1 : Fragment() {
    lateinit var SaveButton: Button
    private lateinit var northButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_scene1, container, false)
        val fragmentID:Int= R.id.scene1
        val findViewWithTag = view.findViewWithTag<View>("SCENE1")
        SaveButton = view.findViewById(R.id.Save)
        val string = resources.getResourceName(R.layout.fragment_scene1)
         SaveButton.setOnClickListener {
             (activity as MainActivity?)!!.saveCurrentPlace(string)
         }
        northButton = view.findViewById(R.id.North)
        northButton.setOnClickListener {
            (activity as MainActivity)!!.gotoFragment(Scene2North())
        }
        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

    }

    companion object {

        fun newInstance() =
            Scene1()
//        fun newInstance(param1: String, param2: String) =
//                Scene1().apply {
//                    arguments = Bundle().apply {
//                        putString(ARG_PARAM1, param1)
//                        putString(ARG_PARAM2, param2)
//                    }
//                }
    }
}