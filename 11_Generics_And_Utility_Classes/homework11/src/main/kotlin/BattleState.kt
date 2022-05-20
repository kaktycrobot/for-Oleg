sealed class BattleState {
    val stateMessage: String
        get() = when (this) {
            is Draw -> "${teamA.name} vs ${teamB.name}: DRAW!"
            is TeamAWin -> "${teamA.name} vs ${teamB.name}: ${teamA.name} WON!"
            is TeamBWin -> "${teamA.name} vs ${teamB.name}: ${teamB.name} WON!"
            is Progress -> "Battle in progress.."
        }

    class Draw(val teamA: Team, val teamB: Team) : BattleState()
    class TeamAWin(val teamA: Team, val teamB: Team) : BattleState()
    class TeamBWin(val teamA: Team, val teamB: Team) : BattleState()
    class Progress(private val teamA: Team, private val teamB: Team) : BattleState() {
        val info: String
            get() = """
                 =============================
                 |${teamA.name}|   Units left    ${teamA.teamSize}
                 |TEAM |   Total HP      ${teamA.teamHP}
                 -----------------------------
                 |${teamB.name}|   Units left    ${teamB.teamSize}
                 |TEAM |   Total HP      ${teamB.teamHP}
                 =============================
            """.trimIndent()
    }
}