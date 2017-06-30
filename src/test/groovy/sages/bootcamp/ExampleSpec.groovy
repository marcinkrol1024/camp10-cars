package sages.bootcamp

import com.google.inject.Inject
import org.jooq.DSLContext
import sages.bootcamp.example.di.PersistenceModule
import sages.bootcamp.example.jooq.Tables
import spock.guice.UseModules
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
@UseModules(PersistenceModule.class)
class ExampleSpec extends Specification {

	@Inject
	DSLContext dslContext

	def "should test adding cars"() {
		when:
		dslContext
				.insertInto(Tables.CARS, Tables.CARS.MODEL)
				.values("renault")
				.execute()

		then:
		dslContext
				.selectFrom(Tables.CARS)
				.fetch()
				.size() > 0
	}

	def "should test adding a: #a and b: #b"() {
		when:
		def d = a + b
		then:
		c == d
		where:
		a | b | c
		1 | 2 | 3
		4 | 5 | 9
	}

}
