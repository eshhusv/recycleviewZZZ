package com.example.recycleviewzzz

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.recycleviewzzz.databinding.ActivityMainBinding
import java.time.LocalDate
import java.util.Calendar
import java.util.Date

class MainActivity : AppCompatActivity() {
    var products = ArrayList<Product>()
    private lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setInitialData();
        val recyclerView = binding.list
// создаем адаптер
        val adapter = ProductAdapter(this,R.layout.list_view,products)
// устанавливаем для списка адаптер
        recyclerView.adapter = adapter
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun setInitialData() {
        products.add(Product(R.drawable.img1,"Албания", 1, 200000000f, "Мурсик", Calendar.getInstance().time))
        products.add(Product(R.drawable.img2,"Джек", 1, 2800f, "Мурсик", Calendar.getInstance().time))
        products.add(Product(R.drawable.img3,"Васько", 0, 1f, "Мурсик", Calendar.getInstance().time))
        products.add(Product(R.drawable.img4,"Тигран", 1, 21312f, "Мурсик", Calendar.getInstance().time))
    }
}