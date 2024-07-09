package com.example.myapplication3

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication3.Adapter.ImagesSliderAdapter
import com.example.myapplication3.Adapter.PopularAdapter
import com.example.myapplication3.Model.PopularModel


class HomeFragment : Fragment() {

    private lateinit var viewPager2 : ViewPager2
    private lateinit var adapter: ImagesSliderAdapter
    private lateinit var imageList: ArrayList<Int>
    private lateinit var handler: Handler
    private lateinit var adapterPopular: PopularAdapter
     private lateinit var listPopular: ArrayList<PopularModel>
     private lateinit var homeRv: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        viewPager2 = view.findViewById(R.id.ImageSlider)

        homeRv = view.findViewById(R.id.home_RV)

        listPopular = ArrayList()
        listPopular.add(PopularModel(R.drawable.realmeone, "Realme", "30000p"))
        listPopular.add(PopularModel(R.drawable.samsungone, "Samsung", "50000p"))
        listPopular.add(PopularModel(R.drawable.samsungs22, "Samsung Galaxy S22", "100000p"))
        listPopular.add(PopularModel(R.drawable.lenovoinine, "Lenovo Legion", "230000p"))
        listPopular.add(PopularModel(R.drawable.lenovofivepro, "Lenovo legion", "130000p"))
        listPopular.add(PopularModel(R.drawable.asusrog, "Asus Rog", "240000p"))
        listPopular.add(PopularModel(R.drawable.realmeone, "Realme", "30000p"))
        listPopular.add(PopularModel(R.drawable.samsungone, "Samsung", "50000p"))
        listPopular.add(PopularModel(R.drawable.samsungs22, "Samsung Galaxy S22", "100000p"))
        listPopular.add(PopularModel(R.drawable.lenovoinine, "Lenovo Legion", "230000p"))
        listPopular.add(PopularModel(R.drawable.lenovofivepro, "Lenovo legion", "130000p"))
        listPopular.add(PopularModel(R.drawable.asusrog, "Asus Rog", "240000p"))

        adapterPopular = PopularAdapter(requireContext(), listPopular)
        homeRv.layoutManager = LinearLayoutManager(requireContext())
        homeRv.adapter = adapterPopular

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        setTransfarmer()
        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                handler.removeCallbacks(runnable)
                handler.postDelayed(runnable, 2000)
            }
        })
    }
    private val runnable = Runnable {
        viewPager2.currentItem = viewPager2.currentItem + 1
    }

    private fun setTransfarmer() {
        val trasformer = CompositePageTransformer()
        trasformer.addTransformer(MarginPageTransformer(10))
        trasformer.addTransformer{page, position ->
            val r = 1 - Math.abs(position)
            page.scaleY = 0.85f + r * 0.14f
        }
        viewPager2.setPageTransformer(trasformer)
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(runnable)
    }

    override fun onResume() {
        super.onResume()
        handler.postDelayed(runnable, 2000)
    }

    private fun init() {
        imageList = ArrayList()
        adapter = ImagesSliderAdapter(requireContext(), imageList, viewPager2)
        handler = Handler(Looper.myLooper()!!)
        imageList.add(R.drawable.phonexiaomi)
        imageList.add(R.drawable.lenovolegion)
        imageList.add(R.drawable.realme)
        imageList.add(R.drawable.samsung)
        viewPager2.adapter = adapter
        viewPager2.offscreenPageLimit = 3
        viewPager2.clipToPadding = false
        viewPager2.clipChildren = false
        viewPager2.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

    }


}