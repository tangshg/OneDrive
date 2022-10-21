package com.tangshg.onedrive

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.tangshg.onedrive.databinding.FragmentLeftBinding

class LeftFragment: Fragment() {

    /*private Context mContext;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext = getActivity();
    }

     */

/* var mContext : Context = TODO()
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    this.mContext = requireActivity()
}

 */

    override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    val binding = FragmentLeftBinding.inflate(inflater,container,false)

    binding.leftFragButton.setOnClickListener{
        Toast.makeText(requireActivity(),"button",Toast.LENGTH_SHORT).show()
    }

    return binding.root
    //相当与 return inflater.inflate(R.layout.fragment_left,container,false)
    //inflater.inflate 和 inflater.inflate 为何需要的参数不同
}


}