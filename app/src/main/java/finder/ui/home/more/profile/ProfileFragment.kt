package finder.ui.home.more.profile

import com.tuantd.finder_mvvm.R
import com.tuantd.finder_mvvm.databinding.FragmentProfileBinding
import finder.ui.base.BaseFragment

class ProfileFragment : BaseFragment<FragmentProfileBinding,ProfileViewModel>(){
    override fun layoutRes(): Int = R.layout.fragment_profile
    override fun viewModelClass(): Class<ProfileViewModel> = ProfileViewModel::class.java

    override fun initView() {

    }
}