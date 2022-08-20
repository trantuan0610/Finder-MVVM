package finder.util

import android.view.View
import finder.listener.OnSigleClickListener

fun View.setOnSingClickListener(onClick: (View) -> Unit) {
    setOnClickListener(object : OnSigleClickListener() {
        override fun onSingleClick(view: View) {
            onClick.invoke(view)
        }
    })
}