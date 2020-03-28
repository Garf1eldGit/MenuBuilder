package pet.project.menubuilder.data.api.db

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

/**
 * Фабрика для удобства создания обьектов бд
 */
object DbFactory {

    fun getStorage(): Database {
        return FireBaseDataStorageImpl(
            Firebase.database.getReference(
                "message"
            )
        )
    }
}