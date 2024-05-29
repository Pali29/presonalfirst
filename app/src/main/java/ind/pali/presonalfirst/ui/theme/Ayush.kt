package ind.pali.presonalfirst.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Ayush(toSecond:()->Unit)
{
    val custom = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontSize = 50.sp,
        color = Color(0xFFF0C4A2)
    )


    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF9DEBE3)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .padding(16.dp)
                .background(color = Color.Black, shape = CircleShape)
        ) {
            Text(text = "  Calculator  ", style = custom)
        }
        Spacer(modifier = Modifier.height(64.dp))
        ElevatedButton(onClick = {toSecond()}) {
            Text("Play")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun AyushPreview() {
    Ayush({})
}
