# Simulador de Tamagotchi Virtual em Kotlin
Este é um simples simulador de animal de estimação virtual inspirado no clássico Tamagotchi, desenvolvido em Kotlin. O programa permite que o usuário interaja com seu animal de estimação virtual realizando atividades como alimentá-lo, brincar, descansar, tomar banho, entre outros.

### Funcionalidades
* Alimentar o Pet: Diminui o nível de fome e aumenta a necessidade de usar o banheiro.
* Brincar com o Pet: Aumenta a felicidade e o cansaço, mas também deixa o pet mais sujo.
* Descansar: Diminui o cansaço do pet dependendo do tempo de descanso escolhido.
* Banheiro: Reduz a necessidade de ir ao banheiro.
* Tomar banho: Reduz o nível de sujeira do pet.
* Verificar Status: Exibe os níveis atuais de fome, felicidade, cansaço, sujeira, e idade.
* Game Over: O jogo termina se o pet morrer de fome, cansaço, tristeza, necessidade de banheiro ou sujeira.
  
### Como Funciona
O jogo é executado em um loop contínuo onde o usuário pode escolher uma das ações disponíveis para cuidar do seu animal de estimação virtual. O jogo continua até que o usuário escolha a opção de sair ou até que o pet morra por descuido.

### Menu de Opções
Ao iniciar o programa, o usuário verá as seguintes opções:

1. Alimentar o pet
2. Brincar com o pet
3. Descansar o pet
4. Levar o pet ao banheiro
5. Dar banho no pet
6. Verificar o status do pet
7. Sair do jogo
### Exemplo:
    fun alimentar() {
        nivelDeFome -= 10
        nivelBanheiro += 10
        println("$nome foi alimentado. O nível de fome diminuiu.")
    }
   
### Condições de Game Over
O jogo termina se qualquer um dos seguintes parâmetros atingir seu limite:

* Fome: Se o nível de fome atingir 100, o pet morrerá de fome.
* Cansaço: Se o nível de cansaço atingir 100, o pet morrerá de exaustão.
* Felicidade: Se a felicidade cair para 0, o pet morrerá de tristeza.
* Banheiro: Se a necessidade de usar o banheiro atingir 100, o pet morrerá.
* Sujeira: Se o nível de sujeira atingir 100, o pet morrerá.

  ### Exemplo:

       pet.gameOver()


        if (pet.nivelDeFome >= 100 || pet.nivelCansaco >= 100 || pet.nivelFelicidade <= 0 || pet.nivelBanheiro >= 100 || pet.nivelSujeira >= 100) {
            println("O programa foi encerrado porque $nomePet morreu.")
            return
        }
  
### Idade
Se o pet atingir 50 anos de idade, o usuário verá uma mensagem de parabéns pela longevidade do pet.
