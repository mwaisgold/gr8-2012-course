
class PizzaShop {
//YOUR CODE GOES HERE
	def propertyMissing(name){name}

	def size(s){ println "$s"}
	def crust(c){ println "$c crust" }
	def toppings(String[] t){ println "with toppings ${t.join(', ')}" }
	def address(a){ println "to $a" }
	static order(block){
		println "placing order for Pizza: "
		def p = new PizzaShop()
		p.with block

	}
}

PizzaShop.order {
  size large
  crust thin
  toppings Olives, Onions, Bell_Pepper
  address "101 Main St., ..."
}
/*
placing order for Pizza:
large
thin crust
with toppings Olives, Onions, Bell Peppers
to address 101 Main St., ...
*/