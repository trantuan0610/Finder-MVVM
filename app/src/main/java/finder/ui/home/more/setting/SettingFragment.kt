package finder.ui.home.more.setting


import com.tuantd.finder_mvvm.R
import com.tuantd.finder_mvvm.databinding.FragmentSettingBinding
import finder.ui.base.BaseFragment

class SettingFragment :  BaseFragment<FragmentSettingBinding, SettingViewModel>()  {
    override fun layoutRes(): Int = R.layout.fragment_setting

    override fun viewModelClass(): Class<SettingViewModel> = SettingViewModel::class.java
    override fun initView() {

    }


}