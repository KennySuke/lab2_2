import phrases
import java.util.Random

class generator (){

    fun generateSpeech(count: Int): String {
        var speech = ""
        for (i in 1..count) {
            speech += _generateSentence()
        }
        return speech
    }

    fun _generateSentence(): String {
        var phrase = ""
        phrases.forEach{
            phrase += it[kotlin.random.Random.nextInt(0, it.size)]}
        return phrase + "\n"
        }
}