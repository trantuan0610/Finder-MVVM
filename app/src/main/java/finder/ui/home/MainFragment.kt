package finder.ui.home
import androidx.fragment.app.Fragment
import com.tuantd.finder_mvvm.R
import com.tuantd.finder_mvvm.databinding.FragmentMainBinding
import finder.ui.base.BaseFragment
import finder.ui.home.chat.ChatFragment
import finder.ui.home.home.HomeFragment
import finder.ui.home.seelike.SeeLikeFragment
import finder.ui.home.more.MoreFragment

class MainFragment : BaseFragment<FragmentMainBinding, MainFragmentViewModel>() {

    companion object {
        const val POSITION_HOME = 0
        const val POSITION_SEELIKE = 1
        const val POSITION_CHAT = 2
        const val POSITION_MORE = 3
    }

    private var listFragment = mutableListOf<Fragment>()
    private var currentPosition = 0

    override fun layoutRes(): Int = R.layout.fragment_main

    override fun viewModelClass(): Class<MainFragmentViewModel> = MainFragmentViewModel::class.java

    override fun initView() {
        listFragment.add(POSITION_HOME, HomeFragment())
        listFragment.add(POSITION_SEELIKE,SeeLikeFragment() )
        listFragment.add(POSITION_CHAT,ChatFragment() )
        listFragment.add(POSITION_MORE, MoreFragment())

        val fragmentTransaction = childFragmentManager.beginTransaction()
        listFragment.forEachIndexed { index, fragment ->
            fragmentTransaction.add(R.id.frame_layout, fragment, fragment.javaClass.simpleName)
            if (index != 0) {
                fragmentTransaction.hide(fragment)
            } else {
                fragmentTransaction.show(fragment)
            }
        }
        fragmentTransaction.commitAllowingStateLoss()
        binding.buttonNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    openTab(POSITION_HOME)
                    return@setOnItemSelectedListener true
                }
                R.id.seeLike -> {
                    openTab(POSITION_SEELIKE)
                    return@setOnItemSelectedListener true
                }
                R.id.chat -> {
                    openTab(POSITION_CHAT)
                    return@setOnItemSelectedListener true
                }
                R.id.more -> {
                    openTab(POSITION_MORE)
                    return@setOnItemSelectedListener true
                }
                else -> {
                    return@setOnItemSelectedListener false
                }
            }
        }
    }


    private fun openTab(position: Int) {
        val fragmentTransaction = childFragmentManager.beginTransaction()
        listFragment.forEachIndexed { index, fragment ->
            if (index == position) {
                fragmentTransaction.show(fragment)
            } else {
                fragmentTransaction.hide(fragment)
            }
        }
        if (position > currentPosition) {
            fragmentTransaction.setCustomAnimations(R.anim.trans_right_in, R.anim.trans_right_in)
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.trans_right_out, R.anim.trans_right_out)
        }
        currentPosition = position
        fragmentTransaction.commitAllowingStateLoss()
    }


}