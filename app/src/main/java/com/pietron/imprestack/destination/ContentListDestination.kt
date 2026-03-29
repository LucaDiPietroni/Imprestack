package com.pietron.imprestack.destination

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

/**
 * Displays a list of views representing works.
 * Intended for both experienced and on target ones.
 *
 * @param message temporary placeholder describing the current build progress
 */
@Composable
fun ContentListDestination(message: String) {
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = message,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
    }
}