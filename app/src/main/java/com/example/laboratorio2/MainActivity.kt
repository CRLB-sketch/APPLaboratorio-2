/**
 * <h1> Laboratorio #2 </h1>
 * <h2> Main Activity </h2>
 *
 * Esta parte solo esta la parte del boton y hay codigo comentado
 * ya que quise seguir el ritmo del laboratorio recibido
 * (pido disculpas por el desorden)
 *
 * <p>Desarrollo de Plataformas Moviles - Universidad del Valle de Guatemala </p>
 *
 * Creado por:
 * @author Cristian Fernando Laynez Bachez
 * @version 1.0
 * @since 2020-Enero-28
 *
 **/

package com.example.laboratorio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show()

        val btnOpen: Button = findViewById<Button>(R.id.btnOpen)

        btnOpen.setOnClickListener {
            // Toast.makeText(MainActivity.)
            Log.e("LOG","OnClick") // Se ve en el Logcat // Esto es como error porque esta en rojo
            // Log.v("LOG","OnClick") // Se ve en el Logcat // Este es como el default

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valueA", "Valor desde actividad1") // Mandar un valor extra

            startActivity(intent)
        }
    }

    /*override fun onStart() {
        super.onStart()

        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show()
    }*/
}