package com.android.compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            Column(
                modifier = Modifier
                    .background(
                        color = Color(
                            0xFFF2F2F2
                        )
                    )
                    .fillMaxHeight()
                    .verticalScroll(rememberScrollState())
            ) {
                Image(
                    painter = painterResource(id = R.drawable.jetpack_compose_logo),
                    contentDescription = "",
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Image Painter",
                        fontSize = 26.sp,
                        color = Color(0XFF85bb65)

                    )
                    Text(
                        text = "$ 12.4",
                        fontSize = 12.sp,
                        color = Color(0XFF85bb65),
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = "This is Demo of Image",
                    fontSize = 16.sp,
                    color = Color(0XFF85bb65),
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier.padding(10.dp))

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text(text = "Click me")
                }


            }

        }
    }


}
