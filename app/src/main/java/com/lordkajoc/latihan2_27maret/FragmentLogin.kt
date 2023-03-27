package com.lordkajoc.latihan2_27maret

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lordkajoc.latihan2_27maret.databinding.FragmentHomeBinding
import com.lordkajoc.latihan2_27maret.databinding.FragmentLoginBinding


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentLogin.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentLogin : Fragment() {
    lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            val usernamenya = binding.etUsernamelogin.text.toString()
            val bundle = Bundle()
            bundle.putString("USERNAME", usernamenya)
            findNavController().navigate(R.id.action_fragmentLogin_to_fragmentHome, bundle)
        }

        binding.tvDaftarlogin.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentLogin_to_fragmentRegister)
        }
    }
}