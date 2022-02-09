@file:Suppress("MemberVisibilityCanBePrivate")

package backend.domain

import backend.config.Constants.DEFAULT_LANGUAGE
import backend.config.Constants.ROLE_ADMIN
import backend.config.Constants.ROLE_USER
import backend.config.Constants.SYSTEM_USER
import backend.repositories.entities.Authority
import backend.repositories.entities.User
import org.apache.commons.lang3.StringUtils.stripAccents
import java.time.Instant.now

fun User.unlockUser() {
    apply {
        if (id != null) {
            id = null
            version = null
        }
    }
}

@Suppress("HttpUrlsUsage")
object DataTest {
    const val USER_LOGIN = "user"
    const val ADMIN_LOGIN = "admin"
    const val USER1_LOGIN = "test1"
    const val USER2_LOGIN = "test2"
    const val USER3_LOGIN = "test3"

    val defaultAccount = AccountPassword(
        password = USER_LOGIN
    ).apply {
        login = USER_LOGIN
        firstName = USER_LOGIN
        lastName = USER_LOGIN
        email = "$USER_LOGIN@acme.com"
        langKey = DEFAULT_LANGUAGE
        createdBy = SYSTEM_USER
        lastModifiedBy = SYSTEM_USER
        imageUrl = "http://placehold.it/50x50"
        now().apply {
            lastModifiedDate = this
            createdDate = this
        }
    }
    val adminAccount = AccountPassword(
        password = ADMIN_LOGIN
    ).apply {
        login = ADMIN_LOGIN
        firstName = ADMIN_LOGIN
        lastName = ADMIN_LOGIN
        email = "$ADMIN_LOGIN@acme.com"
        langKey = DEFAULT_LANGUAGE
        createdBy = SYSTEM_USER
        lastModifiedBy = SYSTEM_USER
        now().apply {
            createdDate = this
            lastModifiedDate = this
        }
    }

    val userTest1Account = AccountPassword(
        password = USER1_LOGIN
    ).apply {
        login = USER1_LOGIN
        firstName = USER1_LOGIN
        lastName = USER1_LOGIN
        email = "$USER1_LOGIN@acme.com"
        langKey = DEFAULT_LANGUAGE
        createdBy = SYSTEM_USER
        lastModifiedBy = SYSTEM_USER
        now().apply {
            createdDate = this
            lastModifiedDate = this
        }
    }

    val userTest2Account = AccountPassword(
        password = USER2_LOGIN
    ).apply {
        login = USER2_LOGIN
        firstName = USER2_LOGIN
        lastName = USER2_LOGIN
        email = "$USER2_LOGIN@acme.com"
        langKey = DEFAULT_LANGUAGE
        createdBy = SYSTEM_USER
        lastModifiedBy = SYSTEM_USER
        now().apply {
            createdDate = this
            lastModifiedDate = this
        }
    }

    val userTest3Account = AccountPassword(
        password = USER3_LOGIN
    ).apply {
        login = USER3_LOGIN
        firstName = USER3_LOGIN
        lastName = USER3_LOGIN
        email = "$USER3_LOGIN@acme.com"
        langKey = DEFAULT_LANGUAGE
        createdBy = SYSTEM_USER
        lastModifiedBy = SYSTEM_USER
        now().apply {
            createdDate = this
            lastModifiedDate = this
        }
    }

    val defaultUser = User(
        login = defaultAccount.login,
        password = defaultAccount.password,
        firstName = defaultAccount.firstName,
        lastName = defaultAccount.lastName,
        email = defaultAccount.email,
        langKey = defaultAccount.langKey,

        authorities = mutableSetOf<Authority>().apply {
            add(Authority(role = ROLE_USER))
        }
    ).apply {
        createdBy = defaultAccount.createdBy
        createdDate = defaultAccount.createdDate
        lastModifiedBy = defaultAccount.lastModifiedBy
        lastModifiedDate = defaultAccount.lastModifiedDate
    }

    val admin = User(
        login = adminAccount.login,
        password = adminAccount.password,
        firstName = adminAccount.firstName,
        lastName = adminAccount.lastName,
        email = adminAccount.email,
        langKey = adminAccount.langKey,

        authorities = mutableSetOf<Authority>().apply {
            add(Authority(role = ROLE_USER))
            add(Authority(role = ROLE_ADMIN))
        }
    ).apply {
        createdBy = adminAccount.createdBy
        createdDate = adminAccount.createdDate
        lastModifiedBy = adminAccount.lastModifiedBy
        lastModifiedDate = adminAccount.lastModifiedDate
    }

    val userTest1 = User(
        login = userTest1Account.login,
        password = userTest1Account.password,
        firstName = userTest1Account.firstName,
        lastName = userTest1Account.lastName,
        email = userTest1Account.email,
        langKey = DEFAULT_LANGUAGE,

        authorities = mutableSetOf<Authority>().apply {
            add(Authority(role = ROLE_USER))
        }
    ).apply {
        createdBy = SYSTEM_USER
        lastModifiedBy = SYSTEM_USER
        now().apply {
            createdDate = this
            lastModifiedDate = this
        }
    }

    val userTest2 = User(
        login = userTest2Account.login,
        password = userTest2Account.password,
        firstName = userTest2Account.firstName,
        lastName = userTest2Account.lastName,
        email = userTest2Account.email,
        langKey = DEFAULT_LANGUAGE,
        authorities = mutableSetOf<Authority>().apply {
            add(Authority(role = ROLE_USER))
        }
    ).apply {
        createdBy = SYSTEM_USER
        lastModifiedBy = SYSTEM_USER
        now().apply {
            createdDate = this
            lastModifiedDate = this
        }
    }

    val userTest3 = User(
        login = userTest3Account.login,
        password = userTest3Account.password,
        firstName = userTest3Account.firstName,
        lastName = userTest3Account.lastName,
        email = userTest3Account.email,
        langKey = DEFAULT_LANGUAGE,
        authorities = mutableSetOf<Authority>().apply {
            add(Authority(role = ROLE_USER))
        }
    ).apply {
        createdBy = SYSTEM_USER
        lastModifiedBy = SYSTEM_USER
        now().apply {
            createdDate = this
            lastModifiedDate = this
        }
    }
    val users = listOf(
        admin, defaultUser, userTest1, userTest2, userTest3
    )
}

@Suppress("unused")
val writers = listOf(
    "Karl Marx",
    "Jean-Jacques Rousseau",
    "Victor Hugo",
    "Platon",
    "René Descartes",
    "Socrate",
    "Homère",
    "Paul Verlaine",
    "Claude Roy",
    "Bernard Friot",
    "François Bégaudeau",
    "Frederic Lordon",
    "Antonio Gramsci",
    "Georg Lukacs",
    "Franz Kafka",
    "Arthur Rimbaud",
    "Gérard de Nerval",
    "Paul Verlaine",
    "Dominique Pagani",
    "Rocé",
    "Chrétien de Troyes",
    "François Rabelais",
    "Montesquieu",
    "Georg Hegel",
    "Friedrich Engels",
    "Voltaire",
    "Michel Clouscard"
)

@Suppress("unused")
fun nameToLogin(userList: List<String>): List<String> = userList.map {
    stripAccents(it.lowercase().replace(oldChar = ' ', newChar = '.'))
}