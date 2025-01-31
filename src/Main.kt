
fun main() {

    val persona1 = Persona(70.0, 1.75)
    val persona2 = Persona("Carlos", 80.0, 1.80)
    val persona3 = Persona("Ana", 60.0, 1.65)

    println(persona1)
    println(persona2)
    println(persona3)

    println("Introduce el nombre para la persona 1:")
    var nuevoNombre = readLine().orEmpty()
    while (nuevoNombre.isBlank()) {
        println("El nombre no puede estar vacío. Por favor, ingresa un nombre:")
        nuevoNombre = readLine().orEmpty()
    }

    persona1.nombre = nuevoNombre
    println("Persona 1 modificada: $persona1")

    println("Persona 3 (antes de modificar la altura):")
    println("Peso: ${persona3.peso} kg, Altura: ${persona3.altura} m, IMC: ${"%.2f".format(persona3.imc)}")

    persona3.altura = 1.80
    println("Persona 3 (después de modificar la altura):")
    println("Peso: ${persona3.peso} kg, Altura: ${persona3.altura} m, IMC: ${"%.2f".format(persona3.imc)}")

    persona2.altura = persona3.altura

    println("Persona 2 modificada: $persona2")
    println("Persona 3 modificada: $persona3")

    val sonIguales = persona2 == persona3
    println("¿Son iguales la persona 2 y la persona 3? $sonIguales")
}

