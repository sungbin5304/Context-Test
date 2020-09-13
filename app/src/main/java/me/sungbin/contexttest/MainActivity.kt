package me.sungbin.contexttest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        log("Application Context: ${ContextTest.appContext}")
        log("Application Context: $applicationContext")

        log("Activity Context: $this")
        log("Activity Context: ${ContextTest.actContext}")
    }
}