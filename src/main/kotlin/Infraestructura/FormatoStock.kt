package Infraestructura

import Aplicación.GestionStock
import Dominio.Entidades.Producto

class FormatoStock () {

    fun aplicarFormatoProducto(producto: Producto): String {
        return ("${producto.imgProducto} \n" +
                "💰 Price: ${producto.precioProducto} €.\n" +
                "Reference: ${producto.referenciaProducto} \n"+
                "<UNITS_IN_STOCK> left.\n" +
                "\n"+
                "SUMMARY: \n" +
                "${producto.atributosDestacados} \n" +
                "\n"+
                "DESCRIPTION: \n" +
                "${producto.descripcionProducto}")
    }

    fun aplicarFormatoDetalladoProducto(listaProductos: List <Producto>):String {
        var productosFormateados = ""
        for (producto in listaProductos) {
            productosFormateados += ("${producto.imgProducto} \n" +
                    "\uD83D\uDCB0 Price: ${producto.precioProducto} €.\n" +
                    "2. Keep browsing products \n" +
                    "Reference: ${producto.referenciaProducto} \n" +
                    "💰 Price: ${producto.precioProducto} €.\n" +
                    "Reference: ${producto.referenciaProducto} \n" +
                    "<UNITS_IN_STOCK> left.\n" +
                    "\n" +
                    "SUMMARY: \n" +
                    "${producto.atributosDestacados} \n" +
                    "\n" +
                    "DESCRIPTION: \n" +
                    "${producto.descripcionProducto} \n")
        }
        return productosFormateados
    }



}