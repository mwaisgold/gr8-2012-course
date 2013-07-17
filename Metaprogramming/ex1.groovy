//Sinthesizing, this uses the technique for all methods starting with "play"

class Person {
	def work(){ println "working..." }
	def methodMissing(String name, args){
		println "Intercepting $name"
		//Assume it starts withPlay
		def activity = name.split('play')[1]

		def impl = { Object[] theArgs ->
			println "I like playing $activity"
		}

		def thisPerson = this
		thisPerson.metaClass."$name" = impl //Registering the method to cache it
		impl(args)

	}
}

joe = new Person()
joe.work()
joe.playTennis()
joe.playFootball()
joe.playTennis()
joe.playTennis()

//----------------------------------
def str = '''
	println "hello $name"
'''

def binding = new Binding()
binding.name = 'Scott'
new GroovyShell(binding).evaluate(str)

//-------------------------
playersAndScores = [:]
def players(String[] names){
	names.each { name ->
		playersAndScores[name] = 0
	}
}

def getWinner(){
	def winner = playersAndScores.max { it.value }
	println "Winner is $winner.key with score $winner.value"
}

players "Jack", "Jane", "James"
winner