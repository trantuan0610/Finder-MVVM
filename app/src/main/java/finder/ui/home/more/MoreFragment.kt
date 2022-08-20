package finder.ui.home.more

import androidx.navigation.fragment.findNavController
import com.tuantd.finder_mvvm.R
import com.tuantd.finder_mvvm.databinding.FragmentMoreBinding
import finder.ui.base.BaseFragment

class MoreFragment : BaseFragment<FragmentMoreBinding, MoreViewModel>()  {
    override fun layoutRes(): Int = R.layout.fragment_more

    override fun viewModelClass(): Class<MoreViewModel> = MoreViewModel::class.java
    override fun initView() {
        binding.imgSettings.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_settingFragment)
        }

    }


}