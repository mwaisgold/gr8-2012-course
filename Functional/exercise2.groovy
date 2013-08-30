/*
Println the total amount of letters in the array
Both in imperative and functional way
In this case: 22
*/

def names = ["John","Jack","Jill","Sam","William"]

//Imperative style
def total = 0
for (n in names){
    total += n.size()
}

println total

//Functional style
println names.sum{ it .size() }