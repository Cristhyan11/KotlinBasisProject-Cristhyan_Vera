package edu.unicatolica.kotlin
import kotlin.math.pow
import kotlin.random.Random
import kotlin.math.max
import kotlin.math.min

fun calcularNota(nota: Int): Int? {
    val description = when {
        nota > 5 -> "está fuera del rango de nota (0 a 5)"
        nota < 0 -> "la nota es negativa"
        else -> "Nota valida"
    }

    println("Nota ingresada: $nota -> $description")

    // Si la nota no es válida devolvemos null
    return if (nota in 0..5) nota else null
}

fun promedioFinal(nota1: Int, nota2: Int, nota3: Int) {
    val n1 = calcularNota(nota1)
    val n2 = calcularNota(nota2)
    val n3 = calcularNota(nota3)

    if (n1 == null || n2 == null || n3 == null) {
        println("⚠️  Error: Ingrese correctamente las notas (0 a 5)")
    } else {
        val promedio = (n1 + n2 + n3) / 3.0
        println("✅ Promedio final: $promedio")
    }
}

fun main() {
    val materia1 = 5
    val materia2 = 3
    val materia3 = 5

    promedioFinal(materia1, materia2, materia3)
}
