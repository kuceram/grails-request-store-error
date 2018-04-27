package store.request

class TestController {

    def index() {
        println("This is it: ${request.test}")

        return request.test ?: 'nothing!!'
    }
}
