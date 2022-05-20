class Team(val name: String, number: Int) {
    val team = mutableListOf<AbstractWarrior>()
    val teamSize: Int
        get() = team.size
    val teamHP: Int
        get() = team.sumOf { it.health }

    init {
        repeat(number) {
            if (10.checkSuccess()) team.add(General())
            else if (40.checkSuccess()) team.add(Captain())
            else team.add(Soldier())
        }
    }
}
