fun main() {

    /*
    Quando conseguimos ter dois métodos ou mais (com o mesmo nome, ou seja, é uma mesma
    instrução computacional) fazendo funções diferentes.

    Sobrecarga de Metódos - Que são metódos com o mesmo nome, mas podem ter parametros
    diferentes. Sempre acontece em tempo de compilação.

    Sobrescrita de Métodos - Literalmente sobrescrever todas as instruções de um método
    já existente (através de métodos de uma classe pai).
     */

    soma(1.5, 5.4)
}

fun soma(num1: Int, num2: Int) : Int{
    return num1 + num2
}

fun soma(num1: Double, num2: Double): Double{
    println("Soma com doubles!")
    return num1 + num2
}