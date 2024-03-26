package com.staskokoc.servicesmusic.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.staskokoc.servicesmusic.presentation.services.MusicService
import com.staskokoc.servicesmusic.presentation.theme.ServicesMusicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ServicesMusicTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(
                            onClick = {
                                startService(
                                    Intent(
                                        this@MainActivity,
                                        MusicService::class.java
                                    )
                                )
                            }
                        ) {
                            Text(text = "PLAY MUSIC")
                        }
                        Button(
                            onClick = {
                                stopService(
                                    Intent(
                                        this@MainActivity,
                                        MusicService::class.java
                                    )
                                )
                            }
                        ) {
                            Text(text = "STOP MUSIC")
                        }
                    }
                }
            }
        }
    }
}