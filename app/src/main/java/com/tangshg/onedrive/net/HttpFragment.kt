package com.tangshg.onedrive.net

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tangshg.onedrive.R
import com.tangshg.onedrive.databinding.FragmentHttpBinding

/**
 * A simple [Fragment] subclass.
 * Use the [HttpFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HttpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHttpBinding.inflate(inflater)

        // Inflate the layout for this fragment
        return binding.root
    }

}