package heranca

class Funcionario (nome: String, idade: Int, cpf: String,

) : Pessoa(nome, idade, cpf){
    var salario = 0.0

    fun exibirSalario(){

         println("O funcionario $nome atualmente ganha o $salario de salário.")
        }
    }

