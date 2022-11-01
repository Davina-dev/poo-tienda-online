package indraestructura.Data

import Aplicación.RepositorioProductos
import Dominio.Entidades.Producto


class DataStock() :RepositorioProductos{

private val productosEnStock: MutableList<Producto> = mutableListOf<Producto>(
        Producto(
            1,
            "W2C",
            300.99,
            "With this panoramic television, your friday nights will be boring no more.\n" +
                    "The screen is composed of 14 million pixels.\n" +
                    "Thanks to its low energy consumption design, your bills will stay low.  \n",
            "Glamorous panoramic television, 13 inches",
            "\uD83D\uDCFA"
        ),
        Producto(
            2,
            "X4A",
            1003.00,
            "Untuned musical keyboard, 4 octaves",
            "Tired of your noisy neighbourgh? Play this untuned musical keyboard for two hours at home\nand your neighbour will be ready to move to a building far away from you. ",
            "\uD83C\uDFB9"
        ),
        Producto(
            3,
            "W2C",
            300.99,
            "Glamorous panoramic television, 13 inches",
            "With this panoramic television, your friday nights will be boring no more.",
            "\uD83D\uDCFA"
        ),
        Producto(
            3,
            "W2C",
            2300.99,
            "Glamorous panoramic television, 13 inches",
            "With this panoramic television, your friday nights will be boring no more.",
            "\uD83D\uDCFA"
        )
    )


    override fun traerProductos():MutableList<Producto>{
        return productosEnStock
    }
   override fun traerProductosPorReferencia (referencia: String): MutableList<Producto>{
       val listaProductosReferencia :MutableList<Producto> = mutableListOf()
        for (producto in productosEnStock){
         if(producto.referenciaProducto == referencia){
             listaProductosReferencia.add(producto)
             return listaProductosReferencia
         }
        }
       throw IllegalArgumentException ("Referencia no encontrada en DataStock")
    }

}




