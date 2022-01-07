package org.techtown.recyclerviewwithoutbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import org.techtown.recyclerviewwithoutbinding.adapter.UserAdapter
import org.techtown.recyclerviewwithoutbinding.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val users : ArrayList<User> = ArrayList()
        //val users :ArrayList<User>?=null
        // 이렇게 쓴다면?
        val users : ArrayList<User> = ArrayList()

//        getDrawable(R.drawable.ic_baseline_boy_24)?.let { User(it,"user1","userid1") }?.let {
//            users.add(
//                it
//            )
//        }
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user2","userid2"))
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user3","userid3"))
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user4","userid4"))
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user5","userid5"))
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user6","userid6"))
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user7","userid7"))
        users.add(User(getDrawable(R.drawable.ic_baseline_boy_24)!!,"user8","userid8"))


        val adapter = UserAdapter(users)
        findViewById<RecyclerView>(R.id.recyclerView).adapter = adapter
    }
}
