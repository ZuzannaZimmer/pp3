public class SurfaceAreaTest {
    public static void main(String[] args) {
        System.out.print("Rectangle area (5,2) is ");
        System.out.println(SurfaceArea.rectangle(5,2));

        System.out.print("Pole koła o średnicy 3 wynosi: ");
        System.out.println(SurfaceArea.circle(3));

        System.out.print("Pole trójkąta wynosi: ");
        System.out.println(SurfaceArea.triangle(3, 4));

        System.out.print("Pole prostopadłościanu wynosi: ");
        System.out.println(SurfaceArea.cuboid(3, 4, 5));

        System.out.print("Pole kuli wynosi: ");
        System.out.println(SurfaceArea.sphere(3));

        System.out.print("Pole stożka wynosi: ");
        System.out.println(SurfaceArea.cone(3, 4));
    }

}
