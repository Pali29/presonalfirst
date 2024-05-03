package ind.pali.presonalfirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
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
import ind.pali.presonalfirst.ui.theme.PresonalfirstTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresonalfirstTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFF5E6C4)
                ) {
                    Ayush()
                }
            }
        }
    }
}

@Composable
fun Ayush()
{
    val custom = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontSize = 50.sp,
        color = Color(0xFFF0C4A2)
    )


    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF5E6C4)),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row{
            Box (
                modifier = Modifier
                    .padding(16.dp)
                    .background(color = Color.Black, shape = CircleShape)
            ){
                Text(text = "  Calculator  ", style = custom)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AyushPreview() {
    Column {
        Ayush()
    }
}