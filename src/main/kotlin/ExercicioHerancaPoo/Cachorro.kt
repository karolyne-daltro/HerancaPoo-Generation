package ExercicioHerancaPoo

class Cachorro(nome: String, idade: Int) : Animal(nome, idade) {
    override fun emitirSom() {
        println("Auauau")
    }

    fun correr(){
        println("Correndo como um cachorro!")
    }
}