package reaktive.properties

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import reaktive.config.Constants.PROP_DATABASE_POPULATOR_PATH
import reaktive.tdd.functional.AbstractBaseFunctionalTest
import kotlin.test.Test

class DatabasePropertiesFuncTest : AbstractBaseFunctionalTest() {

    @Autowired
    lateinit var properties: ApplicationProperties

    @Value("\${$PROP_DATABASE_POPULATOR_PATH}")
    lateinit var databasePopulatorPath: String

    @Test
    fun `Check property reaktive_database_populator-path`() {
        checkProperty(
            PROP_DATABASE_POPULATOR_PATH,
            properties.database.populatorPath,
            databasePopulatorPath
        )
    }
}