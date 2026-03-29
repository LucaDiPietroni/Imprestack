package com.pietron.imprestack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import com.pietron.imprestack.destination.ContentListDestination
import com.pietron.imprestack.destination.SettingsDestination
import com.pietron.imprestack.ui.theme.ImprestackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImprestackTheme {
                ImprestackApp()
            }
        }
    }
}

@PreviewScreenSizes
@Composable
fun ImprestackApp() {
    var currentDestination by rememberSaveable { mutableStateOf(AppDestinations.ON_TARGET) }

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach {
                item(
                    icon = {
                        Icon(
                            imageVector = it.icon,
                            contentDescription = it.label
                        )
                    },
                    label = { Text(it.label) },
                    selected = it == currentDestination,
                    onClick = { currentDestination = it }
                )
            }
        }
    ) {
        when (currentDestination) {
            AppDestinations.ON_TARGET -> ContentListDestination("Section under construction...")
            AppDestinations.EXPERIENCED -> ContentListDestination("List of experienced works is in building!")
            AppDestinations.SETTINGS -> SettingsDestination()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ImprestackTheme {
        // TODO Prepare preview
    }
}