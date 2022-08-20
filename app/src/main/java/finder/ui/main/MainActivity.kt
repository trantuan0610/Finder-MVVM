package finder.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tuantd.finder_mvvm.R
import com.tuantd.finder_mvvm.databinding.ActivityMainBinding
import finder.ui.base.BaseActivity

class MainActivity :  BaseActivity<ActivityMainBinding, MainViewModel>() {
    override fun layoutRes(): Int = R.layout.activity_main

    override fun viewModelClass(): Class<MainViewModel> = MainViewModel::class.java

    override fun initView() {
    }
}