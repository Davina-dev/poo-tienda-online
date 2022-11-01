package Infraestructura

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

    fun aplicarFormatoDetalladoProducto(producto:Producto):String {
        var productosFormateados = ""

            productosFormateados += ("${producto.imgProducto} \n" +
                    "💰 Price: ${producto.precioProducto} €.\n" +
                    "Reference: ${producto.referenciaProducto} \n" +
                    "<UNITS_IN_STOCK> left.\n" +
                    "\n" +
                    "SUMMARY: \n" +
                    "${producto.atributosDestacados} \n" +
                    "\n" +
                    "DESCRIPTION: \n" +
                    "${producto.descripcionProducto} \n")

        return productosFormateados
    }



}