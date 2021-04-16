package com.eslirodrigues.navbottomnavsheetdialogdrawerargslink

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.eslirodrigues.navbottomnavsheetdialogdrawerargslink.databinding.FragmentFirstBinding
import com.eslirodrigues.navbottomnavsheetdialogdrawerargslink.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        val rate = args.rate
        val deepLinkUser = args.username

        if (rate != null) {
            binding.editTextSecond.setText(rate)
        }
        if (deepLinkUser != null) {
            binding.editTextSecond.setText(deepLinkUser)
        }

        binding.buttonPreviousSecond.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }

        binding.buttonNextSecond.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}