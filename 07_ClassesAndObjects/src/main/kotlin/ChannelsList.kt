import kotlin.random.Random

object ChannelsList {
    private var channelList = listOf(
        "BBC World News Europe",
        "Universal TV",
        "Fashion Television",
        "Loveworld TV",
        "Bloomberg TV Europe",
        "CNBC Europe",
        "God TV UK",
        "MTA 1",
        "EuroNews",
        "Daystar TV",
    )

    fun getRandomChannels(): MutableList<String> {
        val shuffledChannels = channelList.shuffled()
        return shuffledChannels.subList(0, Random.nextInt(3, 9)).toMutableList()
    }

}
