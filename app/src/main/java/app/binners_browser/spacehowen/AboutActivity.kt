package app.binners_browser.spacehowen

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        //actionbar
        supportActionBar?.setTitle("Información")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //
        btnWeb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://spacehowen.com"))
            startActivity(intent)
        }
        btnCode.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/spacehowen/binners-browser"))
            startActivity(intent)
        }
        btnMail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:support@spacehowen.com"))
            startActivity(intent)
        }
    }
}