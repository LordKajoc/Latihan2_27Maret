package com.lordkajoc.latihan2_27maret

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lordkajoc.latihan2_27maret.databinding.FragmentHomeBinding

class FragmentHome : Fragment() {

    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val getUsername = arguments?.getString("USERNAME")
        binding.tvJudulhome.text = getUsername
        binding.imageView2.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("USERNAME", getUsername)
            findNavController().navigate(R.id.action_fragmentHome_to_fragmentProfile,bundle)
        }
    }
}