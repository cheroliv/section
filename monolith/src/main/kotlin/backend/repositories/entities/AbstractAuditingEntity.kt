package backend.repositories.entities

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.relational.core.mapping.Column
import java.io.Serializable
import java.time.Instant

/**
 * Base abstract class for entities which will hold definitions for created, last modified by, created by,
 * last modified by attributes.
 */
abstract class AbstractAuditingEntity(

    @Column(value = "created_by")//, nullable = false, length = 50, updatable = false)
    @JsonIgnore
    var createdBy: String? = null,

    @CreatedDate
    @Column(value = "created_date")//, updatable = false)
    @JsonIgnore
    var createdDate: Instant? = Instant.now(),

    @Column(value = "last_modified_by")//, length = 50)
    @JsonIgnore
    var lastModifiedBy: String? = null,

    @LastModifiedDate
    @Column(value= "last_modified_date")
    @JsonIgnore
    var lastModifiedDate: Instant? = Instant.now()

) : Serializable {
    companion object {
        private const val serialVersionUID = 1L
    }
}
