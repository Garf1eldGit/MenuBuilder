package pet.project.menubuilder.tools.logger

import android.util.Log

private const val DEFAULT_TAG = "pet.project.menubuilder"

object Logger {

    fun log(tag: String = DEFAULT_TAG, value: String) {
        Log.d(tag, value)
    }
}