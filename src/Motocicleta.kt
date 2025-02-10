class Motocicleta(marca: String, modelo: String, capacidadCombustible: Int, val cilindrada: Int):Vehiculo(marca, modelo, capacidadCombustible) {

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }

}