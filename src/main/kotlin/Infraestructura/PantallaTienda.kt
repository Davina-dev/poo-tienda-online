package Infraestructura

import Aplicación.ListarProductos

class PantallaTienda (val formatoStock: FormatoStock, val listarProductos: ListarProductos) {

    fun verTiendaOnline(){


    }

    fun mostrar() {
       val productos = listarProductos.ejecutarListado()
       var productosString:String = ""

        for (producto in productos){
          productosString += formatoStock.aplicarFormatoProducto(producto)
        }
        println(productosString)
    }
}