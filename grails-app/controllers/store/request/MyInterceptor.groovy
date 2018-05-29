package store.request

class MyInterceptor {

    MyInterceptor() {
        // this row breaks the call of GET http://localhost:8080/test
        match(namespace: 'space', controller: 'myNext').excludes(namespace: 'space', controller: 'myNext', action: 'index')
        match(namespace: 'space', controller: 'my', action: 'index')
    }

    boolean before() {
        println("I'm here in MyInterceptor")

        request.test = 'test'
        return true
    }

    boolean after() { true }
}
