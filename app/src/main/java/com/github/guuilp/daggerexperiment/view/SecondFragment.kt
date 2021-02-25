package com.github.guuilp.daggerexperiment.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.github.guuilp.daggerexperiment.databinding.SecondFragmentBinding
import com.github.guuilp.daggerexperiment.presentation.SecondViewModel
import javax.inject.Inject

class SecondFragment @Inject constructor(
    private val viewModelFactory: ViewModelProvider.Factory
) : Fragment() {

    private val viewModel by viewModels<SecondViewModel> { viewModelFactory }
    private var _binding: SecondFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = SecondFragmentBinding.inflate(inflater, container, false).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("FUN_CALLED", "SecondFragment.onViewCreated")

        viewModel.exampleFunction()

        binding.goToPreviousFragment.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}