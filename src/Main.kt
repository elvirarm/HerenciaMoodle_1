//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val moto1 = Motocicleta("Vespa", "Vespa2", 20, 5)
    moto1.calcularAutonomia()
    println(moto1)


    val vehiculo1 = Vehiculo("Vespa", "Vespa2", 20)
    vehiculo1.calcularAutonomia()
    println(vehiculo1)

    val automovil1 = Automovil("Vespa", "Vespa2", 20, "deportivo")
    automovil1.calcularAutonomia()
    println(automovil1)
}