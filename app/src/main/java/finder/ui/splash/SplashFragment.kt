package finder.ui.splash

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.navigation.fragment.findNavController

import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tuantd.finder_mvvm.R
import com.tuantd.finder_mvvm.databinding.FragmentSplashBinding
import finder.ui.base.BaseFragment

class SplashFragment : BaseFragment<FragmentSplashBinding, SplashViewModel>() {
    override fun layoutRes(): Int = R.layout.fragment_splash

    override fun viewModelClass(): Class<SplashViewModel> = SplashViewModel::class.java

    override fun initView() {

        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_choseLoginFragment)
        }, 1000)
    }



}