package kz.just_code.fragments_practice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController
import kz.just_code.fragments_practice.base.BaseFragment
import kz.just_code.fragments_practice.databinding.FragmentMainBinding

class MainFragment: BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate){

    override fun onBindView() {
        super.onBindView()
        binding.titleView.setOnClickListener{
            //  navigate(SecondFragment().javaClass)
//            requireActivity().supportFragmentManager.commit {
//                add(R.id.container, SecondFragment())
//            }
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToSecondFragment("Hello"))
        }
    }
}