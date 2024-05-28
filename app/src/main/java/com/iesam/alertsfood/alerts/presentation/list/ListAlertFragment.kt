package com.iesam.alertsfood.alerts.presentation.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.iesam.alertsfood.alerts.data.AlertDataRepository
import com.iesam.alertsfood.alerts.domain.GetAlertsUseCase
import com.iesam.alertsfood.alerts.presentation.list.adapter.AlertItemAdapter
import com.iesam.alertsfood.databinding.ListAlertFragmentBinding

class ListAlertFragment: Fragment() {

    private var _binding : ListAlertFragmentBinding?=null
    val binding get()= _binding!!
    private val itemAdapter = AlertItemAdapter()
    private val viewModel = ListAlertViewModel(
        GetAlertsUseCase(
            AlertDataRepository(requireContext())
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=ListAlertFragmentBinding().inflate()
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpView()
        viewModel.loadAlerts()
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}