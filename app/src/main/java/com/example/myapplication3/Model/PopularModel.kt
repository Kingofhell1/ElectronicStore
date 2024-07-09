package com.example.myapplication3.Model
import android.widget.ImageView
class PopularModel {
    private var technicImage : Int? = null
    private var technicName : String = ""
    private var technicPrice : String = ""

    constructor()
    constructor(technicImage: Int?, technicName: String, technicPrice: String){
        this.technicImage = technicImage
        this.technicName = technicName
        this.technicPrice = technicPrice
    }
     fun getTechnicImage() :  Int?{
        return technicImage
    }
     fun getTechnicName() :  String{
        return technicName
    }
     fun getTechnicPrice() :  String{
        return technicPrice
    }
     fun setTechnicImage(technicImage: Int?){
        this.technicImage = technicImage
    }
     fun setTechnicName(technicName: String){
        this.technicName = technicName
    }
     fun setTechnicPrice(technicPrice: String){
        this.technicPrice = technicPrice
    }


}