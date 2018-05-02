package org.test/**
 * Project: GroovyTest
 * Package: org.test
 *
 * User: vamshi
 * Date: 5/1/18
 * Time: 8:35 PM
 *
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

//Creating Arrays
def arrTest = [1,256,445,3,2]
arrTest.sort()

arrTest.forEach{
    e -> print("\t $e")
}
println()

//working with maps
def testMap = [name:"Vamsi",age:"31"];
testMap.entrySet().forEach{
    e -> print("\t "+e.getKey()+" <-> "+e.getValue())
}
testMap.entrySet().stream()
.sorted()


