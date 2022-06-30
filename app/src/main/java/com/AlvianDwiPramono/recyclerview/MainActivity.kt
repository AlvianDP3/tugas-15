package com.AlvianDwiPramono.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Adapter
import com.AlvianDwiPramono.recyclerview.adapter.AdapterTeamBola
import com.AlvianDwiPramono.recyclerview.databinding.ActivityMainBinding
import com.AlvianDwiPramono.recyclerview.model.Pemain


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(
            Pemain(nama:
            "Thibaut Courtois",
            R.drawable.courtois,
            posisi: "Penjaga Gawang", tinggi: "2.00 m", tempatlahir: "bree (Belgia)", tgllahir: "11 Mei 1992"))
        listPemain.add(
            Pemain(nama:
            "Karim Benzema",
            R.drawable.benzema,
            posisi: "Penyerang", tinggi: "1,85 m", tempatlahir: "Lyon (Perancis)", tgllahir: "19 Desember 1987"))
        listPemain.add(
            Pemain(nama:
            "Marcelo Vieira da Silva",
            R.drawable.marcello,
            posisi: "Belakang", tinggi: "1,74 m", tempatlahir: "Rio de Janeiro (Brasil)", tgllahir: "12 Mei 1988"))
        listPemain.add(
            Pemain(nama:
            "Sergio Ramos García",
            R.drawable.ramos,
            posisi: "Belakang", tinggi: "1,84 m", tempatlahir: "Camas (Sevilla)", tgllahir: "30 Maret 1986"))
        listPemain.add(
            Pemain(nama:
            "Zinedine Yazid Zidane",
            R.drawable.zidan,
            posisi: "Pelatih", tinggi: "1,85 m", tempatlahir: "Marseille (Prancis)", tgllahir: "23 Juni 1972"))

        binding.list.adapter =
            AdapterTeamBola(context: this, ListPemain, object : AdapterTeamBola.OnClickListener {
            override fun detailData(item: Pemain?) {
                TODO(reason: "Not yet implemented")
            }

        })
        Dialog(context: this@MainActivity).Apply {
            this: Dialag
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            setCancelable(true)
            setContentView(R.layout.detail_data_pemain)

            val image = this.findViewById<ImageView>(R.id.image_pemain)
            val nama = this.findViewById<TextView>(R.id.txt_namapemain)
            val posisi = this.findViewById<TextView>(R.id.txt_posisi)
            val tinggi = this.findViewById<TextView>(R.id.txt_tinggibadan)
            val tempatlahir = this.findViewById<TextView>(R.id.txt_tempatlahir)
            val tgllahir = this.findViewById<TextView>(R.id.txt_tgllahir)
            val btn = this.findViewById<Button>(R.id.btnClose)

            image.setImageResource(item?.foto ?: 0)
            nama.text = "${item?.nama}"
            posisi.text = "${item?.posisi}"
            tinggi.text = "${item?.tinggi}"
            tempatlahir.text = "${item?.tempatlahir}"
            tgllahir.text = "${item?.tgllahir}"

            btn.setOnClickListener {
                it: View!
                this.dismiss()
            }.show()

         }
}