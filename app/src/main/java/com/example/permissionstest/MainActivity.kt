package com.example.permissionstest

import android.Manifest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.accompanist.permissions.ExperimentalPermissionsApi

@ExperimentalPermissionsApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            RequestPermission(permission = Manifest.permission.READ_CONTACTS)
            RequestMultiplePermissions(
                permissions = listOf(
                    Manifest.permission.READ_CONTACTS,
                    Manifest.permission.CAMERA
                )
            )
        }
    }
}