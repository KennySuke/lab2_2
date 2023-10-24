fun main(args: Array<String>) {
    val generator = generator()
    val manager = manager(generator)
    manager.greetings()
    var quit = false
    while (!quit){
        quit = !manager.readConsole()
    }
}