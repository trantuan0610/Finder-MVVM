package finder.ui.home.seelike

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tuantd.finder_mvvm.R
import com.tuantd.finder_mvvm.databinding.FragmentHomeBinding
import com.tuantd.finder_mvvm.databinding.FragmentSeeLikeBinding
import finder.ui.base.BaseFragment
import finder.ui.home.home.HomeViewModel

class SeeLikeFragment : BaseFragment<FragmentSeeLikeBinding, SeeLikeViewModel>()  {
    override fun layoutRes(): Int = R.layout.fragment_see_like

    override fun viewModelClass(): Class<SeeLikeViewModel> = SeeLikeViewModel::class.java
    override fun initView() {

    }



}