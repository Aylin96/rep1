import java.util.Scanner;
public class Area {

double Base;
double Altura;
double Area;

Scanner L = new Scanner (System.in);

public Area()
{
Base = 0;
Altura = 0;
Area = 0;
}

public void leerBase()
{
System.out.println(“Escribe la Base del Triangulo:”);
Base = L.nextDouble();
}

public void leerAltura()
{
System.out.println(“Escribe la Altura del Triangulo:”);
Altura = L.nextDouble();
}

public void Area()
{
Area = Base * Altura / 2;
}

public void Mostrar()
{
System.out.println(“La Base del triangulo es:” + Base);
System.out.println(“La Altura del triangulo es:” + Altura);
System.out.println(“El Area del Triangulo es:” + Area);
}

}

 

 

public class PruebaTriangulo {

public static void main (String arg[])
{

Area A = new Area();

A.leerBase();
A.leerAltura();
A.Area();
A.Mostrar();

}

}