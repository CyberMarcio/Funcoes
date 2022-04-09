fun exibirMensagem( nome: String, idade: Int )  {
    //bloco de códigos
    println("Alerta, vc não preencheu todos os dados $nome idade $idade")

}
fun somar(numero1: Int, numero2: Int) : Int {
    var total = numero1 + numero2
    return total

    //println(total)


}



fun main(args: Array<String>) {

    //exibirMensagem("Jamilton", 28)
    //somar(10,5)
    var resultado = somar (10,5)
    println(resultado)



}