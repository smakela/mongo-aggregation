package fi.smakela.mongo.aggregation


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

import com.mongodb.*

@Integration
@Rollback
class AggregationSpec extends Specification {

   void setupData() {
    	new Person(name:'sami').save(flush:true)
    }

    void "Test that Person.collection.aggregate() returns correct class"() {
        given:
        	setupData()
        expect:
            // static AggregationOutput aggregate(final DBCollection collection, final List<? extends Map> pipeline)
            Person.collection.aggregate([[$match:["name":"sami"]]]) instanceof AggregationOutput
    }
}
