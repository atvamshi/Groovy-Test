/**
 * Project: GroovyTest
 * Package:
 *
 * User: vamshi
 * Date: 4/26/18
 * Time: 11:42 PM
 *
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

//Sample string
println("\nString*******************\n")
def str = "4282487824"
println("Hello vamsi your first Groovy Code $str")
assert str == "4282487824"

//Lists
println("\nLists*******************\n")
def testList = [1,2,3,4]
println("Item one :" + testList.get(0))

//iterating over list
println("Iterating over lists")
testList.forEach{e -> print("$e \t")}


//Maps
println("\nMaps*******************\n")
def mapTest = [x:1]
println("Printing maps -> $mapTest.x")

def map = [
        Bob  : 42,
        Alice: 54,
        Max  : 33
]
println("Iterating over maps")
map.each{
    e ->
        e.key
        println("Printing keys"+ e.key)
}

map.entrySet().forEach{
    e -> e.value
        println("Key : "+ e.key+" <----> "+"Value : "+ e.value)
}