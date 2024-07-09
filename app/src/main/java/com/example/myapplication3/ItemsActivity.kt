//package com.example.myapplication3
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.TextView
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//
//class ItemsActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_items)
//        val ItemList: RecyclerView = findViewById(R.id.items_id)
//        val items = arrayListOf<Item>()
//        val exit: TextView = findViewById(R.id.textView)
//        exit.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
//        items.add(Item(1, "laptop", "Игровой ноутбук Legion 9i (8th Gen, 16, Intel)\n","Жидкостное охлаждение. Настройка с помощью искусственного интеллекта. Ваше будущее уже здесь.\n" +
//                "Оптимальная производительность за счет динамического распределения энергии посредством технологий ИИ\n" +
//                "Полное погружение в атмосферу игры с 16-дюймовым дисплеем Mini-LED PureSight с разрешением 3.2K и системой настройки RGB-подсветки\n" +
//                "Доминируйте на игровой арене с помощью клавиатуры TrueStrike и технологий оптимизации Smart Engine\n" +
//                "Высочайшая производительность процессоров Intel® Core™ 13-го поколения\n" +
//                "Беспрецедентная графическая мощь видеокарты NVIDIA® GeForce RTX™","",340000))
//        items.add(Item(2, "phone", "Realme GT5 Pro","Топовая начинка позволяет играть на максимальных настройках графики\n" +
//                "Дисплей обладает рекордной яркостью в 4500 нит\n" +
//                "Камера имеет телеобъектив с 2.7-кратным оптическим зумом\n" +
//                "Корпус имеет влагозащиту по стандарту IP64\n" +
//                "Емкость батареи достигает целых 5400 мАч, которая также может заряжаться беспроводным путем","",50000))
//        items.add(Item(3, "computer", "Компьютер HYPERPC CYBER","Мощный и роскошный. Дерзкий и элегантный. Утонченный и решительный. Компьютер HYPERPC CYBER сочетает в себе контрасты и адресован тем, кто ищет для себя нечто особенное. За ярким обликом этого роскошного компьютера скрывается стремительный характер и качества, присущие истинному hi-end решению HYPERPC.","",325000))
//        ItemList.adapter = ItemsAdapter(items, this)
//        ItemList.layoutManager = LinearLayoutManager(this)
//    }
//}