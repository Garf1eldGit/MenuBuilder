package pet.project.menubuilder.data.api.db

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import pet.project.menubuilder.tools.logger.Logger

/**

Пример использования
Создание ссылки на бд
        private val db: Database = DbFactory.getStorage()

Отправка данных
        db.putData("123123121")

 Подписка на получение данных
            db.getData(object : OnDataChanged {
                override fun onChanged(json: String) {}
                })
            }
 */
internal class FireBaseDataStorageImpl(private val database: DatabaseReference) :
    Database {

    override fun putData(json: String) {
        database.setValue(json)
    }

    override fun getData(listener: OnDataChanged) {
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onCancelled(error: DatabaseError) {
                Logger.log("Failed to read value.", error.toException().message!!)
            }

            override fun onDataChange(snapshot: DataSnapshot) {
                listener.onChanged(snapshot.value.toString())
            }
        })
    }
}