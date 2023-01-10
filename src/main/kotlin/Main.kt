
var fragen: MutableList<Quizfrage> = mutableListOf(
    Quizfrage("Wie lautet die Hauptstadt von Italien ?", "Rom", "Berlin", "Milan"),
    Quizfrage("Wie lautet die Wurzel von 16 ?", "4", "76", "6"),
    Quizfrage("Wie viele Bundesländer hat Deutschland ?", "16", "4", "9"),
    Quizfrage("Kotlin ist eine .. ?", "Programmiersprache", "Pflanze", "Insel"),
    Quizfrage("Welche Sauße liebt der Entwickler dieses Quiz ?", "Süß-Sauer Soße", "Ketchup", "Sauce-Hollandaise"),
    Quizfrage("Android ist ein/e .. ?", "Betriebssystem", "Programmiersprache", "Handymarke"),
    Quizfrage("Der RAM eines Computers ist ein/e .. ?", "temporärer Speicher", "Grafikkarte", "ausführbares Programm"),
    Quizfrage("Haie leben in/im", "Ozean/Meer", "Seen", "Schwimmbäder"),
    Quizfrage("App-Programmierung ist .. ?", "cool", "grottenschlecht", "zum kotzen"),
    Quizfrage("Dieses Quiz wurde programmiert mit .. ?", "kotlin", "c++", "java"),
    Quizfrage("Die Erde ist .. ?", "rund", "eckig", "eine Scheibe"),
)

fun main(){
    println("Willkommen zu dem ultimativen Quiz!")

    while(true){
        askRandomQuestion()
    }
}

fun askRandomQuestion(){
    println() // Zum springen in eine neue Zeile
    var frage = fragen.random() //Es wird eine zufällige Frage aus der Liste entnommen
    var antworten = listOf<String>(frage.richtigeAntwort, frage.antwort2, frage.antwort3).shuffled() //Die Antworten zu der Frage werden in einer zufällig gemischten Liste zusammengefasst
    println(frage.frage) //Ausgabe der Frage
    var count: Int = 0

    println() //Leere Zeile zur Übersichtlichkeit
    var mapOfAnswers: MutableMap<Int, String> = mutableMapOf()

    for(a in antworten){
        mapOfAnswers.put(++count, a)
        println("$count.- $a")
    }

    println("\nEingabe (Index): ")
    println()
    var userEingabe = readln()

    if(mapOfAnswers[userEingabe.toInt()] == frage.richtigeAntwort){
        println("\nDeine Antwort war richtig!")
        Thread.sleep(1500)
        println("\n\n\n\n")
    }else{
        println("Deine Antwort war leider falsch!")
        Thread.sleep(1500)
        println("\n\n\n\n")
    }
}


















