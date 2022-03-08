package abstractClasses

//A palavra reservada abstract indica que a classe que está sendo criada é abstrata

abstract class Animal (val nome: String, var tipo: String, var especie: String){
    var corDePelo: ""
    var sexo: ""

    fun corre(){
        println("Correndo")
    }

    fun morder(){
        println("Mordendo")
    }

    //Gerar metódos abstratos
    abstract fun farejar()
    abstract fun rosnar()
    abstract fun julgar()


}