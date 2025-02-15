package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.activitylifecycle.ui.theme.ActivityLifeCycleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Log message", "onCreate called")
        enableEdgeToEdge()
        setContent {
            ActivityLifeCycleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding -> }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Log message", "OnStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Log message", "On resume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Log message", "On Pause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Log message", "On Stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Log message", "On Destroy called")
    }
}

