/**
 * <h1> Laboratorio #2 </h1>
 * <h2> Main Activity 2 </h2>
 *
 * Esta parte estará toda la parte para darle la logica necesaria a la calculadora.
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

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        if(bundle != null){
            val valueA: String = bundle.getString("valueA", "")

            Toast.makeText(this, valueA, Toast.LENGTH_SHORT).show()
        }

        /*
        * Aquí empezaremos con el código para la calculadora
        *
        * Ingrese la dependencia 'kotlin-android-extensions'
        * para que sea más facil llamar todo lo que tendrá este layout
        * */

        // Vamos a instanciar la calculadora
        var calc: Calculadora = Calculadora(tvEntrada, tvSalida)

        // Listeners para los numeros
        btn0.setOnClickListener { calc.agregarCaracteres(true, "0")}
        btn1.setOnClickListener { calc.agregarCaracteres(true, "1")}
        btn2.setOnClickListener { calc.agregarCaracteres(true, "2")}
        btn3.setOnClickListener { calc.agregarCaracteres(true, "3")}
        btn4.setOnClickListener { calc.agregarCaracteres(true, "4")}
        btn5.setOnClickListener { calc.agregarCaracteres(true, "5")}
        btn6.setOnClickListener { calc.agregarCaracteres(true, "6")}
        btn7.setOnClickListener { calc.agregarCaracteres(true, "7")}
        btn8.setOnClickListener { calc.agregarCaracteres(true, "8")}
        btn9.setOnClickListener { calc.agregarCaracteres(true, "9")}

        // Listeners para los operadores
        btnPlus.setOnClickListener { calc.agregarCaracteres(false, "+")}
        btnMinus.setOnClickListener { calc.agregarCaracteres(false, "-")}
        btnMulti.setOnClickListener { calc.agregarCaracteres(false, "*")}
        btnDiv.setOnClickListener { calc.agregarCaracteres(false, "/")}

        // Para limpiar
        btnC.setOnClickListener { calc.limpiar()}

        // Para calcular los numeros
        btnEquals.setOnClickListener { calc.calcularNumeros() }
    }
}