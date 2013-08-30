//Example of using selectors to find objects in a array

def prices = [10,20,30,40,35,25]

//Imperative
def totalPrices(prices){
	def acum = 0
	for (price in prices){
		acum += price
	}

	acum
    
}
def totalEvenPrices(prices){
    def acum = 0
	for (price in prices){
		if (price % 2 == 0) acum += price
	}

	acum
}

def totalOddPrices(prices){
    def acum = 0
	for (price in prices){
		if (price % 2 != 0) acum += price
	}

	acum
}

println totalPrices(prices)
println totalEvenPrices(prices)
println totalOddPrices(prices)

//Groovy way with selector
def selector(list, cl){
	def acum = 0
	/*for (obj in list){
		if (cl(obj)) acum += obj
	}*/
	//list.findAll{ cl(it) }.sum()
	//list.sum { cl(it) ? it : 0 }
	list.collect { cl(it) ? it : 0 }.sum()

}

println selector(prices) { it % 2 == 0 }
println selector(prices) { it % 2 != 0 }
println selector(prices) { true }


