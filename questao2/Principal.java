public class Principal {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();

        System.out.println("=== RETANGULO ===");

        System.out.println("Length inicial: " + retangulo.getLength());
        System.out.println("Width inicial: " + retangulo.getWidth());

        retangulo.setLength(10);
        retangulo.setWidth(5);

        System.out.println();
        System.out.println("Length: " + retangulo.getLength());
        System.out.println("Width: " + retangulo.getWidth());

        System.out.println("Area: " + retangulo.calcularArea());
        System.out.println("Perimetro: " + retangulo.calcularPerimetro());

        System.out.println();
        System.out.println("=== TESTES DE VALIDACAO ===");

        retangulo.setLength(-5);
        System.out.println("Apos setLength(-5): " + retangulo.getLength());

        retangulo.setWidth(20);
        System.out.println("Apos setWidth(20): " + retangulo.getWidth());

        retangulo.setLength(15);
        System.out.println("Apos setLength(15): " + retangulo.getLength());
    }
}
