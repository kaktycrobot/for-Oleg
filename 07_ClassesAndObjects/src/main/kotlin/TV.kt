class TV(val brand: String, val model: String, val diagonal: Int, val color: String = "Black") {

    constructor(descriptor: Pair<String, String>, diagonal: Int, color: String = "Black") : this(
        brand = descriptor.first,
        model = descriptor.second,
        diagonal = diagonal,
        color = color
    )

    var powerOn = false
        private set

    fun switchOn() {
        println("The \"Power\" button is pressed")
        println("TV on\nChannel $currentChannel - ${channelList[currentChannel]}")
        powerOn = true
    }

    fun switchOff() {
        println("The \"Power\" button is pressed")
        println("TV off")
        powerOn = false
    }

    var currentVolume: Int = 0
        private set

    fun volumeUp(changeValue: Int) {
        println("The \"Volume up\" button is pressed")
        if (!powerOn) println("Now the TV is off")
        else {
            println("\"Volume increased by $changeValue\"")
            currentVolume += changeValue
            if (currentVolume > maxVolume) {
                currentVolume = 100
                println("Volume - $currentVolume")
            } else return println("Volume - $currentVolume")
        }
    }

    fun volumeDown(changeValue: Int) {
        println("The \"Volume down\" button is pressed")
        if (!powerOn) println("Now the TV is off")
        else {
            println("\"Volume reduced by $changeValue\"")
            currentVolume -= changeValue
            if (currentVolume < 0) {
                currentVolume = 0
                println("Volume - 0")
            } else return println("Volume - $currentVolume")
        }
    }

    private var currentChannel = 0

    fun switchChannel(input: Int) {
        println("Button \"$input\" pressed")
        currentChannel = input
        if (!powerOn) {
            powerOn = true
            println("TV on")
            if (input > (channelList.size - 1)) println("Channel $currentChannel - Empty")
            else {
                println("Channel $currentChannel - ${channelList[currentChannel]}")
            }
        } else {
            if (input > (channelList.size - 1)) println("Channel $currentChannel - Empty")
            else {
                println("Channel $currentChannel - ${channelList[currentChannel]}")
            }
        }
    }

    fun switchChannelUp() {
        println("The \"Next channel\" button is pressed")
        if (!powerOn) {
            println("TV on\nChannel $currentChannel - ${channelList[currentChannel]}")
            powerOn = true
        } else {
            currentChannel += 1
            if (currentChannel > (channelList.size - 1)) {
                currentChannel = 0
            }
            println("Channel $currentChannel - ${channelList[currentChannel]}")
        }
    }

    fun switchChannelDown() {
        println("The \"Previous channel\" button is pressed")
        if (!powerOn) {
            println("TV on\nChannel $currentChannel - ${channelList[currentChannel]}")
            powerOn = true
        } else {
            currentChannel -= 1
            if (currentChannel < 0) {
                currentChannel = channelList.size - 1
            }
            println("Channel $currentChannel - ${channelList[currentChannel]}")
        }
    }

    private var channelList = ChannelsList.getRandomChannels()
    fun printChannelList() {
        println("Channel list for TV $brand:")
        channelList.forEachIndexed { index, item ->
            println("Channel #${index} - $item")
        }
    }

    companion object {
        const val maxVolume: Int = 100
    }
}
