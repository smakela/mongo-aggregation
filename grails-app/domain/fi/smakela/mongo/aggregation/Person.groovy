package fi.smakela.mongo.aggregation

class Person {

	static mapWith  = "mongo"

	String name

    static constraints = {
    	name nullable:false
    }
}
