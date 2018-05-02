package org.test /**
 * Project: GroovyTest
 * Package: org.test
 *
 * User: vamshi
 * Date: 5/1/18
 * Time: 8:51 PM
 *
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
class MainClass {
    static void main(String[] args) {
        def map
        map = [name: "Vamsi", age: "31", sex: "M", maritalStatus: "Married"]

        map.entrySet().forEach {
            e -> print("\t  $e")
        }
    }
}
