import Aplicación.GestionStock
import Aplicación.ListarProductos
import Infraestructura.FormatoStock
import Infraestructura.PantallaTienda
import indraestructura.Data.DataStock

fun main(args: Array<String>) {

    // funcionalidad 1: Mostrar catálogo
    val repositorioProductos: DataStock = DataStock()
    var miGestionStock : GestionStock = GestionStock(repositorioProductos)
    var formatoStock = FormatoStock()
    val listarProductos = ListarProductos(repositorioProductos)
    val pantallaTienda: PantallaTienda = PantallaTienda(formatoStock, listarProductos )
    pantallaTienda.mostrar()

}