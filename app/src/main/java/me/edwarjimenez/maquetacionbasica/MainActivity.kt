package me.edwarjimenez.maquetacionbasica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.edwarjimenez.maquetacionbasica.ui.theme.MaquetacionBasicaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

//@Preview(showSystemUi = true)
@Composable
fun ProductDetailScreen() {
    val purple = Color(0xFF6650A4)
    val red = Color(0xFFB00020)
    val green = Color(0xFF00C853)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.computador),
                contentDescription = "Imagen del producto",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(8.dp))
            )
            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = "Favorito",
                tint = Color.Yellow,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(8.dp)
                    .size(32.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Nombre del Producto",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )


        Text(
            text = "\$99.99",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = green
        )

        Spacer(modifier = Modifier.height(4.dp))


        Text(
            text = "Descripción del producto con detalles importantes, características y beneficios.",
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(modifier = Modifier.height(8.dp))


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = purple),
                modifier = Modifier.weight(1f)
            ) {
                Icon(Icons.Filled.Edit, contentDescription = null, modifier = Modifier.size(16.dp))
                Spacer(Modifier.width(4.dp))
                Text("Editar")
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = red),
                modifier = Modifier.weight(1f)
            ) {
                Icon(Icons.Filled.Delete, contentDescription = null, modifier = Modifier.size(16.dp))
                Spacer(Modifier.width(4.dp))
                Text("Eliminar")
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun ArticleScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        // Imagen ocupa ancho completo
        Image(
            painter = painterResource(id = R.drawable.jetpack),
            contentDescription = "Imagen del artículo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        // Título
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
        )

        // Primer párrafo
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and " +
                    "accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Segundo párrafo
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose " +
                    "functions to say what elements you want and the Compose compiler does the rest. Compose is built " +
                    "around Composable functions. These functions let you define your app's UI programmatically because " +
                    "they let you describe how it should look and provide data dependencies, rather than focus on the " +
                    "process of the UI's construction, such as initializing an element and then attaching it to a parent. " +
                    "To create a Composable function, you add the @Composable annotation to the function name.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
        )
    }
}
