package Aplicación

import Dominio.Entidades.Producto

interface RepositorioProductos {
    fun traerProductos():MutableList<Producto>

}