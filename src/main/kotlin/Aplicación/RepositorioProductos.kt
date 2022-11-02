package Aplicación

import Dominio.Entidades.Producto

interface RepositorioProductos {
    fun traerProductos():MutableList<Producto>

    fun traerProductosPorReferencia (referencia: String): MutableList<Producto>

    fun traerProductosPorPrecio(precio:Double): MutableList<Producto>

}