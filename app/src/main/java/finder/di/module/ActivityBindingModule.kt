package finder.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import finder.ui.choselogin.ChoseLoginFragment
import finder.ui.home.MainFragment
import finder.ui.home.chat.ChatFragment
import finder.ui.home.home.HomeFragment
import finder.ui.home.seelike.SeeLikeFragment
import finder.ui.home.more.MoreFragment
import finder.ui.home.more.profile.ProfileFragment
import finder.ui.home.more.setting.SettingFragment
import finder.ui.login_with_email.LoginEmailFragment
import finder.ui.main.MainActivity
import finder.ui.splash.SplashFragment

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun bindSplashFragment(): SplashFragment

    @ContributesAndroidInjector
    abstract fun bindMainFragment(): MainFragment

    @ContributesAndroidInjector
    abstract fun bindLoginFragment(): LoginEmailFragment

    @ContributesAndroidInjector
    abstract fun bindChoseLoginFragment(): ChoseLoginFragment

    @ContributesAndroidInjector
    abstract fun bindHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun bindChatFragment(): ChatFragment

    @ContributesAndroidInjector
    abstract fun bindMoreFragment(): MoreFragment

    @ContributesAndroidInjector
    abstract fun bindSeeLikeFragment(): SeeLikeFragment

    @ContributesAndroidInjector
    abstract fun bindProfileFragment(): ProfileFragment

    @ContributesAndroidInjector
    abstract fun bindSettingFragment(): SettingFragment

}