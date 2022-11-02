package Infraestructura

import Aplicación.BuscarProductos
import Aplicación.ListarProductos
import java.util.*

class PantallaTienda (private val formatoStock: FormatoStock, private val listarProductos: ListarProductos, private val buscarProductos: BuscarProductos ){



    fun mostrarCatalogo() {
       val productos = listarProductos.ejecutarListado()
       var productosString:String = ""

        for (producto in productos){
          productosString += formatoStock.aplicarFormatoProducto(producto)
        }
        println(productosString)
    }

    fun mostrarProductodetallado(referenciaProducto:String) {
        val productosConReferencia = buscarProductos.ejecutarBusquedaPorReferencia(referenciaProducto)
        for(producto in productosConReferencia){
            println( formatoStock.aplicarFormatoDetalladoProducto(producto) )
        }
    }

    fun mostrarProducto(precioProducto: Double){
        val productosConPrecio = buscarProductos.buscarPorPrecio(precioProducto)
        for (producto in productosConPrecio){
            println( formatoStock.aplicarFormatoProducto(producto))
        }

    }

 // ¿separar input de output?
   fun preguntarReferencia(): String{
        println("Which product do you like to explore?\n Enter a produt's reference:\n")
        val referenciaProducto = readln().uppercase(Locale.getDefault())
        return referenciaProducto
    }

    fun siguientepasoBuscaReferencia():String{
        println("""
            ¿What would you like to do next?
                1. Add product to cart
                2. Keep browsing products
        """.trimIndent()
        )
        val siguientePaso = readln().uppercase(Locale.getDefault())
        return siguientePaso
    }
    fun preguntarPrecio():Double{
        print("Browse products with prices lowe than:")
        val precioProducto = readln().toDouble()
        return precioProducto
    }
    fun siguientepasoBuscaPrecio():String{
        println("""
            ¿What would you like to do next?
                2. Keep browsing products
                3. See a product's details.
        """.trimIndent()
        )
        val siguientePaso = readln().toInt()
        return siguientePaso.toString()
    }

}