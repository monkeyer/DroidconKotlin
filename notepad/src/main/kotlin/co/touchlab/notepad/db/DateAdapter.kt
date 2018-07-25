package co.touchlab.notepad.db

import co.touchlab.notepad.utils.Date
import co.touchlab.notepad.utils.DateFormatHelper
import co.touchlab.notepad.utils.SESSIONIZE_DATE_FORMAT
import com.squareup.sqldelight.ColumnAdapter

class DateAdapter : ColumnAdapter<Date, String> {
    val formatter = DateFormatHelper(SESSIONIZE_DATE_FORMAT)
    override fun encode(value: Date) = formatter.format(value)
    override fun decode(databaseValue: String) = formatter.toDate(databaseValue)
}