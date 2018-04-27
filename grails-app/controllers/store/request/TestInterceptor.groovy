package store.request

class TestInterceptor {

    TestInterceptor() {
        match(namespace: 'test')
    }

    boolean before() {
        request.test = 'test'
        return true
    }
}
