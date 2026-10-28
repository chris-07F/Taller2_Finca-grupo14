package semana2.finca;

public record Animal(String codigo, String especie, double pesoKg,
                     double precioPorKg) implements Activo {
    public Animal {
        // Reto del grupo: validación del peso y precio
        if (pesoKg <= 0 || precioPorKg < 0) {
            throw new IllegalArgumentException("El peso en kg debe ser mayor a cero y el precio no puede ser negativo");
        }
    }
}