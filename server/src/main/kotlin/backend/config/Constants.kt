package backend.config

import java.net.URI
import java.net.URI.create

object Constants {
    //Spring profiles
    const val SPRING_PROFILE_DEVELOPMENT = "dev"
    const val SPRING_PROFILE_PRODUCTION = "prod"
    const val SPRING_PROFILE_CLOUD = "cloud"
    const val SPRING_PROFILE_CONF_DEFAULT_KEY = "spring.profiles.default"

    @Suppress("unused")
    const val SPRING_PROFILE_TEST = "test"

    @Suppress("unused")
    const val SPRING_PROFILE_HEROKU = "heroku"

    @Suppress("unused")
    const val SPRING_PROFILE_AWS_ECS = "aws-ecs"

    @Suppress("unused")
    const val SPRING_PROFILE_AZURE = "azure"

    @Suppress("unused")
    const val SPRING_PROFILE_SWAGGER = "swagger"

    @Suppress("unused")
    const val SPRING_PROFILE_NO_LIQUIBASE = "no-liquibase"

    @Suppress("unused")
    const val SPRING_PROFILE_K8S = "k8s"

    //Config
    const val DEV_HOST = "localhost"

    //HTTP param
    const val REQUEST_PARAM_LANG = "lang"
    const val CONTENT_SECURITY_POLICY =
        "default-src 'self'; frame-src 'self' data:; script-src 'self' 'unsafe-inline' 'unsafe-eval' https://storage.googleapis.com; style-src 'self' 'unsafe-inline'; img-src 'self' data:; font-src 'self' data:"
    const val FEATURE_POLICY =
        "geolocation 'none'; midi 'none'; sync-xhr 'none'; microphone 'none'; camera 'none'; magnetometer 'none'; gyroscope 'none'; speaker 'none'; fullscreen 'self'; payment 'none'"

    //Security
    const val ROLE_ADMIN: String = "ADMIN"
    const val ROLE_USER: String = "USER"
    const val ROLE_ANONYMOUS: String = "ANONYMOUS"
    const val AUTHORITIES_KEY = "auth"
    const val AUTHORIZATION_HEADER = "Authorization"
    const val BEARER_START_WITH = "Bearer "
    const val AUTHORIZATION_ID_TOKEN = "id_token"
    const val VALID_TOKEN:Boolean = true
    const val INVALID_TOKEN:Boolean = false


    //properties
    const val PROP_ITEM = "backend.item"
    const val PROP_MESSAGE = "backend.message"
    const val PROP_MAIL_BASE_URL = "backend.mail.base-url"
    const val PROP_MAIL_FROM = "backend.mail.from"
    const val PROP_MAIL_HOST = "backend.mail.host"
    const val PROP_MAIL_PORT = "backend.mail.port"
    const val PROP_MAIL_PASSWORD = "backend.mail.password"
    const val PROP_MAIL_PROPERTY_DEBUG = "backend.mail.property.debug"
    const val PROP_MAIL_PROPERTY_TRANSPORT_PROTOCOL = "backend.mail.property.transport.protocol"
    const val PROP_MAIL_PROPERTY_SMTP_AUTH = "backend.mail.property.smtp.auth"
    const val PROP_MAIL_PROPERTY_SMTP_STARTTLS_ENABLE = "backend.mail.property.smtp.starttls.enable"
    const val PROP_DATABASE_POPULATOR_PATH = "backend.database.populator-path"
    const val STARTUP_LOG_MSG_KEY="startup.log.msg"


    //Email activation
    const val USER = "user"
    const val BASE_URL = "baseUrl"

    // Regex for acceptable logins
    const val LOGIN_REGEX = "^(?>[a-zA-Z0-9!$&*+=?^_`{|}~.-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)|(?>[_.@A-Za-z0-9-]+)$"
    const val SYSTEM_USER = "system"

    @Suppress("unused")
    const val ANONYMOUS_USER: String = "anonymoususer"
    const val DEFAULT_LANGUAGE = "en"
    const val PASSWORD_MIN_LENGTH: Int = 4
    const val PASSWORD_MAX_LENGTH: Int = 100
    const val ERR_CONCURRENCY_FAILURE: String = "error.concurrencyFailure"
    const val ERR_VALIDATION: String = "error.validation"
    private const val PROBLEM_BASE_URL: String = "https://www.cccp.education/problem"
    const val USER_INITIAL_ACTIVATED_VALUE = false

    @JvmField
    val DEFAULT_TYPE: URI = create("$PROBLEM_BASE_URL/problem-with-message")

    @JvmField
    val CONSTRAINT_VIOLATION_TYPE: URI = create("$PROBLEM_BASE_URL/constraint-violation")

    @JvmField
    val INVALID_PASSWORD_TYPE: URI = create("$PROBLEM_BASE_URL/invalid-password")

    @JvmField
    val EMAIL_ALREADY_USED_TYPE: URI = create("$PROBLEM_BASE_URL/email-already-used")

    @JvmField
    val LOGIN_ALREADY_USED_TYPE: URI = create("$PROBLEM_BASE_URL/login-already-used")
}