
public class EjemploObjetos implements Cloneable {
    public String nombre;

    public EjemploObjetos(String nombre) {
        this.nombre = nombre;
        
    }

    // Sobrescribimos el metodo toString() para personalizar la representacion 

    @Override
    public String toString() {
        return "EjemploObjectos{nombre :" + nombre; }
    
    
   
        
        
        // Sobrescribimos el metodo equals
        @Override
        public boolean equals(Object obj) {
        if (this == obj) return true; // Si son el mismo objeto, son iguales
        if ( obj == null || getClass() != obj.getClass()) return false; // Comproba
        EjemploObjetos that = (EjemploObjetos) obj;
        return this.nombre.equals(that.nombre);
    }

    // Sobrescribimos hashCode() para generar un codigo hash basado en el atributo "nombre";
    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    // Implementacion de clone() para hacer una copia del objeto
    @Override
    public EjemploObjetos clone() throws CloneNotSupportedException {
        return (EjemploObjetos) super.clone();
    }



    public static void main(String[] args) throws CloneNotSupportedException {
        EjemploObjetos obj1 = new EjemploObjetos("Santiago");
        EjemploObjetos obj2 = new EjemploObjetos("Maria");
        EjemploObjetos obj3 = obj1.clone(); // Clonacion de objeto 1

        //toString()
        System.out.println("toString() :" + obj1.toString());

        // equals()

        System.out.println("obj1.equals(obj2) :" + obj1.equals(obj2));

        //HashCode
        System.out.println("hashCode de obj1 :" + obj1.hashCode());
        System.out.println("hashCode de obj2 :" + obj2.hashCode());


        // Clone()

        System.out.println("Objeto clonado (obj3)" + obj3);

        //getClass()

        System.out.println("Clase del objeto1 :" + obj1.getClass().getName());
        
        
    }
}