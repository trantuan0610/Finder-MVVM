package finder.ui.choselogin


import androidx.navigation.fragment.findNavController
import com.tuantd.finder_mvvm.R
import com.tuantd.finder_mvvm.databinding.FragmentChoseLoginBinding
import finder.ui.base.BaseFragment

class ChoseLoginFragment : BaseFragment<FragmentChoseLoginBinding, ChoseLoginViewModel>()  {
    override fun layoutRes(): Int = R.layout.fragment_chose_login

    override fun viewModelClass(): Class<ChoseLoginViewModel> = ChoseLoginViewModel::class.java

    override fun initView() {
        binding.tvLoginPhoneEmail.setOnClickListener{
            findNavController().navigate(R.id.action_choseLoginFragment_to_loginEmailFragment)
        }

    }



}