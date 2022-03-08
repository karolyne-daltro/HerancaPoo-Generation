package ExercicioHerancaPoo

import abstractClasses.Animal

class Cavalo (nome: String, idade: Int) : Animal(nome, idade){

    override fun emitirSom() {
       println("Ihiiii")
    }
    fun subirEmArvores(){
        println("Correr igual o cavalo.")
}