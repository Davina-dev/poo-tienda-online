package Aplicación

import Dominio.Entidades.Producto

class BuscarProductos( val repoProductos:RepositorioProductos) {



  fun ejecutarBusquedaPorReferencia(referenciaUsuario:String):MutableList<Producto>{
      return repoProductos.traerProductosPorReferencia(referenciaUsuario)
  }


/*
    fun buscarPorPrecio (precio:Double):List<Producto>{
        return productos.filter { it.precioProducto <= precio}
    }

 */

}