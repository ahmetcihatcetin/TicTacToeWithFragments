package com.example.tictactoefragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.tictactoefragments.databinding.FragmentNavButtonsBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NavButtons.newInstance] factory method to
 * create an instance of this fragment.
 */



class NavButtons : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentNavButtonsBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentNavButtonsBinding.inflate(inflater,container,false)
        val view = binding.root

        binding.buttonLeft.setOnClickListener(){
            Toast.makeText(context,"Left button has been pressed",Toast.LENGTH_SHORT).show()
        }

        binding.buttonUp.setOnClickListener(){
            Toast.makeText(context,"Up button has been pressed",Toast.LENGTH_SHORT).show()
        }

        binding.buttonRight.setOnClickListener(){
            Toast.makeText(context,"Right button has been pressed",Toast.LENGTH_SHORT).show()
        }

        binding.buttonDown.setOnClickListener(){
            Toast.makeText(context,"Down button has been pressed",Toast.LENGTH_SHORT).show()
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NavButtons.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NavButtons().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}