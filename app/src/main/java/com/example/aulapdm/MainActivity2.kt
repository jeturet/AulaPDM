package com.example.aulapdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.aulapdm.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        if (view != null) {
            if(view.id == R.id.button2){
                IrParaGasolina()
            }
        }
    }

    private fun IrParaGasolina(){

        var telaGasolina = Intent(this, MainActivity::class.java)
        startActivity(telaGasolina)

    }

}