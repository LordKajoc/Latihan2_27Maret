package com.lordkajoc.latihan2_27maret

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lordkajoc.latihan2_27maret.databinding.FragmentHomeBinding
import com.lordkajoc.latihan2_27maret.databinding.FragmentProfileBinding

class FragmentProfile : Fragment() {
    lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getUsernameprof = arguments?.getString("USERNAME")
        binding.textView.text = getUsernameprof

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentProfile_to_fragmentLogin)
        }
    }
}