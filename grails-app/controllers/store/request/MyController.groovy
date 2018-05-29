package store.request

class MyController {

    static namespace = 'space'

    def index() {
        println("This is it: ${request.test}")

        return request.test ?: 'nothing!!'
    }

    def secret() {
        println("Secret is: ${request.test}")

        return request.test ?: 'secret'
    }
}
