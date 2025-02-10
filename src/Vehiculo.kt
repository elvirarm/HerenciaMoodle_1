open class Vehiculo (val marca: String, val modelo: String, val capacidadCombustible: Int) {

    open fun mostrarInformacion(vehiculo:Vehiculo){
        return println(vehiculo)
    }

    override fun toString(): String {
        return "Vehículo $marca, modelo $modelo, capacidad de combustible: $capacidadCombustible, tiene ${calcularAutonomia()} km de autonomía"
    }

    open fun calcularAutonomia() = capacidadCombustible

    }





