package pet.project.menubuilder.data.api.db

/**
 * Базовый интерфейс для доступа к данным.
 * Пользователь не задумывается над реализацией того как работать с данными
 */
interface Database {

    fun putData(json: String)
    fun getData(listener : OnDataChanged)
}