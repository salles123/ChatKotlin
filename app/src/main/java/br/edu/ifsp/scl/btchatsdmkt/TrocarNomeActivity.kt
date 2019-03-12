package br.edu.ifsp.scl.btchatsdmkt

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import android.content.Intent
import android.widget.EditText


class  TrocarNomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trocar_nome)
    }

    fun salvarNome(view: View) {
        val data:Intent = Intent()

        if (R.id.salvar_nome_button === view.getId()) {
            var input : EditText = findViewById(R.id.novo_nome_text_view);
            var nome : String = input.text.toString()

            var  parans: Bundle = Bundle();

            parans.putString("nome", nome);

            data.putExtras(parans);

            setResult(Activity.RESULT_OK, data)

            finish()
        }
    }


}