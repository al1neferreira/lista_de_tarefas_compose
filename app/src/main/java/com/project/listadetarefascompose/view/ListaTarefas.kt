package com.project.listadetarefascompose.view

import android.annotation.SuppressLint
import android.view.RoundedCorner
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.project.listadetarefascompose.R
import com.project.listadetarefascompose.ui.theme.BLACK
import com.project.listadetarefascompose.ui.theme.Purple40
import com.project.listadetarefascompose.ui.theme.Purple80
import com.project.listadetarefascompose.ui.theme.PurpleGrey40
import com.project.listadetarefascompose.ui.theme.WHITE
import com.project.listadetarefascompose.ui.theme.PurpleGrey80 as PurpleGrey80

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListaTarefas(
    navController: NavController
) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Lista de Tarefas",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = WHITE
                    )
                }, colors = TopAppBarDefaults
                    .smallTopAppBarColors(containerColor = Purple40)
            )
        },
        containerColor = contentColorFor(backgroundColor = PurpleGrey80),
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                          navController.navigate("salvarTarefas")
                },
                containerColor = Purple40,
                shape = CircleShape

            ) {
                Image(imageVector = ImageVector
                    .vectorResource(
                        id = R.drawable.ic_add
                    ), contentDescription = "Adicionar tarefas"
                )
            }

        }
    )

    {

    }

}


@Preview(showSystemUi = true)
@Composable
fun ListaTarefasPreview() {
    ListaTarefas(navController = rememberNavController())
}
