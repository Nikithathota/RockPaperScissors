package com.example.rockpaperscissors

fun main(){
    var computerChoice=""
    var playerChoice=""
    println("Rock, Paper, Scissors? Enter your choice")
    playerChoice=readln()

    val randomNumber=(1..3).random()
    /*
    if(randomNumber==1){
        computerChoice="Rock"
    }
    else if(randomNumber==2){
        computerChoice="Paper"
    }
    else if(randomNumber==3){
        computerChoice="Scissors"
    }
    println(computerChoice)
    */
    when(randomNumber){
        1-> {
            computerChoice="Rock"
        }
        2->{
            computerChoice="Paper"
        }
        3->{
            computerChoice="Scissors"
        }
    }
    println(computerChoice)

    var isValidChoice=true

    while (playerChoice != "Rock" && playerChoice != "Paper" && playerChoice != "Scissors") {
        println("Invalid choice. Please enter Rock, Paper, or Scissors.")
        isValidChoice=false
        break
    }

  if(isValidChoice) {
      val winner = when {
          playerChoice == computerChoice -> "Tie"
          playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
          playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
          playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
          else -> "Computer"
      }
      /*
    if(winner=="Tie"){
        println("It's a tie")
    }
    else if(winner=="Player"){
        println("Player won!")
    }
    else{
        println("Computer won!")
    }
     */

      /*
    if(winner=="Tie"){
        println("It's a tie")
    }
    else{
        println(winner + " won!")
    }
     */
      if (winner == "Tie") {
          println("It's a tie")
      } else {
          println("$winner won!")
      }

  }
}
