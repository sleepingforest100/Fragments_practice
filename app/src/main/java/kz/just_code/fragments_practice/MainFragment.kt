package kz.just_code.fragments_practice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController
import kz.just_code.fragments_practice.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main){
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.titleView.setOnClickListener{
          //  navigate(SecondFragment().javaClass)
//            requireActivity().supportFragmentManager.commit {
//                add(R.id.container, SecondFragment())
//            }
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToSecondFragment("Hello"))
        }
    }
}

enum class ArgumentKey {
    NAME
}
