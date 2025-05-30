package com.jetxr

import androidx.compose.runtime.Composable

@Composable
actual fun XrSubspace(content: @Composable () -> Unit) {
    // Replace with Jetpack XR Subspace()
    content()
}

@Composable
actual fun XrPanel(content: @Composable () -> Unit) {
    content()
}

@Composable
actual fun XrText(text: String) {
    androidx.compose.material3.Text(text)
}

@Composable
actual fun XrButton(onClick: () -> Unit, content: @Composable () -> Unit) {
    androidx.compose.material3.Button(onClick = onClick, content = content)
}
