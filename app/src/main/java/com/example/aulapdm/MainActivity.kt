package com.example.aulapdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.aulapdm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalcular.setOnClickListener(this)
        binding.imageButton.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        if (view != null) {
            if(view.id == R.id.button_calcular){
                calcular()
            }
            if(view.id == R.id.imageButton){

                voltar()
            }
        }
    }


    private fun calcular(){

        val distance = binding.editDistance.text.toString().toFloat()
        val preco = binding.editPreco.text.toString().toFloat()
        val autonomia = binding.editAutonomia.text.toString().toFloat()

        val total = (distance * preco)/autonomia

        binding.textResultado.text = total.toString()
    }

    private fun voltar(){

        var telaVoltar = Intent(this, MainActivity2::class.java)
        startActivity(telaVoltar)

    }


}
