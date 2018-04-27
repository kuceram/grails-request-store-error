package store.request

class MyNextInterceptor {

    MyNextInterceptor() {
        match(controller: 'my')
    }

    boolean before() {
        println("I'm here in MyNextInterceptor")
        return true
    }

    boolean after() { true }
}
