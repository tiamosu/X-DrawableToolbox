package top.defaults.drawabletoolboxapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<RecyclerView>(R.id.drawableSpecList)
        val layoutManager = LinearLayoutManager(this)
        list.layoutManager = layoutManager
        val adapter = DrawableSpecAdapter(samples(this))
        list.adapter = adapter
    }
}
