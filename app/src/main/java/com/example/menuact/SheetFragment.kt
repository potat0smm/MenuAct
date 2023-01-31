package com.example.menuact

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.menuact.databinding.BottomSheetBinding
import com.example.menuact.databinding.FragmentSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class SheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentSheetBinding
    private lateinit var taskViewModel: TaskViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = requireActivity()
        taskViewModel = ViewModelProvider(activity).get(TaskViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       binding = FragmentSheetBinding.inflate(inflater, container, false)
        return binding.root
    }
}