package com.folksable.cfm

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun Offer() {
   Column() {
       Text(text = "My Title")
       Text(text = "My Description")
   } 
}