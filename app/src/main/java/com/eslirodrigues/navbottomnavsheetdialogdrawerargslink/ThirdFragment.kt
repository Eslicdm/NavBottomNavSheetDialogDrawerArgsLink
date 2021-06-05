package com.eslirodrigues.navbottomnavsheetdialogdrawerargslink

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.eslirodrigues.navbottomnavsheetdialogdrawerargslink.databinding.FragmentFirstBinding
import com.eslirodrigues.navbottomnavsheetdialogdrawerargslink.databinding.FragmentThirdBinding

class ThirdFragment : Fragment(R.layout.fragment_third) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentThirdBinding.bind(view)

        binding.buttonPreviousThird.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)
        }

        binding.buttonDialogThird.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_customDialogFragment)
        }
    }
}