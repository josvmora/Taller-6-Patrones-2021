package flyweight;

public class ProductoStorage {//contiene un factory y almacenamiento de objetos, 
							//tambien pueden ser clases separadas
static ProductoIn productosIn[];
public Producto productos[];


static method getProductoIn(marca,estado,garantia,precio,serial) {//el metodo actua como fatory y decide
	tipo = ProductoIn.find(marca,estado,garantia,precio,serial)//si usar objetos existentes flyweight o
			if(tipo == null) {									//crear uno nuevo
				tipo = new ProductoIn(marca,estado,garantia,precio,serial)
				productosIn.add(tipo);
			}
	return producto;
}

public void añadirProducto(marca,estado,garantia,precio,serial,tipoProducto,imagenProducto) {
	tipo = getProductoIn(marca,estado,garantia,precio,serial);
	producto= new Producto(tipoProducto,imagenProducto,tipo);
	producto.add(productos);
}
	
}
