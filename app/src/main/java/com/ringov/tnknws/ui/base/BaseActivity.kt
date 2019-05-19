package com.ringov.tnknws.ui.base

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import com.ringov.tnknws.ui.Screen

abstract class BaseActivity : AppCompatActivity() {

    @IdRes
    protected abstract fun containerLayoutId(): Int

    fun openScreen(screen: Screen) {
        val fragment = screen.create()
        supportFragmentManager.beginTransaction()
            .replace(containerLayoutId(), fragment, fragment.javaClass.name).commit()
    }
}