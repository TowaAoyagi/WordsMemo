package app.aoyagi.makkan.wordsmemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apple = Word(R.drawable.apple, "Apple")
        val google = Word(R.drawable.google, "Google")
        val twitter = Word(R.drawable.twitter, "Twitter")

        val word = arrayOf(apple, google, twitter)

        for (i in word.indices) {
            makeView(word[i])
        }

//        container.addView(nameTextView)

    }

    private fun makeView(word: Word) {
        val nameTextView = TextView(applicationContext)
        val linear = LinearLayout(this.applicationContext)
        val wordImage = ImageView(this)
        linear.orientation = LinearLayout.HORIZONTAL
        wordImage.setImageResource(word.resId)
        nameTextView.text = word.name
        nameTextView.textSize = 36F
        linear.addView(wordImage)
        linear.addView(nameTextView)
        container.addView(linear)
    }
}
