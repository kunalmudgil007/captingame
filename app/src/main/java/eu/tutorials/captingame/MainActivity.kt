package eu.tutorials.captingame

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import eu.tutorials.captingame.ui.theme.CaptinGameTheme
import kotlin.random.Random
import androidx.compose.runtime.remember as remember1



import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptinGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptinGame()


                }
            }
        }
    }
}

@Composable
fun CaptinGame() {


    val treasuresFound = remember { mutableStateOf(0) }
 //  val treasuresFound by remember { mutableStateOf(0) }   //use of by keyword (to direct call value)
    val direction = remember { mutableStateOf("North") }
    val stromOrTreasures= remember { mutableStateOf("") }





            @Composable
            fun MyImage() {
                val image = painterResource(R.drawable.img_1)

                Image(
                    painter = image,
                    contentDescription = "Captin Game"
                )
            }



    MyImage()


    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)





    {
        Text(text = "TreasuresFound:${treasuresFound.value}",color = Color.Red,
            fontSize = 32.sp  )

       // Text(text = "TreasuresFound:${treasuresFound}") //use of by keyword (to direct call value)
        Text(text = "Current Direction:${direction.value}",color = Color.Red,
            fontSize = 32.sp)
        Text(text =  "${stromOrTreasures.value}",color = Color.Red,
            fontSize = 32.sp)





        Button(onClick = {
            direction.value = "North"

            if (Random.nextBoolean()) {
                treasuresFound.value += 1
                stromOrTreasures.value = "Found a Treasures!"
            } else {
                stromOrTreasures.value =  "Strom Ahead!!!"
            }


        })

        {
            Text(text = "Sail North")
        }


        Spacer(modifier=Modifier.height(64.dp)) // space


        Row {Button(onClick = { direction.value="West"

            if (Random.nextBoolean()){
                treasuresFound.value==+1
                stromOrTreasures.value="Found a Treasures!"
            }
            else{ stromOrTreasures.value =  "Strom Ahead!!!"}

        })
        {
            Text(text = "Sail West")
        }

            Spacer(modifier=Modifier.width(64.dp)) // space
           // modifier=Modifier.padding(100.dp)          // padding

            Button(onClick = { direction.value="East"

                if (Random.nextBoolean()){
                    treasuresFound.value==+1
                    stromOrTreasures.value="Found a Treasures!"
                }
                else{ stromOrTreasures.value =  "Strom Ahead!!!"}

            }) {
                Text(text = "Sail East")
            }

        }

        Spacer(modifier=Modifier.height(64.dp)) // space

        Button(onClick = { direction.value="South"

            if (Random.nextBoolean()){
                treasuresFound.value==+1
                stromOrTreasures.value="Found a Treasures!"
            }
            else{ stromOrTreasures.value =  "Strom Ahead!!!"}

        }) {
            Text(text = "Sail South")
        }

    }



    }

