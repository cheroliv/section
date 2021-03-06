package common.domain

import common.config.Constants.LOGIN_REGEX
import common.config.Constants.PASSWORD_MAX_LENGTH
import common.config.Constants.PASSWORD_MIN_LENGTH
import java.time.Instant
import java.util.*
import javax.validation.constraints.*

/**
 * Représente le user view model
 */
//password

open class Account(
    var id: UUID? = null,
    @field:NotBlank
    @field:Pattern(regexp = LOGIN_REGEX)
    @field:Size(min = 1, max = 50)
    open var login: String? = null,
    @field:Size(max = 50)
    open var firstName: String? = null,
    @field:Size(max = 50)
    open var lastName: String? = null,
    @field:Email
    @field:Size(min = 5, max = 254)
    open var email: String? = null,
    @field:Size(max = 256)
    open var imageUrl: String? = "http://placehold.it/50x50",
    open var activated: Boolean = false,
    @field:Size(min = 2, max = 10)
    open var langKey: String? = null,
    var createdBy: String? = null,
    var createdDate: Instant? = null,
    var lastModifiedBy: String? = null,
    var lastModifiedDate: Instant? = null,
    open var authorities: Set<String>? = null
) {
    @Suppress("unused")
    fun isActivated(): Boolean = activated

    /**
     * Représente l'account view model avec le password
     */
    data class AccountCredentials(
        @field:NotNull
        @field:Size(
            min = PASSWORD_MIN_LENGTH,
            max = PASSWORD_MAX_LENGTH
        )
        var password: String? = null,
        var activationKey: String? = null
    ) : Account()


    /**
     * représente le user view model minimaliste pour la view
     */
    data class Avatar(
        var id: UUID? = null,
        var login: String? = null
    )

    data class KeyAndPassword(
        val key: String? = null,
        val newPassword: String? = null
    )

    data class Login(
        @field:NotNull
        val username:
        @Size(min = 1, max = 50)
        String? = null,
        @field:NotNull
        @field:Size(min = 4, max = 100)
        val password:
        String? = null,
        val rememberMe: Boolean? = null
    )

    data class PasswordChange(
        val currentPassword: String? = null,
        val newPassword: String? = null
    )
}