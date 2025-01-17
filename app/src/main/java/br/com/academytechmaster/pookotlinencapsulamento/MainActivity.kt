package br.com.academytechmaster.pookotlinencapsulamento

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtTitulo : TextView
    lateinit var txtAutor : TextView
    lateinit var txtEditora : TextView
    lateinit var txtLocalizacao : TextView
    lateinit var txtPagina : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        iniciarComponentesDoLayout()

        criarObjetos()

    }



    private fun iniciarComponentesDoLayout() {

         txtTitulo = findViewById<TextView>(R.id.txtTituloLivro)
         txtAutor = findViewById<TextView>(R.id.txtAutor)
         txtEditora = findViewById<TextView>(R.id.txtEditora)
         txtLocalizacao = findViewById<TextView>(R.id.txtLocalizacao)
         txtPagina = findViewById<TextView>(R.id.txtPagina)

    }

    private fun criarObjetos() {

        var livro = Livro(
            "Kotlin",
            "Pedro",
            "Editora Scheffer",
            "Brazil",
            140
        )

        val titulo = livro.titulo
        var autor = livro.autor
        var editora = livro.editora
        var localizacao = livro.localizacao
        var paginas = livro.paginas

        Log.i("POO","Obj Livro: Autor: "+autor);
        Log.i("POO","Obj Livro: Titulo: "+titulo);
        Log.i("POO","Obj Livro: Editora: "+editora);
        Log.i("POO","Obj Livro: Pag: "+paginas);
        Log.i("POO","Obj Livro: Localização: "+localizacao);

        txtTitulo.setText(titulo)
        txtAutor.setText(livro.autor)
        txtEditora.setText(livro.editora)
        txtLocalizacao.setText(localizacao)
        txtPagina.setText(livro.paginas.toString())


    }

}