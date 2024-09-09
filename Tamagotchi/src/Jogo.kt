
fun main() {
    println("Bem-vindo ao Simulador de Animal de Estimação Virtual!")
    println("Digite o nome do seu animal de estimação:")
    val nomePet = readlnOrNull() ?: "Baltazar Guilherme Tenório"
    val pet = VirtualPet(nomePet)

    while (true) {
        println("\nEscolha uma ação:")
        println("1. Alimentar $nomePet")
        println("2. Brincar com $nomePet")
        println("3. Descansar $nomePet")
        println("4. Usar o banheiro $nomePet")
        println("5. Tomar banho $nomePet")
        println("6. Verificar o status de $nomePet")
        println("7. Sair")

        val escolha = readlnOrNull()?.toIntOrNull() ?: continue

        when (escolha) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> pet.descansar()
            4 -> pet.banheiro()
            5 -> pet.tomarBanho()
            6 -> pet.verificarStatus()
            7 -> {
                println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!")
                return
            }
            else -> println("Escolha inválida. Tente novamente.")
        }


        pet.passarTempo()

        pet.gameOver()


        if (pet.nivelDeFome >= 100 || pet.nivelCansaco >= 100 || pet.nivelFelicidade <= 0 || pet.nivelBanheiro >= 100 || pet.nivelSujeira >= 100) {
            println("O programa foi encerrado porque $nomePet morreu.")
            return
        }
    }
}