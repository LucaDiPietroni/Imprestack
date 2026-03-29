package com.pietron.imprestack

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Defines available navigation destinations.
 *
 * @param label the destination's display name
 * @param icon vector icon representing the destination
 */
enum class AppDestinations(
    val label: String,
    val icon: ImageVector,
) {
    ON_TARGET("On target", Icons.Default.Search),
    EXPERIENCED("Experienced", Icons.Default.CheckCircle),
    SETTINGS("Settings", Icons.Default.Settings),
}