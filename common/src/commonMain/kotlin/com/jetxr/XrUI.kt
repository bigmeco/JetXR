package com.jetxr

import androidx.compose.runtime.Composable

@Composable
expect fun XrSubspace(content: @Composable () -> Unit)

@Composable
expect fun XrPanel(content: @Composable () -> Unit)

@Composable
expect fun XrText(text: String)

@Composable
expect fun XrButton(onClick: () -> Unit, content: @Composable () -> Unit)
