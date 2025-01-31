
 class Persona(
    var nombre: String?,
    var peso: Double,
    var altura: Double
) {

    val imc: Double
        get() = peso / (altura * altura)


    constructor(peso: Double, altura: Double) : this(null, peso, altura)


    override fun toString(): String {
        return "Nombre: $nombre, Peso: $peso kg, Altura: $altura m, IMC: ${"%.2f".format(imc)}"
    }

     override fun equals(other: Any?): Boolean {
         if (this === other) return true
         if (other == null) return false
         other as Persona
         return peso == other.peso && altura == other.altura
     }

     override fun hashCode(): Int {
        return (peso * 31 + altura).toInt()
    }
}


