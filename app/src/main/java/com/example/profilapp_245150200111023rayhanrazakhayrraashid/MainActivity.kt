package com.example.profilapp_245150200111023rayhanrazakhayrraashid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilapp_245150200111023rayhanrazakhayrraashid.ui.theme.ProfilApp_245150200111023RayhanRazaKhayrRaashidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfilApp_245150200111023RayhanRazaKhayrRaashidTheme {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp).background(Color.Cyan).fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.identicon),
                        contentDescription = "Foto Profil",
                        modifier = Modifier.size(120.dp).clip(CircleShape).background(Color.White).fillMaxWidth()
                    )
                    Text("Nama: Andi", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Text("NIM: 245150200111023")
                    Text("Mahasiswa Teknik Informatika")
                    Spacer(modifier = Modifier.height(8.dp).background(Color.White).fillMaxWidth())
                    FollowButton()
                }
            }
        }
    }
}
@Composable
fun FollowButton() {
    var isFollowed by remember { mutableStateOf(false) }
    Button(onClick = { isFollowed = !isFollowed }) {
        Text(if (isFollowed) "Unfollow" else "Follow")
    }
}