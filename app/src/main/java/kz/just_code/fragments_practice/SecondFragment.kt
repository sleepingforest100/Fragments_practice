package kz.just_code.fragments_practice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kz.just_code.fragments_practice.base.BaseFragment
import kz.just_code.fragments_practice.databinding.FragmentMainBinding

class SecondFragment: BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate){
    private val args: SecondFragmentArgs by navArgs()
    override fun onBindView() {
        super.onBindView()
        binding.titleView.text = args.name
    }
}