open class Vehiculo (val marca: String, val modelo: String, val capacidadCombustible: Int) {

    open fun mostrarInformacion(vehiculo:Vehiculo){
        return println(vehiculo)
    }

    override fun toString(): String {
        return "Vehículo $marca, modelo $modelo, capacidad de combustible: $capacidadCombustible, tiene ${calcularAutonomia()} km de autonomía"
    }

    open fun calcularAutonomia(km: Int = 10) = km * capacidadCombustible
    }

class Automovil(marca: String, modelo: String, capacidadCombustible: Int, val tipo: String):Vehiculo(marca, modelo, capacidadCombustible){

    override fun calcularAutonomia(km: Int): Int {
        return super.calcularAutonomia(km) + 100
    }
}

class Motocicleta(marca: String, modelo: String, capacidadCombustible: Int, val cilindrada: Int):Vehiculo(marca, modelo, capacidadCombustible){
    override fun calcularAutonomia(km: Int): Int {
        return super.calcularAutonomia(km) - 10
    }
}

