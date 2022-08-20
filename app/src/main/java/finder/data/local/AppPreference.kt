package finder.data.local

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppPreference @Inject constructor(private val preferences: SharedPreferences){
    fun saveName(name: String) {
        preferences.edit().putString("name", name).apply()
    }

    fun getName(): String {
        return preferences.getString("name", "Nguyễn Đức Dũng") ?: ""
    }
}