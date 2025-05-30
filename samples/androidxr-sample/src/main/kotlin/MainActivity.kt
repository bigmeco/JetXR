package com.jetxr.androidsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.jetxr.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            XrSubspace {
                XrPanel {
                    XrText("Hello JetXR")
                    XrButton(onClick = { println("Clicked") }) {
                        XrText("Click me")
                    }
                }
            }
        }
    }
}
