import Aplicación.BuscarProductos
import Aplicación.ListarProductos
import Infraestructura.FormatoStock
import Infraestructura.PantallaTienda
import indraestructura.Data.DataStock

fun main(args: Array<String>) {
    val repositorioProductos: DataStock = DataStock()
    var formatoStock:FormatoStock = FormatoStock()
    val listarProductos :ListarProductos = ListarProductos(repositorioProductos)
    val buscarProductos:BuscarProductos =BuscarProductos(repositorioProductos)
    val pantallaTienda: PantallaTienda = PantallaTienda(formatoStock, listarProductos, buscarProductos)





    // funcionalidad 1: Mostrar catálogo
       pantallaTienda.mostrarCatalogo()

    //funcionalidad 2 : Ver Detalles Del Producto
    val referenciaProducto = pantallaTienda.preguntarReferencia()
        pantallaTienda.mostrarProductodetallado(referenciaProducto)
        pantallaTienda.siguientepasoBuscaReferencia()

    // funcionalidad 3: filtrar por precio
    val precioProducto = pantallaTienda.preguntarPrecio()
        pantallaTienda.mostrarProducto(precioProducto)
        pantallaTienda.siguientepasoBuscaPrecio()

}


