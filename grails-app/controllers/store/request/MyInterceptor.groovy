package store.request

class MyInterceptor {

    MyInterceptor() {
        match(namespace: 'space')
    }

    boolean before() {
        println("I'm here in MyInterceptor")

        request.test = 'test'
        return true
    }

    boolean after() { true }
}
