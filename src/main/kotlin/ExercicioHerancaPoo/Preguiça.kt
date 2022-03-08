package ExercicioHerancaPoo

import abstractClasses.Animal

class Preguica(nome: String, idade: Int) : Animal(nome, idade){

    override fun emitirSom() {
        println("Ehhh")
    }
    fun subirEmArvores(){
        println("Subir em ávores igual a preguiça.")
    }
}