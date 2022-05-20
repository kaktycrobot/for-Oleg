class Battle {
    private val teamA = Team("Alpha", 10)
    private val teamB = Team("Delta", 10)
    private var battleCount = 60
    private val battleIsOver: Boolean
        get() = (teamA.teamSize == 0 || teamB.teamSize == 0)


    private fun getBattleState(): Any {
        return if (battleCount == 0) println(BattleState.Draw(teamA, teamB).stateMessage)
        else if (!battleIsOver) println(BattleState.Progress(teamA, teamB).stateMessage)
        else if (teamA.teamSize > teamB.teamSize) println(BattleState.TeamAWin(teamA, teamB).stateMessage)
        else println(BattleState.TeamBWin(teamA, teamB).stateMessage)
    }

    fun toBattle() {
        println("${teamA.name} team vs ${teamB.name} team!" +
                "\nIf NO ONE wins within $battleCount rounds, a DRAW will be declared!")
        Thread.sleep(1500)
        println("The BATTLE begins!")
        Thread.sleep(1500)
        while (battleCount != 0) {
            teamA.team.shuffle()
            teamB.team.shuffle()
            teamA.team[(0 until teamA.teamSize).random()].attack(teamB.team[(0 until teamB.teamSize).random()])
            teamB.team.removeAll { it.isKilled }
            teamB.team[(0 until teamB.teamSize).random()].attack(teamA.team[(0 until teamA.teamSize).random()])
            teamA.team.removeAll { it.isKilled }
            battleCount--
            println("$battleCount round left..")
            Thread.sleep(1500)
            getBattleState()
            Thread.sleep(1500)
            println(BattleState.Progress(teamA, teamB).info)
            Thread.sleep(1500)
            if (battleIsOver) break
        }
    }
}