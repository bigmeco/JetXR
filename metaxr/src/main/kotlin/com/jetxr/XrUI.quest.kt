package com.jetxr

import androidx.compose.runtime.Composable

@Composable
actual fun XrSubspace(content: @Composable () -> Unit) {
    // Replace with SpatialLayout or Meta subspace
    content()
}

@Composable
actual fun XrPanel(content: @Composable () -> Unit) {
    content()
}

@Composable
actual fun XrText(text: String) {
    // Placeholder for Meta SDK spatial text
}

@Composable
actual fun XrButton(onClick: () -> Unit, content: @Composable () -> Unit) {
    // Placeholder for Meta SDK spatial button
}
