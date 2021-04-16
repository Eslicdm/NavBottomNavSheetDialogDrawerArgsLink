package com.eslirodrigues.navbottomnavsheetdialogdrawerargslink

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.eslirodrigues.navbottomnavsheetdialogdrawerargslink.databinding.FragmentCustomDialogBinding

class CustomDialogFragment : DialogFragment() {

    private var _binding: FragmentCustomDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCustomDialogBinding.inflate(inflater, container, false)

        binding.buttonSubmit.setOnClickListener {
            val selectId = binding.radioGroupRate.checkedRadioButtonId
            val radio = binding.root.findViewById<RadioButton>(selectId)

            val ratingResult = radio.text.toString()

            findNavController().navigate(CustomDialogFragmentDirections.actionCustomDialogFragmentToSecondFragment(ratingResult))

            dismiss()
        }

        binding.buttonCancel.setOnClickListener {
            dismiss()
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}