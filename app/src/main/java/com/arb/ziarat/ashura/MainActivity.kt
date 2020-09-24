package com.arb.ziarat.ashura

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arb.ziarat.ashura.adapter.AdapterMainRecy
import com.arb.ziarat.ashura.dataClass.MyDataClass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fa = resources.getStringArray(R.array.array_fa)
        val er = resources.getStringArray(R.array.array_er)

        val list = listOf(
            MyDataClass(er[0], fa[0]),
            MyDataClass(er[1], fa[1]),
            MyDataClass(er[2], fa[2]),
            MyDataClass(er[3], fa[3]),
            MyDataClass(er[4], fa[4]),
            MyDataClass(er[5], fa[5]),
            MyDataClass(er[6], fa[6]),
            MyDataClass(er[7], fa[7]),
            MyDataClass(er[8], fa[8]),
            MyDataClass(er[9], fa[9]),
            MyDataClass(er[10], fa[10]),
            MyDataClass(er[11], fa[11]),
            MyDataClass(er[12], fa[12]),
            MyDataClass(er[13], fa[13]),
            MyDataClass(er[14], fa[14]),
            MyDataClass(er[15], fa[15]),
            MyDataClass(er[16], fa[16]),
            MyDataClass(er[17], fa[17]),
            MyDataClass(er[18], fa[18]),
            MyDataClass(er[19], fa[19]),
            MyDataClass(er[20], fa[20]),
            MyDataClass(er[21], fa[21]),
            MyDataClass(er[22], fa[22]),
            MyDataClass(er[23], fa[23]),
            MyDataClass(er[24], fa[24]),
            MyDataClass(er[25], fa[25]),
            MyDataClass(er[26], fa[26]),
            MyDataClass(er[27], fa[27]),
            MyDataClass(er[28], fa[28]),
            MyDataClass(er[29], fa[29]),
            MyDataClass(er[30], fa[30]),
            MyDataClass(er[31], fa[31]),
            MyDataClass(er[32], fa[32]),
            MyDataClass(er[33], fa[33]),
            MyDataClass(er[34], fa[34]),
            MyDataClass(er[35], fa[35]),
            MyDataClass(er[36], fa[36]),
            MyDataClass(er[37], fa[37]),
            MyDataClass(er[38], fa[38])

        )

        rec_main_list.layoutManager = LinearLayoutManager(this)
        rec_main_list.adapter = AdapterMainRecy(list)



    }
}