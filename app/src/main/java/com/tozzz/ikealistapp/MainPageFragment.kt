package com.tozzz.ikealistapp

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.tozzz.ikealistapp.databinding.FragmentMainPageBinding

class MainPageFragment : Fragment() {
    private lateinit var design:FragmentMainPageBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        design = FragmentMainPageBinding.inflate(inflater, container, false)

        design.recyclerView.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)

        val productList = ArrayList<Products>()
        val p1 = Products(1,"MÖRBYLANGA","table1",8.499,"kahverengi")
        val p2 = Products(2,"NORDEN","table2",2.599,"beyaz")
        val p3 = Products(3,"INGATORP","table3",3.599,"beyaz")
        val p4 = Products(4,"INGATORP","table4",1.599,"beyaz")
        val p5 = Products(5,"GLIVARP","table5",3.299,"kahverengi")
        val p6 = Products(6,"INGATORP","table6",1.599,"kahverengi")
        val p7 = Products(7,"DANDERYD","table7",2.799,"siyah")

        productList.add(p1)
        productList.add(p2)
        productList.add(p3)
        productList.add(p4)
        productList.add(p5)
        productList.add(p6)
        productList.add(p7)

        val adapter = ProductAdapter(requireContext(),productList)
        design.recyclerView.adapter = adapter

        return design.root
    }


}