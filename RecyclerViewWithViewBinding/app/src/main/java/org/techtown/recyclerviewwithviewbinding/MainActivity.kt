package org.techtown.recyclerviewwithviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import org.techtown.recyclerviewwithviewbinding.adapter.UserAdapter
import org.techtown.recyclerviewwithviewbinding.databinding.ActivityMainBinding
import org.techtown.recyclerviewwithviewbinding.model.User

class MainActivity : AppCompatActivity() {

    // = 으로 init해주거나, lateinit붙여줘서 런타임에 초기화하도록 해야한다.
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val users : ArrayList<User> = ArrayList()
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user2","userid2"))
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user3","userid3"))
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user4","userid4"))
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user5","userid5"))
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user6","userid6"))
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user7","userid7"))
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user8","userid8"))

        binding.recyclerView.adapter = UserAdapter(users)
    }
}
