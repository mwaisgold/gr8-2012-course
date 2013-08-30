class MyClass {

	def plus(obj){
		"hola $obj"
	}

	def leftShift(obj){
		"leftShift $obj"
	}
}

def myClass = new MyClass()
println (myClass + 5)
println (myClass << 5)

def array = []
array << "obj"
println array

def map = [:]
map."hola" = "chau"
map.hola = "chau"
map["hola"] = "chau"
10.times { map."hola$it" = "chau" }
println map

return 


def a = {
	println nombre
}

class Foo {
	def nombre 
}

def foo = new Foo(nombre: "Pepe")
a.delegate = foo
a()



return









class Domain {
	def nombre
	def apellido

	def hola(){
		println  "otro hola"
	}
}

new Domain().hola()

Domain.metaClass.hola = { println "Hola"}

def e = new Domain()
e.metaClass.hola = { println "Chau" }

e.hola()

//def a =new Domain()
//a.hola()
return
















//Domain.findAllByNombreAndApellido("Pepe","Luis")