/**
 * <h1> Laboratorio #2 </h1>
 * <h2> Calculadora </h2>
 *
 * Esta será la calculadora para hacer todas nuestras operaciones
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

import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class Calculadora {

    // --> Atributos
    val tvEntrada:TextView
    val tvSalida:TextView

    // --> Construcutor
    constructor(tvEntrada:TextView, tvSalida:TextView) {
        this.tvEntrada = tvEntrada
        this.tvSalida = tvSalida
    }

    // --> Métodos
    public fun agregarCaracteres(operando: Boolean, comando: String){
        if(operando){
            tvSalida.text = ""
            tvEntrada.append(comando)
        }else{
            tvEntrada.append(tvSalida.text)
            tvEntrada.append(comando)
            tvSalida.text = ""
        }
    }

    public fun limpiar(){
        tvEntrada.text = ""
        tvSalida.text = ""
    }

    public fun calcularNumeros(){

        try {

            // Vamos a depender de la siguiente dependencia
            // 'net.objecthunter:exp4j:0.4.8' (Se encuentra en build.gradle(:app)
            val entrada = ExpressionBuilder(tvEntrada.text.toString()).build()
            val salida = entrada.evaluate()
            val salidaLong = salida.toLong()

            if(salida == salidaLong.toDouble()){
                tvSalida.text = salidaLong.toString()
            } else{
                tvSalida.text = salida.toString()
            }

        }catch (e:Exception){
            // Toast.makeText(this@Calculadora, e.message, Toast.LENGTH_SHORT).show()
        }

    }
}