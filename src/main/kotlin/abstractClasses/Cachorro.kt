package abstractClasses

class Cachorro (nome: String, tipo: String, especie: String,

                val raca: String

                ) : Animal(nome, tipo, especie){

                    fun latir(){
                        println("Auauau")
                    }

    override fun farejar() {
        println("Farejando.")
    }

}