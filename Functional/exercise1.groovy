/*
Print for each name it's size.
Example: [[John, 4], [Jack, 4], [Jill, 4], [Sam, 3], [William, 7]]

Both in imperative and fuctional style
*/


def names = ["John","Jack","Jill","Sam","William"]

//Imperative style
def changeNames = new ArrayList()
def changeName
for (name in names){
	def innerList = new ArrayList()
	innerList.add name
	innerList.add(name.size())
	changeNames.add(innerList)
}

println changeNames

//Functional style
println names.collect { [ it, it.size() ] }