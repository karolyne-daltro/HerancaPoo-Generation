package interfacess

/*Toda interface por ser aquele que vai gerenciar a regra de negocios das classes
filhas e não podem conter atributos com valores iniciais, ela não pode ter um construtor.*/

interface Trabalhador {
    val nome: String
    var pisoSalario: Double
    var bonus: Double
    var salario: Double

    fun calcularSalario()


}