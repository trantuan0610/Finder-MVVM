package finder.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import finder.di.viewmodel.ViewModelFactory
import finder.di.viewmodel.ViewModelKey
import finder.ui.choselogin.ChoseLoginViewModel
import finder.ui.home.MainFragmentViewModel
import finder.ui.home.chat.ChatViewModel
import finder.ui.home.home.HomeViewModel
import finder.ui.home.seelike.SeeLikeViewModel
import finder.ui.home.more.MoreViewModel
import finder.ui.home.more.profile.ProfileViewModel
import finder.ui.home.more.setting.SettingViewModel
import finder.ui.login_with_email.LoginViewModel
import finder.ui.main.MainViewModel
import finder.ui.splash.SplashViewModel

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun mainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    internal abstract fun splashViewModel(viewModel: SplashViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainFragmentViewModel::class)
    internal abstract fun mainFragmentViewModel(viewModel: MainFragmentViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    internal abstract fun loginViewModel(viewModel: LoginViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ChoseLoginViewModel::class)
    internal abstract fun choseLoginViewModel(viewModel: ChoseLoginViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    internal abstract fun homeViewModel(viewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ChatViewModel::class)
    internal abstract fun chatViewModel(viewModel: ChatViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SeeLikeViewModel::class)
    internal abstract fun seeLikeViewModel(viewModel: SeeLikeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MoreViewModel::class)
    internal abstract fun moreViewModel(viewModel: MoreViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    internal abstract fun profileViewModel(viewModel: ProfileViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SettingViewModel::class)
    internal abstract fun settingViewModel(viewModel: SettingViewModel): ViewModel




}