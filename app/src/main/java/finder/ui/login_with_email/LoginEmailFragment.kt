package finder.ui.login_with_email

import androidx.navigation.fragment.findNavController
import com.tuantd.finder_mvvm.R
import com.tuantd.finder_mvvm.databinding.FragmentLoginBinding
import finder.ui.base.BaseFragment

class LoginEmailFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>() {
    override fun layoutRes(): Int = R.layout.fragment_login

    override fun viewModelClass(): Class<LoginViewModel> = LoginViewModel::class.java

    override fun initView() {
        binding.mLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginEmailFragment_to_mainFragment)
        }

    }


}