class VirtualPet(val nome: String) {
    var nivelDeFome = 50
    var nivelFelicidade = 50
    var nivelCansaco = 10
    var idade = 0
    var nivelBanheiro = 0
    var nivelSujeira = 0

    var tempoDescanso = 0

    fun alimentar() {
        nivelDeFome -= 10
        nivelBanheiro += 10
        println("$nome foi alimentado. O nível de fome diminuiu.")
    }

    fun brincar() {
        if(nivelCansaco != 99){
            nivelFelicidade += 50
            nivelCansaco += 20
            nivelSujeira += 10
            println("$nome está brincando e se sentindo mais feliz.")
        }else{
            println("$nome está se sentindo muito cansado, que tal descansar antes de brincar mais?")
        }

    }
    fun descansar(){
        if(nivelCansaco <= 0){
            println("$nome não está cansado! volte depois")
        }else{
            println("Por quanto tempo ele deve descansar? (1-8)")
            tempoDescanso = readln().toInt()

            when(tempoDescanso){
                1 -> {
                    nivelCansaco -= 10
                    println("$nome está se sentindo mais descansado agora!")
                }
                2 -> {
                    nivelCansaco -= 20
                    println("$nome está se sentindo mais descansado agora!")
                }
                3 -> {
                    nivelCansaco -= 30
                    println("$nome está se sentindo mais descansado agora!")
                }
                4 -> {
                    nivelCansaco -= 40
                    println("$nome está se sentindo mais descansado agora!")
                }
                5 -> {
                    nivelCansaco -= 50
                    println("$nome está se sentindo mais descansado agora!")
                }
                6 -> {
                    nivelCansaco -= 60
                    println("$nome está se sentindo mais descansado agora!")
                }
                7 -> {
                    nivelCansaco -= 70
                    println("$nome está se sentindo mais descansado agora!")
                }
                8 -> {
                    nivelCansaco -= 80
                    println("$nome está se sentindo mais descansado agora!")
                }
                else -> println("Escolha inválida. Tente novamente.")
            }


        }

    }

    fun banheiro(){
        nivelBanheiro -= 10
        println("$nome fez coco! Agora seu nível de necessidade é: $nivelBanheiro")
    }
    fun tomarBanho(){
        nivelSujeira -= 20
        println("$nome tomou banho! Agora seu nível de sujeira é: $nivelSujeira")
    }

    fun verificarStatus() {
        println("Status atual de $nome:")
        println("Nível de fome: $nivelDeFome")
        println("Nível de felicidade: $nivelFelicidade")
        println("Nível de cansaço de $nome : $nivelCansaco")
        println("Nível de sujeira: $nivelSujeira")
        println("Nível de banheiro: $nivelBanheiro")
        println("Idade atual de $nome é: $idade ")

    }

    fun passarTempo() {
        nivelDeFome += 5
        println("$nome está ficando mais faminto com o passar do tempo.")
        idade += 1
        //println("A idade de $nome agora é: $idade")
        nivelFelicidade -= 30
        nivelCansaco -= 10
    }

    fun status() {
        println("status não implementado ")


    }
    fun gameOver() {
        when {
            nivelDeFome >= 100 -> {
                println("Infelizmente $nome morreu de fome :C")
                return
            }
            nivelCansaco >= 100 -> {
                println("Infelizmente $nome morreu de cansaço :C")
                return
            }
            nivelFelicidade <= 0 -> {
                println("Infelizmente $nome morreu de tristeza :C ")
                return
            }
            nivelBanheiro >= 100 -> {
                println("Infelizmente $nome morreu de vontade de fazer coco :C ")
                return
            }
            nivelSujeira >= 100 -> {
                println("Infelizmente $nome morreu de tão sujo :C ")
                return
            }
            idade >= 50 -> {
                println("Parabéns! $nome agora tem $idade anos de idade!")
            }
        }
    }



}
