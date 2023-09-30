package com.project.listadetarefascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.project.listadetarefascompose.ui.theme.ListaDeTarefasComposeTheme
import com.project.listadetarefascompose.view.ListaTarefas
import com.project.listadetarefascompose.view.SalvarTarefas

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaDeTarefasComposeTheme {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "listaTarefas"
                ){
                    composable(
                        route = "listaTarefas"
                    ){
                        ListaTarefas(navController)
                    }
                    composable(
                        route = "salvarTarefa"
                    ){
                        SalvarTarefas(navController)
                    }

                }
            }
        }
    }
}

