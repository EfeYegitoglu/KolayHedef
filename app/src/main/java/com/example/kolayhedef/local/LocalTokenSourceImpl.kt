package com.example.kolayhedef.local

import android.content.SharedPreferences
import com.example.kolayhedef.Constants.ACCESS_TOKEN
import javax.inject.Inject

class LocalTokenSourceImpl @Inject constructor(
    private val sharedPreferences: SharedPreferences
) : LocalTokenSource {

    override fun saveUserAccessToken(token: String?) {
        val editor = sharedPreferences.edit()
        editor.putString(ACCESS_TOKEN, token)
        editor.apply()
    }

    override fun getUserAccessToken(): String? = sharedPreferences.getString(ACCESS_TOKEN, "")

    override fun deleteUserAccessToken() : Boolean {
        val editor = sharedPreferences.edit()
        editor.remove(ACCESS_TOKEN)
        return editor.commit()
    }
}