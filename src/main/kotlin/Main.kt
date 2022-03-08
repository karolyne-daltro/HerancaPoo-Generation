import ExercicioHerancaPoo.Cavalo
import ExercicioHerancaPoo.Preguica
import ExercicioHerancaPoo.Preguica
import abstractClasses.Cachorro
import heranca.Estudante
import heranca.Pessoa

fun main() {

    /*
    Herança - Classe Pai (ou seja, Superclasses) e classes filhas (ou seja, subclasses)

    Classe filha só herda os atributos de 1 pai.

    Polimorfismo - uma mesma instrução computacional de formas diferentes

    Classes abstratas - É onde a classe pai não poderá ser instanciada,
    conseguimos utilizar dentro delas métodos abstratos

    Interface - É onde todos os atributos e métodos ficam abstratos e os atibutos
    dessa interface não podem ser inicializados.

    Pessoa - Classe Pai

    Estudante - Classe Filho de Pessoa

    Funcionario - Classe Filho de Pessoa
     */

    //Instancia da classe pai
    /*val lucy = Pessoa("Lucy", 40, "44466655577")

    //Instancia da classe Estudante (que está herdando a classe Pessoa)
    val natsu = Estudante("Natsu", 42, "22233344455", 25544668)

    natsu.escrever()
    natsu.corDeCabelo = "Rosa"
    natsu.corDaPele = "Dragão"
    natsu.alterarNota(10.0)

    //Instancia da classe funcionario
    val gray = Funcionario
    */

    /*val cachorro = Cachorro(
        "Sunny", "Doméstico", "Cachorro", "Pincher"
    )*/

    /*
    Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
    comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
    as características de forma que tudo o que for comum a todos os animais fique
    na classe Animal.

    Implemente um programa que crie os 3 tipos de animais definidos no exercício
    anterior e invoque o método que emite o som de cada um de forma polimórfica,
    isto é, independente do tipo de animal.
     */

    val sunny = Cachorro("Sunny", 2)
    val spirit = Cavalo ("Spirit", 5)
    val king = Preguica("King",6)

    sunny.emitirSom()
    spirit.emitirSom()
    king.emitirSom()









}