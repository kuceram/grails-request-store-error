package store.request

class MyNextController {

    static namespace = 'space'

    def index() {
        println("This is next controller: ${request.test}")

        return request.test ?: 'nothing!!'
    }

    def some() {
        println "some controller"

        return "some controller"
    }
}
