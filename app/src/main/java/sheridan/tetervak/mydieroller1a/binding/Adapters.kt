package sheridan.tetervak.mydieroller1a.binding

import android.widget.TextView
import androidx.databinding.BindingAdapter
import sheridan.tetervak.mydieroller1a.R

@BindingAdapter("dieValue")
fun bindDieValue(textView: TextView, dieValue: Int?) {
    if (dieValue is Int) {
        textView.text =
            if (dieValue > 0) {
                dieValue.toString()
            } else {
                textView.resources.getString(R.string.space)
            }
    }
}