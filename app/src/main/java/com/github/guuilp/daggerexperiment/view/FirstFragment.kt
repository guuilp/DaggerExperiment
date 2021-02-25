package com.github.guuilp.daggerexperiment.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.github.guuilp.daggerexperiment.R
import com.github.guuilp.daggerexperiment.databinding.FirstFragmentBinding
import com.github.guuilp.daggerexperiment.presentation.FirstViewModel
import javax.inject.Inject

class FirstFragment @Inject constructor(
    private val viewModelFactory: ViewModelProvider.Factory
) : Fragment() {

    private val viewModel by viewModels<FirstViewModel> { viewModelFactory }
    private var _binding: FirstFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FirstFragmentBinding.inflate(inflater, container, false).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("FUN_CALLED", "FirstFragment.onViewCreated")

        viewModel.exampleFunction()

        binding.goToNextFragment.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, SecondFragment::class.java, null)
                .addToBackStack(SecondFragment::class.simpleName)
                .commit()
        }
    }
}