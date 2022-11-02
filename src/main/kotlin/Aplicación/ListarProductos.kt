package Aplicación

import Dominio.Entidades.Producto

class ListarProductos(val repoProductos:RepositorioProductos) {

    fun ejecutarListado():MutableList<Producto>{
        return repoProductos.traerProductos()
    }

}