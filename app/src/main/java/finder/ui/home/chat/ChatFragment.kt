package finder.ui.home.chat


import com.tuantd.finder_mvvm.R
import com.tuantd.finder_mvvm.databinding.FragmentChatBinding
import finder.ui.base.BaseFragment

class ChatFragment : BaseFragment<FragmentChatBinding, ChatViewModel>()  {
    override fun layoutRes(): Int = R.layout.fragment_chat

    override fun viewModelClass(): Class<ChatViewModel> = ChatViewModel::class.java
    override fun initView() {

    }



}