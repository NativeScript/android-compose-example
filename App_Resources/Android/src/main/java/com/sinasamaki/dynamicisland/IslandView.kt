package com.sinasamaki.dynamicisland

import android.os.Bundle
import android.content.Context
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.ComposeView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.sinasamaki.dynamicisland.ui.theme.DynamicIslandTheme

class IslandView {
    fun generateComposeView(view: ComposeView): ComposeView {
        return view.apply {
            setContent {
                DynamicIslandTheme {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        App()
                    }
                }
            }
        }
    }

    fun updateData(value: Map<Any, Any>) {
    }
    var onEvent: ((String) -> Unit)? = null

}