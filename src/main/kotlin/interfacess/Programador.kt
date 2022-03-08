package interfacess

class Programador(
    override val nome: String,
    override var pisoSalario: Double,
    override var bonus: Double
    var nivel: String
    ) : Trabalhador {
    override var salario = 0.0
    override fun calcularSalario() {
        //salario = pisoSlario + bonus ou
        println("O salário de um programador é ${pisoSalario + bonus}")
    }
}